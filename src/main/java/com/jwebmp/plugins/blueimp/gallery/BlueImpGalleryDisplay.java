package com.jwebmp.plugins.blueimp.gallery;


import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpVideoSourcesJSON;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpVideoSourcesJSONContainer;
import jakarta.validation.constraints.NotNull;
import lombok.extern.java.Log;

import java.util.Arrays;

import static com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryClasses.Data_Gallery;

@SuppressWarnings({"MissingClassJavaDoc", "UnusedReturnValue"})
@Log
public class BlueImpGalleryDisplay<J extends BlueImpGalleryDisplay<J>>
		extends DivSimple<J>
{
	private final BlueImpGallery<?> bodyGallery;
	/**
	 * The contents div that gets rendered.
	 * You must add this object and the contents to the parent object
	 */
	private final DivSimple<?> contents;

	/**
	 * The description of the current slide/image
	 */
	private Paragraph<?> description;
	
	public BlueImpGalleryDisplay(BlueImpGallery<?> bodyGallery)
	{
		this.bodyGallery = bodyGallery;
		contents = new DivSimple<>();
	}
	
	/**
	 * Method addScreen ...
	 *
	 * @param imageUrl     of type String
	 * @param thumbnailUrl of type String
	 * @param description  of type String
	 * @param altTitle     of type String
	 * @return Link?
	 */
	public Link<?> addScreen(String imageUrl, String thumbnailUrl, String description, String altTitle)
	{
		Link<?> link = new Link<>(imageUrl).addAttribute(GlobalAttributes.Title, altTitle);
		link.addAttribute(Data_Gallery.toString(), bodyGallery.getID(true));
		Image<?> image = new Image<>(thumbnailUrl == null ? imageUrl : thumbnailUrl).addAttribute(GlobalAttributes.Title, altTitle);
		//image.addStyle("width:75px;height:75px;");
		link.add(image);
		if (description != null)
		{
			this.description = new Paragraph<>(description);
			link.add(this.description);
		}
		
		contents.add(link);
		return link;
	}
	
	public Link<?> addVideoYouTube(String videoID, String title, String description)
	{
		Link<?> link = addVideoScreen(null, title, description, "text/html", null, new BlueImpVideoSourcesJSON().setYoutube(videoID));
		BlueImpGalleryPageConfigurator.setIncludeYouTube(true);
		return link;
	}
	
	public Link<?> addVideoScreen(String defaultSource, String title, String description, String type, String posterUrl, BlueImpVideoSourcesJSON... sources)
	{
		Link<?> link = new Link<>();
		link.addAttribute(Data_Gallery.toString(), getID(true));
		if (defaultSource != null)
		{
			link.addAttribute(LinkAttributes.HRef, defaultSource);
		}
		if (title != null)
		{
			link.addAttribute(GlobalAttributes.Title, title);
		}
		if (description != null)
		{
			link.addAttribute("data-description", description);
		}
		if (type != null)
		{
			log.warning("May not play, no video type specified for source " + defaultSource);
		}
		if (posterUrl != null)
		{
			link.addAttribute("data-poster", posterUrl);
		}
		if (sources != null && sources.length > 0)
		{
			BlueImpVideoSourcesJSONContainer<?> container = new BlueImpVideoSourcesJSONContainer();
			container.getSourcesJSONS()
			         .addAll(Arrays.asList(sources));
			link.addAttribute("data-sources", container.toString(true));
		}
		getContents().add(link);
		return link;
	}
	
	
	/**
	 * Method getContents returns the contents of this BlueImpGallery object.
	 * <p>
	 * The contents div that gets rendered.
	 *
	 * @return the contents (type DivSimple ?) of this BlueImpGallery object.
	 */
	public DivSimple<?> getContents()
	{
		return contents;
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
