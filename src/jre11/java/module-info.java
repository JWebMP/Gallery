module com.jwebmp.plugins.blueimp.gallery {
	exports com.jwebmp.plugins.blueimp.gallery;
	exports com.jwebmp.plugins.blueimp.gallery.options;
	exports com.jwebmp.plugins.blueimp.gallery.features;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.blueimp.gallery.implementations.BlueImpGalleryExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.blueimp.gallery.implementations.BlueImpGalleryExclusionsModule;

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
