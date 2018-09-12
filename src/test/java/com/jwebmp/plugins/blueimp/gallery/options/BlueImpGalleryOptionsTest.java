package com.jwebmp.plugins.blueimp.gallery.options;

import com.google.common.base.CaseFormat;
import com.jwebmp.core.Page;
import com.jwebmp.logger.logging.LogColourFormatter;
import com.jwebmp.plugins.blueimp.gallery.BlueImpGallery;
import com.jwebmp.plugins.blueimp.gallery.BlueImpVideoCarousel;
import org.junit.jupiter.api.Test;

public class BlueImpGalleryOptionsTest
{
	@Test
	void testCamelCase()
	{
		System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "SomeInput"));
		LogColourFormatter.setRenderBlack(false);
		BlueImpGalleryOptions options = new BlueImpGalleryOptions();
		options.setCarousel(true)
		       .setCloseOnEscape(true);
		System.out.println(options.toAttributes());
	}

	@Test
	void testPage()
	{
		LogColourFormatter.setRenderBlack(false);
		Page p = new Page();

		BlueImpGallery instance = new BlueImpGallery();
		BlueImpGalleryOptions options = instance.getOptions();
		options.setCarousel(true)
		       .setCloseOnEscape(true)
		       .setStartSlideshow(Boolean.TRUE)
		       .getIndicatorOptions();
		p.add(instance);

		instance.addScreen("imgaeURL", null, null, null);

		System.out.println(p.toString(0));

	}

	@Test
	void testVideoPage()
	{
		LogColourFormatter.setRenderBlack(false);
		Page p = new Page();

		BlueImpVideoCarousel instance = new BlueImpVideoCarousel();
		BlueImpGalleryOptions options = instance.getOptions();
		options.setCarousel(true)
		       .setCloseOnEscape(true)
		       .setStartSlideshow(Boolean.TRUE);
		p.add(instance);

		instance.addVideoScreen("imgaeURL", null, null, null, null, new BlueImpVideoSourcesJSON<>().setHref("href1")
		                                                                                           .setType("typ1"));

		System.out.println(p.toString(0));
	}

	@Test
	void testYouTube()
	{
		LogColourFormatter.setRenderBlack(false);
		Page p = new Page();

		BlueImpVideoCarousel instance = new BlueImpVideoCarousel();
		BlueImpGalleryOptions options = instance.getOptions();
		options.setCarousel(true)
		       .setCloseOnEscape(true)
		       .setStartSlideshow(Boolean.TRUE);
		p.add(instance);

		instance.addVideoYouTube("VideoID", "Title", "Description");

		System.out.println(p.toString(0));

	}
}
