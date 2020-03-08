package com.jwebmp.plugins.blueimp.gallery.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BlueImpGalleryExclusionsModule
		implements IGuiceScanModuleExclusions<BlueImpGalleryExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.blueimp.gallery");
		return strings;
	}
}
