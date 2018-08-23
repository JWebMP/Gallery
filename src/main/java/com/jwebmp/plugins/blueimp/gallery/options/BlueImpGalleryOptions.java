package com.jwebmp.plugins.blueimp.gallery.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * The options set for the gallery
 *
 * @param <J>
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue", "MissingClassJavaDoc"})
public class BlueImpGalleryOptions<J extends BlueImpGalleryOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The Id, element or querySelector of the gallery widget
	 * default '#blueimp-gallery',
	 */
	private String container;
	/**
	 * The tag name, Id, element or querySelector of the slides container
	 * default 'div'
	 */
	private String slidesContainer;
	/**
	 * The tag name, Id, element or querySelector of the title element
	 * default  'h3'
	 */
	private String titleElement;
	/**
	 * The class to add when the gallery is visible
	 * default 'blueimp-gallery-display'
	 */
	private String displayClass;
	/**
	 * The class to add when the gallery controls are visible
	 * default  'blueimp-gallery-controls'
	 */
	private String controlsClass;
	/**
	 * The class to add when the gallery only displays one element
	 * default 'blueimp-gallery-single'
	 */
	private String singleClass;
	/**
	 * The class to add when the left edge has been reached
	 * default 'blueimp-gallery-left'
	 */
	private String leftEdgeClass;
	/**
	 * The class to add when the right edge has been reached
	 * default 'blueimp-gallery-right'
	 */
	private String rightEdgeClass;
	/**
	 * The class to add when the automatic slideshow is active
	 * default 'blueimp-gallery-playing'
	 */
	private String playingClass;
	/**
	 * The class for all slides
	 * default 'slide'
	 */
	private String slideClass;
	/**
	 * The slide class for loading elements
	 * default 'slide-loading'
	 */
	private String slideLoadingClass;
	/**
	 * The slide class for elements that failed to load
	 * default 'slide-error'
	 */
	private String slideErrorClass;
	/**
	 * The class for the content element loaded into each slide
	 * default 'slide-content'
	 */
	private String slideContentClass;
	/**
	 * The class for the "toggle" control
	 * default 'toggle'
	 */
	private String toggleClass;
	/**
	 * The class for the "prev" control
	 * default 'prev'
	 */
	private String prevClass;
	/**
	 * The class for the "next" control
	 * default  'next'
	 */
	private String nextClass;
	/**
	 * The class for the "close" control
	 * default  'close'
	 */
	private String closeClass;
	/**
	 * The class for the "play-pause" toggle control
	 * default 'play-pause'
	 */
	private String playPauseClass;
	/**
	 * The list object property (or data attribute) with the object type
	 * default 'type'
	 */
	private String typeProperty;
	/**
	 * The list object property (or data attribute) with the object title
	 * default 'title'
	 */
	private String titleProperty;
	/**
	 * The list object property (or data attribute) with the object alt text
	 * default 'alt'
	 */
	private String altTextProperty;
	/**
	 * The list object property (or data attribute) with the object URL
	 * default  'href'
	 */
	private String urlProperty;
	/**
	 * The list object property (or data attribute) with the object srcset URL(s)
	 * default  'urlset'
	 */
	private String srcsetProperty;
	/**
	 * The gallery listens for transitionend events before triggering the
	 * opened and closed events, unless the following option is set to false
	 * default true
	 */
	private Boolean displayTransition;
	/**
	 * Defines if the gallery slides are cleared from the gallery modal
	 * or reused for the next gallery initialization
	 * default true
	 */
	private Boolean clearSlides;
	/**
	 * Defines if images should be stretched to fill the available space
	 * while maintaining their aspect ratio (will only be enabled for browsers
	 * supporting background-size="contain", which excludes IE < 9).
	 * Set to "cover", to make images cover all available space (requires
	 * support for background-size="cover", which excludes IE < 9)
	 * default false
	 */
	private Boolean stretchImages;
	/**
	 * Toggle the controls on pressing the Return key
	 * default true
	 */
	private Boolean toggleControlsOnReturn;
	/**
	 * Toggle the controls on slide click
	 * default true
	 */
	private Boolean toggleControlsOnSlideClick;
	/**
	 * Toggle the automatic slideshow interval on pressing the Space key
	 * default true
	 */
	private Boolean toggleSlideshowOnSpace;
	/**
	 * Navigate the gallery by pressing left and right on the keyboard
	 * default true
	 */
	private Boolean enableKeyboardNavigation;
	/**
	 * Close the gallery on pressing the ESC key
	 * default true
	 */
	private Boolean closeOnEscape;
	/**
	 * Close the gallery when clicking on an empty slide area
	 * default true
	 */
	private Boolean closeOnSlideClick;
	/**
	 * Close the gallery by swiping up or down
	 * default true
	 */
	private Boolean closeOnSwipeUpOrDown;
	/**
	 * Emulate touch events on mouse-pointer devices such as desktop browsers
	 * default true
	 */
	private Boolean emulateTouchEvents;
	/**
	 * Stop touch events from bubbling up to ancestor elements of the Gallery
	 * default false
	 */
	private Boolean stopTouchEventsPropagation;
	/**
	 * Hide the page scrollbars
	 * default true
	 */
	private Boolean hidePageScrollbars;
	/**
	 * Stops any touches on the container from scrolling the page
	 * default true
	 */
	private Boolean disableScroll;
	/**
	 * Carousel mode (shortcut for carousel specific options)
	 * default false
	 */
	private Boolean carousel;
	/**
	 * Allow continuous navigation, moving from last to first
	 * and from first to last slide
	 * default true
	 */
	private Boolean continuous;
	/**
	 * Remove elements outside of the preload range from the DOM
	 * default true
	 */
	private Boolean unloadElements;
	/**
	 * Start with the automatic slideshow
	 * default false
	 */
	private Boolean startSlideshow;
	/**
	 * Delay in milliseconds between slides for the automatic slideshow
	 * default 5000
	 */
	private Integer slideshowInterval;
	/**
	 * The starting index as integer.
	 * Can also be an object of the given list
	 * or an equal object with the same url property
	 * default 0
	 */
	private Integer index;
	/**
	 * The number of elements to load around the current index
	 * default 2
	 */
	private Integer preloadRange;
	/**
	 * The transition speed between slide changes in milliseconds
	 * default 400
	 */
	private Integer transitionSpeed;
	/**
	 * The transition speed for automatic slide changes, set to an integer
	 * greater 0 to override the
	 * default transition speed
	 * default undefined
	 */
	private Integer slideshowTransitionSpeed;
	/**
	 * Indicator options
	 * The following are the additional default options set for the slide position indicator:
	 */
	private BlueImpGalleryIndicatorOptions indicatorOptions;

	/**
	 * Constructs a new gallery options
	 */
	public BlueImpGalleryOptions()
	{
		//no config required
	}

	/**
	 * Method getContainer returns the container of this BlueImpGalleryOptions object.
	 * <p>
	 * The Id, element or querySelector of the gallery widget
	 *
	 * @return the container (type String) of this BlueImpGalleryOptions object.
	 */
	public String getContainer()
	{
		return container;
	}

	/**
	 * Method setContainer sets the container of this BlueImpGalleryOptions object.
	 * <p>
	 * The Id, element or querySelector of the gallery widget
	 *
	 * @param container
	 * 		the container of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContainer(String container)
	{
		this.container = container;
		return (J) this;
	}

	/**
	 * Method getSlidesContainer returns the slidesContainer of this BlueImpGalleryOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the slides container
	 *
	 * @return the slidesContainer (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSlidesContainer()
	{
		return slidesContainer;
	}

	/**
	 * Method setSlidesContainer sets the slidesContainer of this BlueImpGalleryOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the slides container
	 *
	 * @param slidesContainer
	 * 		the slidesContainer of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlidesContainer(String slidesContainer)
	{
		this.slidesContainer = slidesContainer;
		return (J) this;
	}

	/**
	 * Method getTitleElement returns the titleElement of this BlueImpGalleryOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the title element
	 *
	 * @return the titleElement (type String) of this BlueImpGalleryOptions object.
	 */
	public String getTitleElement()
	{
		return titleElement;
	}

	/**
	 * Method setTitleElement sets the titleElement of this BlueImpGalleryOptions object.
	 * <p>
	 * The tag name, Id, element or querySelector of the title element
	 *
	 * @param titleElement
	 * 		the titleElement of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTitleElement(String titleElement)
	{
		this.titleElement = titleElement;
		return (J) this;
	}

	/**
	 * Method getDisplayClass returns the displayClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery is visible
	 *
	 * @return the displayClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getDisplayClass()
	{
		return displayClass;
	}

	/**
	 * Method setDisplayClass sets the displayClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery is visible
	 *
	 * @param displayClass
	 * 		the displayClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisplayClass(String displayClass)
	{
		this.displayClass = displayClass;
		return (J) this;
	}

	/**
	 * Method getControlsClass returns the controlsClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery controls are visible
	 *
	 * @return the controlsClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getControlsClass()
	{
		return controlsClass;
	}

	/**
	 * Method setControlsClass sets the controlsClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery controls are visible
	 *
	 * @param controlsClass
	 * 		the controlsClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setControlsClass(String controlsClass)
	{
		this.controlsClass = controlsClass;
		return (J) this;
	}

	/**
	 * Method getSingleClass returns the singleClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery only displays one element
	 *
	 * @return the singleClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSingleClass()
	{
		return singleClass;
	}

	/**
	 * Method setSingleClass sets the singleClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the gallery only displays one element
	 *
	 * @param singleClass
	 * 		the singleClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSingleClass(String singleClass)
	{
		this.singleClass = singleClass;
		return (J) this;
	}

	/**
	 * Method getLeftEdgeClass returns the leftEdgeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the left edge has been reached
	 *
	 * @return the leftEdgeClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getLeftEdgeClass()
	{
		return leftEdgeClass;
	}

	/**
	 * Method setLeftEdgeClass sets the leftEdgeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the left edge has been reached
	 *
	 * @param leftEdgeClass
	 * 		the leftEdgeClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLeftEdgeClass(String leftEdgeClass)
	{
		this.leftEdgeClass = leftEdgeClass;
		return (J) this;
	}

	/**
	 * Method getRightEdgeClass returns the rightEdgeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the right edge has been reached
	 *
	 * @return the rightEdgeClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getRightEdgeClass()
	{
		return rightEdgeClass;
	}

	/**
	 * Method setRightEdgeClass sets the rightEdgeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the right edge has been reached
	 *
	 * @param rightEdgeClass
	 * 		the rightEdgeClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRightEdgeClass(String rightEdgeClass)
	{
		this.rightEdgeClass = rightEdgeClass;
		return (J) this;
	}

	/**
	 * Method getPlayingClass returns the playingClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the automatic slideshow is active
	 *
	 * @return the playingClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getPlayingClass()
	{
		return playingClass;
	}

	/**
	 * Method setPlayingClass sets the playingClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class to add when the automatic slideshow is active
	 *
	 * @param playingClass
	 * 		the playingClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPlayingClass(String playingClass)
	{
		this.playingClass = playingClass;
		return (J) this;
	}

	/**
	 * Method getSlideClass returns the slideClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for all slides
	 *
	 * @return the slideClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSlideClass()
	{
		return slideClass;
	}

	/**
	 * Method setSlideClass sets the slideClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for all slides
	 *
	 * @param slideClass
	 * 		the slideClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideClass(String slideClass)
	{
		this.slideClass = slideClass;
		return (J) this;
	}

	/**
	 * Method getSlideLoadingClass returns the slideLoadingClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The slide class for loading elements
	 *
	 * @return the slideLoadingClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSlideLoadingClass()
	{
		return slideLoadingClass;
	}

	/**
	 * Method setSlideLoadingClass sets the slideLoadingClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The slide class for loading elements
	 *
	 * @param slideLoadingClass
	 * 		the slideLoadingClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideLoadingClass(String slideLoadingClass)
	{
		this.slideLoadingClass = slideLoadingClass;
		return (J) this;
	}

	/**
	 * Method getSlideErrorClass returns the slideErrorClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The slide class for elements that failed to load
	 *
	 * @return the slideErrorClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSlideErrorClass()
	{
		return slideErrorClass;
	}

	/**
	 * Method setSlideErrorClass sets the slideErrorClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The slide class for elements that failed to load
	 *
	 * @param slideErrorClass
	 * 		the slideErrorClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideErrorClass(String slideErrorClass)
	{
		this.slideErrorClass = slideErrorClass;
		return (J) this;
	}

	/**
	 * Method getSlideContentClass returns the slideContentClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the content element loaded into each slide
	 *
	 * @return the slideContentClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSlideContentClass()
	{
		return slideContentClass;
	}

	/**
	 * Method setSlideContentClass sets the slideContentClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the content element loaded into each slide
	 *
	 * @param slideContentClass
	 * 		the slideContentClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideContentClass(String slideContentClass)
	{
		this.slideContentClass = slideContentClass;
		return (J) this;
	}

	/**
	 * Method getToggleClass returns the toggleClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "toggle" control
	 *
	 * @return the toggleClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getToggleClass()
	{
		return toggleClass;
	}

	/**
	 * Method setToggleClass sets the toggleClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "toggle" control
	 *
	 * @param toggleClass
	 * 		the toggleClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setToggleClass(String toggleClass)
	{
		this.toggleClass = toggleClass;
		return (J) this;
	}

	/**
	 * Method getPrevClass returns the prevClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "prev" control
	 *
	 * @return the prevClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getPrevClass()
	{
		return prevClass;
	}

	/**
	 * Method setPrevClass sets the prevClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "prev" control
	 *
	 * @param prevClass
	 * 		the prevClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPrevClass(String prevClass)
	{
		this.prevClass = prevClass;
		return (J) this;
	}

	/**
	 * Method getNextClass returns the nextClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "next" control
	 *
	 * @return the nextClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getNextClass()
	{
		return nextClass;
	}

	/**
	 * Method setNextClass sets the nextClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "next" control
	 *
	 * @param nextClass
	 * 		the nextClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNextClass(String nextClass)
	{
		this.nextClass = nextClass;
		return (J) this;
	}

	/**
	 * Method getCloseClass returns the closeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "close" control
	 *
	 * @return the closeClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getCloseClass()
	{
		return closeClass;
	}

	/**
	 * Method setCloseClass sets the closeClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "close" control
	 *
	 * @param closeClass
	 * 		the closeClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseClass(String closeClass)
	{
		this.closeClass = closeClass;
		return (J) this;
	}

	/**
	 * Method getPlayPauseClass returns the playPauseClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "play-pause" toggle control
	 *
	 * @return the playPauseClass (type String) of this BlueImpGalleryOptions object.
	 */
	public String getPlayPauseClass()
	{
		return playPauseClass;
	}

	/**
	 * Method setPlayPauseClass sets the playPauseClass of this BlueImpGalleryOptions object.
	 * <p>
	 * The class for the "play-pause" toggle control
	 *
	 * @param playPauseClass
	 * 		the playPauseClass of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPlayPauseClass(String playPauseClass)
	{
		this.playPauseClass = playPauseClass;
		return (J) this;
	}

	/**
	 * Method getTypeProperty returns the typeProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object type
	 *
	 * @return the typeProperty (type String) of this BlueImpGalleryOptions object.
	 */
	public String getTypeProperty()
	{
		return typeProperty;
	}

	/**
	 * Method setTypeProperty sets the typeProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object type
	 *
	 * @param typeProperty
	 * 		the typeProperty of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTypeProperty(String typeProperty)
	{
		this.typeProperty = typeProperty;
		return (J) this;
	}

	/**
	 * Method getTitleProperty returns the titleProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object title
	 *
	 * @return the titleProperty (type String) of this BlueImpGalleryOptions object.
	 */
	public String getTitleProperty()
	{
		return titleProperty;
	}

	/**
	 * Method setTitleProperty sets the titleProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object title
	 *
	 * @param titleProperty
	 * 		the titleProperty of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTitleProperty(String titleProperty)
	{
		this.titleProperty = titleProperty;
		return (J) this;
	}

	/**
	 * Method getAltTextProperty returns the altTextProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object alt text
	 *
	 * @return the altTextProperty (type String) of this BlueImpGalleryOptions object.
	 */
	public String getAltTextProperty()
	{
		return altTextProperty;
	}

	/**
	 * Method setAltTextProperty sets the altTextProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object alt text
	 *
	 * @param altTextProperty
	 * 		the altTextProperty of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAltTextProperty(String altTextProperty)
	{
		this.altTextProperty = altTextProperty;
		return (J) this;
	}

	/**
	 * Method getUrlProperty returns the urlProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object URL
	 *
	 * @return the urlProperty (type String) of this BlueImpGalleryOptions object.
	 */
	public String getUrlProperty()
	{
		return urlProperty;
	}

	/**
	 * Method setUrlProperty sets the urlProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object URL
	 *
	 * @param urlProperty
	 * 		the urlProperty of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUrlProperty(String urlProperty)
	{
		this.urlProperty = urlProperty;
		return (J) this;
	}

	/**
	 * Method getSrcsetProperty returns the srcsetProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object srcset URL(s)
	 *
	 * @return the srcsetProperty (type String) of this BlueImpGalleryOptions object.
	 */
	public String getSrcsetProperty()
	{
		return srcsetProperty;
	}

	/**
	 * Method setSrcsetProperty sets the srcsetProperty of this BlueImpGalleryOptions object.
	 * <p>
	 * The list object property (or data attribute) with the object srcset URL(s)
	 *
	 * @param srcsetProperty
	 * 		the srcsetProperty of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSrcsetProperty(String srcsetProperty)
	{
		this.srcsetProperty = srcsetProperty;
		return (J) this;
	}

	/**
	 * Method getDisplayTransition returns the displayTransition of this BlueImpGalleryOptions object.
	 * <p>
	 * The gallery listens for transitionend events before triggering the
	 *
	 * @return the displayTransition (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getDisplayTransition()
	{
		return displayTransition;
	}

	/**
	 * Method setDisplayTransition sets the displayTransition of this BlueImpGalleryOptions object.
	 * <p>
	 * The gallery listens for transitionend events before triggering the
	 *
	 * @param displayTransition
	 * 		the displayTransition of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisplayTransition(Boolean displayTransition)
	{
		this.displayTransition = displayTransition;
		return (J) this;
	}

	/**
	 * Method getClearSlides returns the clearSlides of this BlueImpGalleryOptions object.
	 * <p>
	 * Defines if the gallery slides are cleared from the gallery modal
	 *
	 * @return the clearSlides (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getClearSlides()
	{
		return clearSlides;
	}

	/**
	 * Method setClearSlides sets the clearSlides of this BlueImpGalleryOptions object.
	 * <p>
	 * Defines if the gallery slides are cleared from the gallery modal
	 *
	 * @param clearSlides
	 * 		the clearSlides of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setClearSlides(Boolean clearSlides)
	{
		this.clearSlides = clearSlides;
		return (J) this;
	}

	/**
	 * Method getStretchImages returns the stretchImages of this BlueImpGalleryOptions object.
	 * <p>
	 * Defines if images should be stretched to fill the available space
	 *
	 * @return the stretchImages (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getStretchImages()
	{
		return stretchImages;
	}

	/**
	 * Method setStretchImages sets the stretchImages of this BlueImpGalleryOptions object.
	 * <p>
	 * Defines if images should be stretched to fill the available space
	 *
	 * @param stretchImages
	 * 		the stretchImages of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStretchImages(Boolean stretchImages)
	{
		this.stretchImages = stretchImages;
		return (J) this;
	}

	/**
	 * Method getToggleControlsOnReturn returns the toggleControlsOnReturn of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the controls on pressing the Return key
	 *
	 * @return the toggleControlsOnReturn (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getToggleControlsOnReturn()
	{
		return toggleControlsOnReturn;
	}

	/**
	 * Method setToggleControlsOnReturn sets the toggleControlsOnReturn of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the controls on pressing the Return key
	 *
	 * @param toggleControlsOnReturn
	 * 		the toggleControlsOnReturn of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setToggleControlsOnReturn(Boolean toggleControlsOnReturn)
	{
		this.toggleControlsOnReturn = toggleControlsOnReturn;
		return (J) this;
	}

	/**
	 * Method getToggleControlsOnSlideClick returns the toggleControlsOnSlideClick of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the controls on slide click
	 *
	 * @return the toggleControlsOnSlideClick (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getToggleControlsOnSlideClick()
	{
		return toggleControlsOnSlideClick;
	}

	/**
	 * Method setToggleControlsOnSlideClick sets the toggleControlsOnSlideClick of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the controls on slide click
	 *
	 * @param toggleControlsOnSlideClick
	 * 		the toggleControlsOnSlideClick of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setToggleControlsOnSlideClick(Boolean toggleControlsOnSlideClick)
	{
		this.toggleControlsOnSlideClick = toggleControlsOnSlideClick;
		return (J) this;
	}

	/**
	 * Method getToggleSlideshowOnSpace returns the toggleSlideshowOnSpace of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the automatic slideshow interval on pressing the Space key
	 *
	 * @return the toggleSlideshowOnSpace (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getToggleSlideshowOnSpace()
	{
		return toggleSlideshowOnSpace;
	}

	/**
	 * Method setToggleSlideshowOnSpace sets the toggleSlideshowOnSpace of this BlueImpGalleryOptions object.
	 * <p>
	 * Toggle the automatic slideshow interval on pressing the Space key
	 *
	 * @param toggleSlideshowOnSpace
	 * 		the toggleSlideshowOnSpace of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setToggleSlideshowOnSpace(Boolean toggleSlideshowOnSpace)
	{
		this.toggleSlideshowOnSpace = toggleSlideshowOnSpace;
		return (J) this;
	}

	/**
	 * Method getEnableKeyboardNavigation returns the enableKeyboardNavigation of this BlueImpGalleryOptions object.
	 * <p>
	 * Navigate the gallery by pressing left and right on the keyboard
	 *
	 * @return the enableKeyboardNavigation (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getEnableKeyboardNavigation()
	{
		return enableKeyboardNavigation;
	}

	/**
	 * Method setEnableKeyboardNavigation sets the enableKeyboardNavigation of this BlueImpGalleryOptions object.
	 * <p>
	 * Navigate the gallery by pressing left and right on the keyboard
	 *
	 * @param enableKeyboardNavigation
	 * 		the enableKeyboardNavigation of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEnableKeyboardNavigation(Boolean enableKeyboardNavigation)
	{
		this.enableKeyboardNavigation = enableKeyboardNavigation;
		return (J) this;
	}

	/**
	 * Method getCloseOnEscape returns the closeOnEscape of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery on pressing the ESC key
	 *
	 * @return the closeOnEscape (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getCloseOnEscape()
	{
		return closeOnEscape;
	}

	/**
	 * Method setCloseOnEscape sets the closeOnEscape of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery on pressing the ESC key
	 *
	 * @param closeOnEscape
	 * 		the closeOnEscape of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseOnEscape(Boolean closeOnEscape)
	{
		this.closeOnEscape = closeOnEscape;
		return (J) this;
	}

	/**
	 * Method getCloseOnSlideClick returns the closeOnSlideClick of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery when clicking on an empty slide area
	 *
	 * @return the closeOnSlideClick (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getCloseOnSlideClick()
	{
		return closeOnSlideClick;
	}

	/**
	 * Method setCloseOnSlideClick sets the closeOnSlideClick of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery when clicking on an empty slide area
	 *
	 * @param closeOnSlideClick
	 * 		the closeOnSlideClick of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseOnSlideClick(Boolean closeOnSlideClick)
	{
		this.closeOnSlideClick = closeOnSlideClick;
		return (J) this;
	}

	/**
	 * Method getCloseOnSwipeUpOrDown returns the closeOnSwipeUpOrDown of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery by swiping up or down
	 *
	 * @return the closeOnSwipeUpOrDown (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getCloseOnSwipeUpOrDown()
	{
		return closeOnSwipeUpOrDown;
	}

	/**
	 * Method setCloseOnSwipeUpOrDown sets the closeOnSwipeUpOrDown of this BlueImpGalleryOptions object.
	 * <p>
	 * Close the gallery by swiping up or down
	 *
	 * @param closeOnSwipeUpOrDown
	 * 		the closeOnSwipeUpOrDown of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseOnSwipeUpOrDown(Boolean closeOnSwipeUpOrDown)
	{
		this.closeOnSwipeUpOrDown = closeOnSwipeUpOrDown;
		return (J) this;
	}

	/**
	 * Method getEmulateTouchEvents returns the emulateTouchEvents of this BlueImpGalleryOptions object.
	 * <p>
	 * Emulate touch events on mouse-pointer devices such as desktop browsers
	 *
	 * @return the emulateTouchEvents (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getEmulateTouchEvents()
	{
		return emulateTouchEvents;
	}

	/**
	 * Method setEmulateTouchEvents sets the emulateTouchEvents of this BlueImpGalleryOptions object.
	 * <p>
	 * Emulate touch events on mouse-pointer devices such as desktop browsers
	 *
	 * @param emulateTouchEvents
	 * 		the emulateTouchEvents of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEmulateTouchEvents(Boolean emulateTouchEvents)
	{
		this.emulateTouchEvents = emulateTouchEvents;
		return (J) this;
	}

	/**
	 * Method getStopTouchEventsPropagation returns the stopTouchEventsPropagation of this BlueImpGalleryOptions object.
	 * <p>
	 * Stop touch events from bubbling up to ancestor elements of the Gallery
	 *
	 * @return the stopTouchEventsPropagation (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getStopTouchEventsPropagation()
	{
		return stopTouchEventsPropagation;
	}

	/**
	 * Method setStopTouchEventsPropagation sets the stopTouchEventsPropagation of this BlueImpGalleryOptions object.
	 * <p>
	 * Stop touch events from bubbling up to ancestor elements of the Gallery
	 *
	 * @param stopTouchEventsPropagation
	 * 		the stopTouchEventsPropagation of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStopTouchEventsPropagation(Boolean stopTouchEventsPropagation)
	{
		this.stopTouchEventsPropagation = stopTouchEventsPropagation;
		return (J) this;
	}

	/**
	 * Method getHidePageScrollbars returns the hidePageScrollbars of this BlueImpGalleryOptions object.
	 * <p>
	 * Hide the page scrollbars
	 *
	 * @return the hidePageScrollbars (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getHidePageScrollbars()
	{
		return hidePageScrollbars;
	}

	/**
	 * Method setHidePageScrollbars sets the hidePageScrollbars of this BlueImpGalleryOptions object.
	 * <p>
	 * Hide the page scrollbars
	 *
	 * @param hidePageScrollbars
	 * 		the hidePageScrollbars of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHidePageScrollbars(Boolean hidePageScrollbars)
	{
		this.hidePageScrollbars = hidePageScrollbars;
		return (J) this;
	}

	/**
	 * Method getDisableScroll returns the disableScroll of this BlueImpGalleryOptions object.
	 * <p>
	 * Stops any touches on the container from scrolling the page
	 *
	 * @return the disableScroll (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getDisableScroll()
	{
		return disableScroll;
	}

	/**
	 * Method setDisableScroll sets the disableScroll of this BlueImpGalleryOptions object.
	 * <p>
	 * Stops any touches on the container from scrolling the page
	 *
	 * @param disableScroll
	 * 		the disableScroll of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisableScroll(Boolean disableScroll)
	{
		this.disableScroll = disableScroll;
		return (J) this;
	}

	/**
	 * Method getCarousel returns the carousel of this BlueImpGalleryOptions object.
	 * <p>
	 * Carousel mode (shortcut for carousel specific options)
	 *
	 * @return the carousel (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getCarousel()
	{
		return carousel;
	}

	/**
	 * Method setCarousel sets the carousel of this BlueImpGalleryOptions object.
	 * <p>
	 * Carousel mode (shortcut for carousel specific options)
	 *
	 * @param carousel
	 * 		the carousel of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCarousel(Boolean carousel)
	{
		this.carousel = carousel;
		return (J) this;
	}

	/**
	 * Method getContinuous returns the continuous of this BlueImpGalleryOptions object.
	 * <p>
	 * Allow continuous navigation, moving from last to first
	 *
	 * @return the continuous (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getContinuous()
	{
		return continuous;
	}

	/**
	 * Method setContinuous sets the continuous of this BlueImpGalleryOptions object.
	 * <p>
	 * Allow continuous navigation, moving from last to first
	 *
	 * @param continuous
	 * 		the continuous of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContinuous(Boolean continuous)
	{
		this.continuous = continuous;
		return (J) this;
	}

	/**
	 * Method getUnloadElements returns the unloadElements of this BlueImpGalleryOptions object.
	 * <p>
	 * Remove elements outside of the preload range from the DOM
	 *
	 * @return the unloadElements (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getUnloadElements()
	{
		return unloadElements;
	}

	/**
	 * Method setUnloadElements sets the unloadElements of this BlueImpGalleryOptions object.
	 * <p>
	 * Remove elements outside of the preload range from the DOM
	 *
	 * @param unloadElements
	 * 		the unloadElements of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUnloadElements(Boolean unloadElements)
	{
		this.unloadElements = unloadElements;
		return (J) this;
	}

	/**
	 * Method getStartSlideshow returns the startSlideshow of this BlueImpGalleryOptions object.
	 * <p>
	 * Start with the automatic slideshow
	 *
	 * @return the startSlideshow (type Boolean) of this BlueImpGalleryOptions object.
	 */
	public Boolean getStartSlideshow()
	{
		return startSlideshow;
	}

	/**
	 * Method setStartSlideshow sets the startSlideshow of this BlueImpGalleryOptions object.
	 * <p>
	 * Start with the automatic slideshow
	 *
	 * @param startSlideshow
	 * 		the startSlideshow of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStartSlideshow(Boolean startSlideshow)
	{
		this.startSlideshow = startSlideshow;
		return (J) this;
	}

	/**
	 * Method getSlideshowInterval returns the slideshowInterval of this BlueImpGalleryOptions object.
	 * <p>
	 * Delay in milliseconds between slides for the automatic slideshow
	 *
	 * @return the slideshowInterval (type Integer) of this BlueImpGalleryOptions object.
	 */
	public Integer getSlideshowInterval()
	{
		return slideshowInterval;
	}

	/**
	 * Method setSlideshowInterval sets the slideshowInterval of this BlueImpGalleryOptions object.
	 * <p>
	 * Delay in milliseconds between slides for the automatic slideshow
	 *
	 * @param slideshowInterval
	 * 		the slideshowInterval of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideshowInterval(Integer slideshowInterval)
	{
		this.slideshowInterval = slideshowInterval;
		return (J) this;
	}

	/**
	 * Method getIndex returns the index of this BlueImpGalleryOptions object.
	 * <p>
	 * The starting index as integer.
	 *
	 * @return the index (type Integer) of this BlueImpGalleryOptions object.
	 */
	public Integer getIndex()
	{
		return index;
	}

	/**
	 * Method setIndex sets the index of this BlueImpGalleryOptions object.
	 * <p>
	 * The starting index as integer.
	 *
	 * @param index
	 * 		the index of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIndex(Integer index)
	{
		this.index = index;
		return (J) this;
	}

	/**
	 * Method getPreloadRange returns the preloadRange of this BlueImpGalleryOptions object.
	 * <p>
	 * The number of elements to load around the current index
	 *
	 * @return the preloadRange (type Integer) of this BlueImpGalleryOptions object.
	 */
	public Integer getPreloadRange()
	{
		return preloadRange;
	}

	/**
	 * Method setPreloadRange sets the preloadRange of this BlueImpGalleryOptions object.
	 * <p>
	 * The number of elements to load around the current index
	 *
	 * @param preloadRange
	 * 		the preloadRange of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPreloadRange(Integer preloadRange)
	{
		this.preloadRange = preloadRange;
		return (J) this;
	}

	/**
	 * Method getTransitionSpeed returns the transitionSpeed of this BlueImpGalleryOptions object.
	 * <p>
	 * The transition speed between slide changes in milliseconds
	 *
	 * @return the transitionSpeed (type Integer) of this BlueImpGalleryOptions object.
	 */
	public Integer getTransitionSpeed()
	{
		return transitionSpeed;
	}

	/**
	 * Method setTransitionSpeed sets the transitionSpeed of this BlueImpGalleryOptions object.
	 * <p>
	 * The transition speed between slide changes in milliseconds
	 *
	 * @param transitionSpeed
	 * 		the transitionSpeed of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTransitionSpeed(Integer transitionSpeed)
	{
		this.transitionSpeed = transitionSpeed;
		return (J) this;
	}

	/**
	 * Method getSlideshowTransitionSpeed returns the slideshowTransitionSpeed of this BlueImpGalleryOptions object.
	 * <p>
	 * The transition speed for automatic slide changes, set to an integer
	 *
	 * @return the slideshowTransitionSpeed (type Integer) of this BlueImpGalleryOptions object.
	 */
	public Integer getSlideshowTransitionSpeed()
	{
		return slideshowTransitionSpeed;
	}

	/**
	 * Method setSlideshowTransitionSpeed sets the slideshowTransitionSpeed of this BlueImpGalleryOptions object.
	 * <p>
	 * The transition speed for automatic slide changes, set to an integer
	 *
	 * @param slideshowTransitionSpeed
	 * 		the slideshowTransitionSpeed of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideshowTransitionSpeed(Integer slideshowTransitionSpeed)
	{
		this.slideshowTransitionSpeed = slideshowTransitionSpeed;
		return (J) this;
	}

	/**
	 * Method getIndicatorOptions returns the indicatorOptions of this BlueImpGalleryOptions object.
	 * <p>
	 * Indicator options
	 *
	 * @return the indicatorOptions (type BlueImpGalleryIndicatorOptions) of this BlueImpGalleryOptions object.
	 */
	@NotNull
	public BlueImpGalleryIndicatorOptions<?> getIndicatorOptions()
	{
		if (indicatorOptions == null)
		{
			indicatorOptions = new BlueImpGalleryIndicatorOptions<>();
		}
		return indicatorOptions;
	}

	/**
	 * Method setIndicatorOptions sets the indicatorOptions of this BlueImpGalleryOptions object.
	 * <p>
	 * Indicator options
	 *
	 * @param indicatorOptions
	 * 		the indicatorOptions of this BlueImpGalleryOptions object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIndicatorOptions(BlueImpGalleryIndicatorOptions indicatorOptions)
	{
		this.indicatorOptions = indicatorOptions;
		return (J) this;
	}
}
