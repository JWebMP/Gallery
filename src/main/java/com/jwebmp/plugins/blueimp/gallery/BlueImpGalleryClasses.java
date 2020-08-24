package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.interfaces.ICssClassName;

import static com.guicedee.guicedinjection.json.StaticStrings.CHAR_DASH;
import static com.guicedee.guicedinjection.json.StaticStrings.CHAR_UNDERSCORE;
import static com.jwebmp.core.utilities.StaticStrings.*;

public enum BlueImpGalleryClasses
		implements ICssClassName, AttributeDefinitions
{
	BlueImp_Gallery,
	BlueImp_Gallery_Controls,
	BlueImp_Gallery_Carousel,
	blueimpgallery_links,

	Data_blueimp_gallery,
	Data_Gallery,

	Slides,
	Title,
	Prev,
	Next,
	Close,
	Play_Plause,
	Indicator;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}

	@Override
	public boolean isKeyword()
	{
		return false;
	}
}
