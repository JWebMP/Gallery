package com.jwebmp.plugins.blueimp.gallery.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BlueImpGalleryInclusionModule implements IGuiceScanModuleInclusions<BlueImpGalleryInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.blueimp.gallery");
		return set;
	}
}
