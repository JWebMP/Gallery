package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpVideoSourcesJSON;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpVideoSourcesJSONContainer;

import java.util.Arrays;
import java.util.logging.Logger;

import static com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryClasses.*;

public class BlueImpVideoCarousel<J extends BlueImpVideoCarousel<J>>
		extends BlueImpCarousel<J>
{
	private static final Logger log = LogFactory.getLog("BlueImpVideoCarousel");

	public BlueImpVideoCarousel()
	{
		addClass(BlueImpGalleryClasses.BlueImp_Gallery_Carousel);
		BlueImpGalleryPageConfigurator.setIncludeVideo(true);
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
			BlueImpVideoCarousel.log.warning("May not play, no video type specified for source " + defaultSource);
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
}
