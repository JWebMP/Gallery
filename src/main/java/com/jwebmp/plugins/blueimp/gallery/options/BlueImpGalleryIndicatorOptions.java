package com.jwebmp.plugins.blueimp.gallery.options;

import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * The indicator options for the blue imp gallery
 *
 * @param <J>
 * 		The blue imp gallery
 */
@SuppressWarnings({"MissingClassJavaDoc", "unused"})
public class BlueImpGalleryIndicatorOptions<J extends BlueImpGalleryIndicatorOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The tag name, Id, element or querySelector of the indicator container:
	 * default 'ol'
	 */
	private ComponentTypes indicatorContainer;
	/**
	 * The class for the active indicator:
	 * default 'active'
	 */
	private String activeIndicatorClass;
	/**
	 * The list object property (or data attribute) with the thumbnail URL,
	 * used as alternative to a thumbnail child element
	 * default 'thumbnail'
	 */
	private String thumbnailProperty;
	/**
	 * Defines if the gallery indicators should display a thumbnail:
	 * default true
	 */
	private Boolean thumbnailIndicators;

	/**
	 * Sets the indicator libraries to be included
	 */
	public BlueImpGalleryIndicatorOptions()
	{
		BlueImpGalleryPageConfigurator.setIncludeIndicators(true);
	}

	/**
	 * Method getIndicatorContainer returns the indicatorContainer of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the indicator container:
	 *
	 * @return the indicatorContainer (type ComponentTypes) of this BlueImpGalleryIndicatorOptions object.
	 */
	public ComponentTypes getIndicatorContainer()
	{
		return indicatorContainer;
	}

	/**
	 * Method setIndicatorContainer sets the indicatorContainer of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the indicator container:
	 *
	 * @param indicatorContainer
	 * 		the indicatorContainer of this BlueImpGalleryIndicatorOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIndicatorContainer(ComponentTypes indicatorContainer)
	{
		this.indicatorContainer = indicatorContainer;
		return (J) this;
	}

	/**
	 * Method getActiveIndicatorClass returns the activeIndicatorClass of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The class for the active indicator:
	 *
	 * @return the activeIndicatorClass (type String) of this BlueImpGalleryIndicatorOptions object.
	 */
	public String getActiveIndicatorClass()
	{
		return activeIndicatorClass;
	}

	/**
	 * Method setActiveIndicatorClass sets the activeIndicatorClass of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The class for the active indicator:
	 *
	 * @param activeIndicatorClass
	 * 		the activeIndicatorClass of this BlueImpGalleryIndicatorOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveIndicatorClass(String activeIndicatorClass)
	{
		this.activeIndicatorClass = activeIndicatorClass;
		return (J) this;
	}

	/**
	 * Method getThumbnailProperty returns the thumbnailProperty of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The list object property (or data attribute) with the thumbnail URL,
	 *
	 * @return the thumbnailProperty (type String) of this BlueImpGalleryIndicatorOptions object.
	 */
	public String getThumbnailProperty()
	{
		return thumbnailProperty;
	}

	/**
	 * Method setThumbnailProperty sets the thumbnailProperty of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * The list object property (or data attribute) with the thumbnail URL,
	 *
	 * @param thumbnailProperty
	 * 		the thumbnailProperty of this BlueImpGalleryIndicatorOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setThumbnailProperty(String thumbnailProperty)
	{
		this.thumbnailProperty = thumbnailProperty;
		return (J) this;
	}

	/**
	 * Method getThumbnailIndicators returns the thumbnailIndicators of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * Defines if the gallery indicators should display a thumbnail:
	 *
	 * @return the thumbnailIndicators (type Boolean) of this BlueImpGalleryIndicatorOptions object.
	 */
	public Boolean getThumbnailIndicators()
	{
		return thumbnailIndicators;
	}

	/**
	 * Method setThumbnailIndicators sets the thumbnailIndicators of this BlueImpGalleryIndicatorOptions object.
	 * <p>
	 * Defines if the gallery indicators should display a thumbnail:
	 *
	 * @param thumbnailIndicators
	 * 		the thumbnailIndicators of this BlueImpGalleryIndicatorOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setThumbnailIndicators(Boolean thumbnailIndicators)
	{
		this.thumbnailIndicators = thumbnailIndicators;
		return (J) this;
	}
}
