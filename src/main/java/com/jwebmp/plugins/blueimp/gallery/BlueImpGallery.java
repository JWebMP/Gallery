package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.blueimp.gallery.features.BlueImpGalleryFeature;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpGalleryOptions;
import jakarta.validation.constraints.NotNull;

import static com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryClasses.*;

/**
 * The configuration blue imp gallery, to be placed on the body on a page, and referenced by the display
 * @param <J>
 */
@SuppressWarnings({"MissingClassJavaDoc", "UnusedReturnValue"})
public class BlueImpGallery<J extends BlueImpGallery<J>>
		extends DivSimple<J>
{
	/**
	 * The holder for the slides
	 */
	private final DivSimple<?> slides;
	/**
	 * The holder for the title
	 */
	private final H3<?> title;
	/**
	 * The link object for previous
	 */
	private final Link<?> prev;
	/**
	 * The link object for next
	 */
	private final Link<?> next;
	/**
	 * The link object for close
	 */
	private final Link<?> close;
	/**
	 * The link object for play/pause
	 */
	private final Link<?> playPause;
	/**
	 * The ordered list for indicator
	 */
	private final List<?, ?, ?, ?> indicator;
	/**
	 * The feature to initialize this gallery
	 */
	private final BlueImpGalleryFeature feature;
	/**
	 * The description of the current slide/image
	 */
	private Paragraph<?> description;
	
	public BlueImpGallery()
	{
		slides = new DivSimple<>().addClass(Slides)
		                          .addAttribute("aria-live", "polite");
		title = new H3<>().addClass(Title);
		prev = new Link<>().addClass(Prev)
		                   .addAttribute("aria-controls", getID())
		                   .addAttribute("aria-label", "previous slide")
		                   .addAttribute("aria-keyshortcuts", "ArrowLeft")
		;
		prev.setText("&laquo;");
		next = new Link<>().addClass(Next)
		                   .addAttribute("aria-controls", getID())
		                   .addAttribute("aria-label", "next slide")
		                   .addAttribute("aria-keyshortcuts", "ArrowRight")
		;
		
		next.setText("&raquo;");
		close = new Link<>().addClass(Close);
		close.setText("&times;")
		     .addAttribute("aria-controls", getID())
		     .addAttribute("aria-label", "close")
		     .addAttribute("aria-keyshortcuts", "Escape")
		;
		playPause = new Link<>().addClass(Play_Plause);
		playPause.addAttribute("aria-controls", getID())
		         .addAttribute("aria-label", "play slideshow")
		         .addAttribute("aria-keyshortcuts", "Space")
		         .addAttribute("aria-pressed", "false")
		         .addAttribute("role", "button")
		;
		
		indicator = new List<>(true).addClass(Indicator);

		addClass(BlueImpGalleryClasses.BlueImp_Gallery);
		feature = new BlueImpGalleryFeature(this);
		addFeature(feature);
	}

	/**
	 * Method setControls sets the controls of this BlueImpGallery object.
	 *
	 * @param enableControls the controls of this BlueImpGallery object.
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setControls(boolean enableControls)
	{
		if (enableControls)
		{
			addClass(BlueImp_Gallery_Controls);
		}
		else
		{
			removeClass(BlueImp_Gallery_Controls);
		}
		return (J) this;
	}
	
	/**
	 * Method getSlides returns the slides of this BlueImpGallery object.
	 * <p>
	 * The holder for the slides
	 *
	 * @return the slides (type DivSimple ?) of this BlueImpGallery object.
	 */
	public DivSimple<?> getSlides()
	{
		return slides;
	}
	
	/**
	 * Method getTitle returns the title of this BlueImpGallery object.
	 * <p>
	 * The holder for the title
	 *
	 * @return the title (type H3?) of this BlueImpGallery object.
	 */
	public H3<?> getTitle()
	{
		return title;
	}
	
	/**
	 * Method getPrev returns the prev of this BlueImpGallery object.
	 * <p>
	 * The link object for previous
	 *
	 * @return the prev (type Link ?) of this BlueImpGallery object.
	 */
	public Link<?> getPrev()
	{
		return prev;
	}
	
	/**
	 * Method getNext returns the next of this BlueImpGallery object.
	 * <p>
	 * The link object for next
	 *
	 * @return the next (type Link ? ) of this BlueImpGallery object.
	 */
	public Link<?> getNext()
	{
		return next;
	}
	
	/**
	 * Method getClose returns the close of this BlueImpGallery object.
	 * <p>
	 * The link object for close
	 *
	 * @return the close (type Link ?) of this BlueImpGallery object.
	 */
	public Link<?> getClose()
	{
		return close;
	}
	
	/**
	 * Method getPlayPause returns the playPause of this BlueImpGallery object.
	 * <p>
	 * The link object for play/pause
	 *
	 * @return the playPause (type Link ?) of this BlueImpGallery object.
	 */
	public Link<?> getPlayPause()
	{
		return playPause;
	}
	
	/**
	 * Method getIndicator returns the indicator of this BlueImpGallery object.
	 * <p>
	 * The ordered list for indicator
	 *
	 * @return the indicator (type List) of this BlueImpGallery object.
	 */
	public List<?, ?, ?, ?> getIndicator()
	{
		return indicator;
	}
	
	public Paragraph<?> getDescription()
	{
		return description;
	}
	
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDescription(Paragraph<?> description)
	{
		this.description = description;
		return (J) this;
	}

	/**
	 * Method preConfigure ...
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getOptions().toAttributes()
			            .forEach((key, value) ->
					            addAttribute("data-" + key, value));
			
			add(slides);
			add(title);
			add(prev);
			add(next);
			add(close);
			add(playPause);
			add(indicator);
		}
		super.preConfigure();
	}
	
	/**
	 * @see com.jwebmp.core.base.ComponentFeatureBase#getOptions()
	 */
	@Override
	@NotNull
	public BlueImpGalleryOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}
	
	/**
	 * @param options a new options object
	 * @return The output
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOptions(@NotNull BlueImpGalleryOptions<?> options)
	{
		getFeature().setOptions(options);
		return (J) this;
	}
	
	/**
	 * Method getFeature returns the feature of this BlueImpGallery object.
	 * <p>
	 * The feature to initialize this gallery
	 *
	 * @return the feature (type BlueImpGalleryFeature) of this BlueImpGallery object.
	 */
	public BlueImpGalleryFeature getFeature()
	{
		return feature;
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
