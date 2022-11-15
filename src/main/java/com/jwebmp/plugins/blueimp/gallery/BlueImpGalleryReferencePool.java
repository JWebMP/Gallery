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

import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * Default reference pool structure
 *
 * @author GedMarc
 * @since 20 Apr 2016
 */
@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery.min.js",sortOrder = 150)
@NgStyleSheet(value = "app/blueimp/blueimp-gallery/css/blueimp-gallery.css",sortOrder = 150)

@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery-indicator.js",sortOrder = 155)
@NgStyleSheet(value = "app/blueimp/blueimp-gallery/css/blueimp-gallery-indicator.css",sortOrder = 150)

@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery-video.js",sortOrder = 160)
@NgStyleSheet(value = "app/blueimp/blueimp-gallery/css/blueimp-gallery-video.css",sortOrder = 150)

@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery-fullscreen.js",sortOrder = 161)



@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery-vimeo.js",sortOrder = 170)
@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-gallery-youtube.js",sortOrder = 170)
@NgScript(value = "app/blueimp/blueimp-gallery/js/blueimp-helper.js",sortOrder = 180)

@NgScript(value = "app/blueimp/gallery-description/blueimpgallery_description.js",sortOrder = 180)
@NgStyleSheet(value = "app/blueimp/gallery-description/gallerydescriptions.css",sortOrder = 190)

@NgScript(value = "app/blueimp/blueimp-gallery/js/jquery.blueimp-gallery.js",sortOrder = 200)

public enum BlueImpGalleryReferencePool
{

}
