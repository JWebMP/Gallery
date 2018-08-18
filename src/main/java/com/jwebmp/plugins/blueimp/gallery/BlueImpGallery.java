package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpGalleryOptions;

import javax.validation.constraints.NotNull;

import static com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryClasses.*;

@SuppressWarnings("MissingClassJavaDoc")
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
	private final List indicator;
	/**
	 * The contents div that gets rendered.
	 * You must add this object and the contents to the parent object
	 */
	private final DivSimple<?> contents;
	/**
	 * The description of the current slide/image
	 */
	private Paragraph description;
	/**
	 * The options field
	 */
	private BlueImpGalleryOptions<?> options;

	public BlueImpGallery()
	{
		this.slides = new DivSimple<>().addClass(Slides);
		this.title = new H3<>().addClass(Title);
		this.prev = new Link<>().addClass(Prev);
		this.next = new Link<>().addClass(Next);
		this.close = new Link<>().addClass(Close);
		this.playPause = new Link<>().addClass(Play_Plause);
		this.indicator = new List<>(true).addClass(Indicator);

		this.contents = new DivSimple<>();
		this.contents.addClass(blueimpgallery_links);

		addClass(BlueImpGalleryClasses.BlueImp_Gallery);
	}

	/**
	 * Method addScreen ...
	 *
	 * @param imageUrl
	 * 		of type String
	 * @param thumbnailUrl
	 * 		of type String
	 * @param description
	 * 		of type String
	 * @param altTitle
	 * 		of type String
	 *
	 * @return Link<?>
	 */
	public Link<?> addScreen(String imageUrl, String thumbnailUrl, String description, String altTitle)
	{
		Link<?> link = new Link<>(imageUrl).addAttribute(GlobalAttributes.Title, altTitle);
		link.addAttribute(Data_Gallery.toString(), getID(true));
		if (description != null)
		{
			this.description = new Paragraph<>(description);
		}
		Image<?> image = new Image<>(thumbnailUrl == null ? imageUrl : thumbnailUrl).addAttribute(GlobalAttributes.Title, altTitle);
		link.add(image);

		contents.add(link);
		return link;
	}

	/**
	 * Method setControls sets the controls of this BlueImpGallery object.
	 *
	 * @param enableControls
	 * 		the controls of this BlueImpGallery object.
	 *
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
	 * @return the slides (type DivSimple<?>) of this BlueImpGallery object.
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
	 * @return the title (type H3<?>) of this BlueImpGallery object.
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
	 * @return the prev (type Link<?>) of this BlueImpGallery object.
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
	 * @return the next (type Link<?>) of this BlueImpGallery object.
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
	 * @return the close (type Link<?>) of this BlueImpGallery object.
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
	 * @return the playPause (type Link<?>) of this BlueImpGallery object.
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
	public List getIndicator()
	{
		return indicator;
	}

	/**
	 * Method getContents returns the contents of this BlueImpGallery object.
	 * <p>
	 * The contents div that gets rendered.
	 *
	 * @return the contents (type DivSimple<?>) of this BlueImpGallery object.
	 */
	public DivSimple<?> getContents()
	{
		return contents;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (getParent() != null)
			{
				getParent().add(this.contents);
			}
		}
		super.init();
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
		if (options == null)
		{
			options = new BlueImpGalleryOptions();
		}
		return options;
	}

	/**
	 * @param options
	 * 		a new options object
	 *
	 * @return The output
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOptions(BlueImpGalleryOptions options)
	{
		this.options = options;
		return (J) this;
	}
}
