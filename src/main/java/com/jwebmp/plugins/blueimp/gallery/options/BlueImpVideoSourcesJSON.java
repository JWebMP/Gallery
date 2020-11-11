package com.jwebmp.plugins.blueimp.gallery.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * A sources reference for a video screen in the carousel
 *
 * @param <J>
 * 		Always this class
 */
@SuppressWarnings({"unused", "MissingClassJavaDoc"})
public class BlueImpVideoSourcesJSON<J extends BlueImpVideoSourcesJSON<J>>
		extends JavaScriptPart<J>
{
	/**
	 * A link to the video source url
	 */
	private String href;
	/**
	 * The type of source eg video/mp4 or video/ogg etcccc
	 */
	private String type = "video/*";
	/**
	 * A video id for youtube as a property
	 */
	private String youtube;

	/**
	 * Constructs a new javascript part
	 */
	public BlueImpVideoSourcesJSON()
	{
		//No config required
	}

	/**
	 * Constructs a new sources type
	 *
	 * @param href
	 * 		The source
	 * @param type
	 * 		The type
	 */
	public BlueImpVideoSourcesJSON(String href, String type)
	{
		this.href = href;
		this.type = type;
	}

	/**
	 * Method getHref returns the href of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * A link to the video source url
	 *
	 * @return the href (type String) of this BlueImpVideoSourcesJSON object.
	 */
	public String getHref()
	{
		return href;
	}

	/**
	 * Method setHref sets the href of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * A link to the video source url
	 *
	 * @param href
	 * 		the href of this BlueImpVideoSourcesJSON object.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHref(String href)
	{
		this.href = href;
		return (J) this;
	}

	/**
	 * Method getType returns the type of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * The type of source eg video/mp4 or video/ogg etcccc
	 *
	 * @return the type (type String) of this BlueImpVideoSourcesJSON object.
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Method setType sets the type of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * The type of source eg video/mp4 or video/ogg etcccc
	 *
	 * @param type
	 * 		the type of this BlueImpVideoSourcesJSON object.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setType(String type)
	{
		this.type = type;
		return (J) this;
	}

	/**
	 * Method getYoutube returns the youtube of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * A video id for youtube as a property
	 *
	 * @return the youtube (type boolean) of this BlueImpVideoSourcesJSON object.
	 */
	public String getYoutube()
	{
		return youtube;
	}

	/**
	 * Method setYoutube sets the youtube of this BlueImpVideoSourcesJSON object.
	 * <p>
	 * A video id for youtube as a property
	 *
	 * @param youtube
	 * 		the youtube of this BlueImpVideoSourcesJSON object.
	 *
	 * @return J
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setYoutube(@NotNull String youtube)
	{
		if (!youtube.isEmpty())
		{
			setType("text/html");
			this.youtube = youtube;
		}
		else
		{
			this.youtube = null;
		}
		return (J) this;
	}
}
