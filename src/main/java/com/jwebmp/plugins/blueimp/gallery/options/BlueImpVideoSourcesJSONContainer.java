package com.jwebmp.plugins.blueimp.gallery.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class BlueImpVideoSourcesJSONContainer<J extends BlueImpVideoSourcesJSONContainer<J>>
		extends JavaScriptPart<J>
{
	/**
	 * A list of all the sources
	 */
	private final Set<BlueImpVideoSourcesJSON> sourcesJSONS = new LinkedHashSet<>();

	/**
	 * Constructs a new javascript part
	 */
	public BlueImpVideoSourcesJSONContainer()
	{
		//No config required
	}

	/**
	 * Method getSourcesJSONS returns the sourcesJSONS of this BlueImpVideoSourcesJSONContainer object.
	 * <p>
	 * A list of all the sources
	 *
	 * @return the sourcesJSONS (type Set BlueImpVideoSourcesJSON ) of this BlueImpVideoSourcesJSONContainer object.
	 */
	@NotNull
	@JsonValue
	public Set<BlueImpVideoSourcesJSON> getSourcesJSONS()
	{
		return sourcesJSONS;
	}
}
