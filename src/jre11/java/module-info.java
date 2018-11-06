import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;
import com.jwebmp.plugins.blueimp.gallery.implementations.BlueImpGalleryExclusionsModule;

module com.jwebmp.plugins.blueimp.gallery {
	exports com.jwebmp.plugins.blueimp.gallery;
	exports com.jwebmp.plugins.blueimp.gallery.options;
	exports com.jwebmp.plugins.blueimp.gallery.features;

	provides IPageConfigurator with BlueImpGalleryPageConfigurator;

	provides IGuiceScanModuleExclusions with BlueImpGalleryExclusionsModule;
	provides IGuiceScanJarExclusions with BlueImpGalleryExclusionsModule;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.fasterxml.jackson.annotation;
	requires com.jwebmp.logmaster;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	opens com.jwebmp.plugins.blueimp.gallery.options to com.jwebmp.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.blueimp.gallery.features to com.jwebmp.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.blueimp.gallery to com.jwebmp.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
}
