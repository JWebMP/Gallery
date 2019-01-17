/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * Default reference pool structure
 *
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BlueImpGalleryReferencePool
		implements ReferencePool
{
	/**
	 * Gallery Reference
	 */
	GalleryReference(new JavascriptReference("GalleryReference", 2.33, "bower_components/blueimpgallery/js/blueimp-gallery.min.js"),
	                 new CSSReference("GalleryReference", 2.33, "bower_components/blueimpgallery/css/blueimp-gallery.min.css")),

	GalleryCustomCSSReference(null,
	                          new CSSReference("GalleryCustomReference", 1.0, "blueimpgallerycustom/gallerydescriptions.min.css")),

	GalleryIndicatorReference(new JavascriptReference("GalleryIndicatorReference", 2.33, "bower_components/blueimpgallery/js/blueimp-gallery-indicator.min.js"),
	                          new CSSReference("GalleryIndicatorReference", 2.33, "bower_components/blueimpgallery/css/blueimp-gallery-indicator.min.css")),

	GalleryVideoReference(new JavascriptReference("GalleryVideoReference", 2.33, "bower_components/blueimpgallery/js/blueimp-gallery-video.min.js"),
	                      new CSSReference("GalleryVideoReference", 2.33, "bower_components/blueimpgallery/css/blueimp-gallery-video.min.css")),

	GalleryVimeoReference(new JavascriptReference("GalleryVimeoReference", 2.33, "bower_components/blueimpgallery/js/blueimp-gallery-vimeo.min.js"),
	                      null),

	GalleryYoutubeReference(new JavascriptReference("GalleryYoutubeReference", 2.33, "bower_components/blueimpgallery/js/blueimp-gallery-youtube.min.js"),
	                        null),

	GalleryHelperReference(new JavascriptReference("GalleryHelperReference", 2.33, "bower_components/blueimpgallery/js/blueimp-helper.min.js"),
	                       null),
	JQueryGalleryReference(new JavascriptReference("GalleryJQueryReference", 2.33, "bower_components/blueimpgallery/js/jquery.blueimp-gallery.min.js"),
	                       null),
	;
	/**
	 * The actual javascript
	 */
	private JavascriptReference javaScriptReference;
	/**
	 * The actual css reference
	 */
	private CSSReference cssReference;

	/**
	 * Constructs a reference pool
	 */
	BlueImpGalleryReferencePool()
	{
	}

	/**
	 * Constructs a new reference pool
	 *
	 * @param javaScriptReference
	 * @param cssReference
	 */
	BlueImpGalleryReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		this.cssReference = cssReference;
	}

	/**
	 * Gets the cSS reference
	 *
	 * @return
	 */
	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	/**
	 * Sets the CSS Reference
	 *
	 * @param cssReference
	 */
	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	/**
	 * Returns the javascript reference
	 *
	 * @return
	 */
	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	/**
	 * Sets the javascript reference
	 *
	 * @param javaScriptReference
	 */
	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
