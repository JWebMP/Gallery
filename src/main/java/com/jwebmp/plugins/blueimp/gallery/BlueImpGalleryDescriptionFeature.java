package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.Feature;

class BlueImpGalleryDescriptionFeature
		extends Feature
{
	public BlueImpGalleryDescriptionFeature()
	{
		super("BlueImpGalleryDescriptionFeature");
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder sb = new StringBuilder("$('.blueimpgallery_links').on('slide', function (index, slide) {" + getNewLine() +
		                                     " var text = this.list[index].getAttribute('data-description')," + getNewLine() +
		                                     " node = this.container.find('.description');" + getNewLine() +
		                                     " node.empty();" + getNewLine() +
		                                     " if (text) {" + getNewLine() +
		                                     " node[0].appendChild(document.createTextNode(text));" + getNewLine() +
		                                     " }" + getNewLine() +
		                                     "});");
		addQuery(sb);
	}
}
