package com.jwebmp.plugins.blueimp.gallery;

import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;


public class BlueImpGalleryPageConfigurator
        implements IPageConfigurator<BlueImpGalleryPageConfigurator>
{
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;
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
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled()
    {
        return BlueImpGalleryPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable)
    {
        BlueImpGalleryPageConfigurator.enabled = mustEnable;
    }

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
     * @param includeIndicators the includeIndicators of this BlueImpGalleryPageConfigurator object.
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
     * @param includeVideo the includeVideo of this BlueImpGalleryPageConfigurator object.
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
     * @param includeVimeo the includeVimeo of this BlueImpGalleryPageConfigurator object.
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
     * @param includeYouTube the includeYouTube of this BlueImpGalleryPageConfigurator object.
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
     * @param includeJQuery the includeJQuery of this BlueImpGalleryPageConfigurator object.
     */
    public static void setIncludeJQuery(boolean includeJQuery)
    {
        BlueImpGalleryPageConfigurator.includeJQuery = includeJQuery;
    }

    /**
     * Configures the given page for the parameters
     *
     * @param page The page incoming
     * @return The original page incoming or a new page, never null
     */
    @Override
    public @NotNull IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return BlueImpGalleryPageConfigurator.enabled;
    }
}
