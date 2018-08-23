package com.jwebmp.plugins.blueimp.gallery.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.blueimp.gallery.BlueImpGallery;
import com.jwebmp.plugins.blueimp.gallery.options.BlueImpGalleryOptions;

import javax.validation.constraints.NotNull;

/**
 * The feature to initialize the gallery
 */
@SuppressWarnings("MissingClassJavaDoc")
public class BlueImpGalleryFeature
		extends Feature<GlobalFeatures, BlueImpGalleryOptions, BlueImpGalleryFeature>
{
	/**
	 * Whether or not to render the initializer
	 */
	private boolean renderInitializer = false;

	/**
	 * Constructor BlueImpGalleryFeature creates a new BlueImpGalleryFeature instance.
	 *
	 * @param gallery
	 * 		of type BlueImpGallery
	 */
	public BlueImpGalleryFeature(@NotNull BlueImpGallery gallery)
	{
		super("BlueImpGalleryFeature", gallery);
		setOptions(new BlueImpGalleryOptions());
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		BlueImpGallery gallery = getComponent();
		StringBuilder sb = new StringBuilder();

		String galleryId = gallery.getID(true);
		String llinksId = gallery.getContents()
		                         .getID();

		getOptions().setContainer(galleryId);

		String eventHandler = "document.getElementById('" + llinksId + "').onclick = function (event) {\n" +
		                      "    event = event || window.event;\n" +
		                      "    var target = event.target || event.srcElement,\n" +
		                      "        link = target.src ? target.parentNode : target,\n" +
		                      "        options = {index: link, event: event},\n" +
		                      "        links = this.getElementsByTagName('a');\n" +
		                      "    blueimp.Gallery(links, options);\n" +
		                      "};";
		sb.append(eventHandler);

		if (isRenderInitializer())
		{
			sb.append("blueimp.Gallery(" + getNewLine() +
			          "document.getElementById('" + llinksId + "').getElementsByTagName('a')," + getNewLine() +
			          getOptions() +
			          ");");
		}

		addQuery(sb.toString());
	}

	/**
	 * Returns any hierarchal assigned component
	 *
	 * @return
	 */
	@Override
	protected BlueImpGallery getComponent()
	{
		return (BlueImpGallery) super.getComponent();
	}

	/**
	 * Method isRenderInitializer returns the renderInitializer of this BlueImpGalleryFeature object.
	 * <p>
	 * Whether or not to render the initializer
	 *
	 * @return the renderInitializer (type boolean) of this BlueImpGalleryFeature object.
	 */
	public boolean isRenderInitializer()
	{
		return renderInitializer;
	}

	/**
	 * Method setRenderInitializer sets the renderInitializer of this BlueImpGalleryFeature object.
	 * <p>
	 * Whether or not to render the initializer
	 *
	 * @param renderInitializer
	 * 		the renderInitializer of this BlueImpGalleryFeature object.
	 */
	public void setRenderInitializer(boolean renderInitializer)
	{
		this.renderInitializer = renderInitializer;
	}
}
