package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

@SuppressWarnings("unused")
public class BlueImpGalleryPageConfigurator
		implements IPageConfigurator
{
	private static BlueImpGalleryDescriptionFeature galleryDescriptionFeature;
	/**
	 * To include the indicators
	 */
	private static boolean includeIndicators;
	/**
	 * To include the video
	 */
	private static boolean includeVideo;
	/**
	 * To include the vimeo addon
	 */
	private static boolean includeVimeo;
	/**
	 * To include the youtube plugin
	 */
	private static boolean includeYouTube;
	/**
	 * To include the jquery plugin - default true
	 */
	private static boolean includeJQuery = true;

	/**
	 * Method isIncludeIndicators returns the includeIndicators of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the indicators
	 *
	 * @return the includeIndicators (type boolean) of this BlueImpGalleryPageConfigurator object.
	 */
	public static boolean isIncludeIndicators()
	{
		return BlueImpGalleryPageConfigurator.includeIndicators;
	}

	/**
	 * Method setIncludeIndicators sets the includeIndicators of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the indicators
	 *
	 * @param includeIndicators
	 * 		the includeIndicators of this BlueImpGalleryPageConfigurator object.
	 */
	public static void setIncludeIndicators(boolean includeIndicators)
	{
		BlueImpGalleryPageConfigurator.includeIndicators = includeIndicators;
	}

	/**
	 * Method isIncludeVideo returns the includeVideo of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the video
	 *
	 * @return the includeVideo (type boolean) of this BlueImpGalleryPageConfigurator object.
	 */
	public static boolean isIncludeVideo()
	{
		if (BlueImpGalleryPageConfigurator.includeVideo)
		{
			BlueImpGalleryPageConfigurator.setIncludeIndicators(true);
		}
		return BlueImpGalleryPageConfigurator.includeVideo;
	}

	/**
	 * Method setIncludeVideo sets the includeVideo of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the video
	 *
	 * @param includeVideo
	 * 		the includeVideo of this BlueImpGalleryPageConfigurator object.
	 */
	public static void setIncludeVideo(boolean includeVideo)
	{
		BlueImpGalleryPageConfigurator.includeVideo = includeVideo;
	}

	/**
	 * Method isIncludeVimeo returns the includeVimeo of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the vimeo addon
	 *
	 * @return the includeVimeo (type boolean) of this BlueImpGalleryPageConfigurator object.
	 */
	public static boolean isIncludeVimeo()
	{
		return BlueImpGalleryPageConfigurator.includeVimeo;
	}

	/**
	 * Method setIncludeVimeo sets the includeVimeo of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the vimeo addon
	 *
	 * @param includeVimeo
	 * 		the includeVimeo of this BlueImpGalleryPageConfigurator object.
	 */
	public static void setIncludeVimeo(boolean includeVimeo)
	{
		if (includeVimeo)
		{
			BlueImpGalleryPageConfigurator.setIncludeVideo(true);
		}
		BlueImpGalleryPageConfigurator.includeVimeo = includeVimeo;
	}

	/**
	 * Method isIncludeYouTube returns the includeYouTube of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the youtube plugin
	 *
	 * @return the includeYouTube (type boolean) of this BlueImpGalleryPageConfigurator object.
	 */
	public static boolean isIncludeYouTube()
	{
		return BlueImpGalleryPageConfigurator.includeYouTube;
	}

	/**
	 * Method setIncludeYouTube sets the includeYouTube of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the youtube plugin
	 *
	 * @param includeYouTube
	 * 		the includeYouTube of this BlueImpGalleryPageConfigurator object.
	 */
	public static void setIncludeYouTube(boolean includeYouTube)
	{
		if (includeYouTube)
		{
			BlueImpGalleryPageConfigurator.setIncludeVideo(true);
		}
		BlueImpGalleryPageConfigurator.includeYouTube = includeYouTube;
	}

	/**
	 * Method isIncludeJQuery returns the includeJQuery of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the jquery plugin
	 *
	 * @return the includeJQuery (type boolean) of this BlueImpGalleryPageConfigurator object.
	 */
	public static boolean isIncludeJQuery()
	{
		return BlueImpGalleryPageConfigurator.includeJQuery;
	}

	/**
	 * Method setIncludeJQuery sets the includeJQuery of this BlueImpGalleryPageConfigurator object.
	 * <p>
	 * To include the jquery plugin
	 *
	 * @param includeJQuery
	 * 		the includeJQuery of this BlueImpGalleryPageConfigurator object.
	 */
	public static void setIncludeJQuery(boolean includeJQuery)
	{
		BlueImpGalleryPageConfigurator.includeJQuery = includeJQuery;
	}

	/**
	 * Configures the given page for the parameters
	 *
	 * @param page
	 * 		The page incoming
	 *
	 * @return The original page incoming or a new page, never null
	 */
	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		if (BlueImpGalleryPageConfigurator.galleryDescriptionFeature == null)
		{
			BlueImpGalleryPageConfigurator.galleryDescriptionFeature = new BlueImpGalleryDescriptionFeature();
		}

		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);

			page.addCssReference(BlueImpGalleryReferencePool.GalleryReference.getCssReference());
			page.addCssReference(BlueImpGalleryReferencePool.GalleryCustomCSSReference.getCssReference());

			page.addFeature(BlueImpGalleryPageConfigurator.galleryDescriptionFeature);

			page.addJavaScriptReference(BlueImpGalleryReferencePool.GalleryReference.getJavaScriptReference()
			                                                                        .setSortOrder(210));
			if (BlueImpGalleryPageConfigurator.includeIndicators)
			{
				page.getBody()
				    .addJavaScriptReference(BlueImpGalleryReferencePool.GalleryIndicatorReference.getJavaScriptReference()
				                                                                                 .setSortOrder(211));

				page.getBody()
				    .addCssReference(BlueImpGalleryReferencePool.GalleryIndicatorReference.getCssReference()
				                                                                          .setSortOrder(211));
			}
			if (BlueImpGalleryPageConfigurator.includeVideo)
			{
				page.getBody()
				    .addJavaScriptReference(BlueImpGalleryReferencePool.GalleryVideoReference.getJavaScriptReference()
				                                                                             .setSortOrder(212));
				page.getBody()
				    .addCssReference(BlueImpGalleryReferencePool.GalleryVideoReference.getCssReference()
				                                                                      .setSortOrder(213));
			}
			if (BlueImpGalleryPageConfigurator.includeVimeo)
			{
				page.getBody()
				    .addJavaScriptReference(BlueImpGalleryReferencePool.GalleryVimeoReference.getJavaScriptReference()
				                                                                             .setSortOrder(214));
			}

			if (BlueImpGalleryPageConfigurator.includeYouTube)
			{
				page.getBody()
				    .addJavaScriptReference(BlueImpGalleryReferencePool.GalleryYoutubeReference.getJavaScriptReference()
				                                                                               .setSortOrder(215));
			}

			if (BlueImpGalleryPageConfigurator.includeJQuery)
			{
				page.getBody()
				    .addJavaScriptReference(BlueImpGalleryReferencePool.JQueryGalleryReference.getJavaScriptReference()
				                                                                              .setSortOrder(216));
			}

			page.getBody()
			    .addJavaScriptReference(BlueImpGalleryReferencePool.GalleryHelperReference.getJavaScriptReference()
			                                                                              .setSortOrder(209));

		}
		return page;
	}
}
