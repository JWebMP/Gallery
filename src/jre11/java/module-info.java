module com.jwebmp.plugins.blueimp.gallery {
	exports com.jwebmp.plugins.blueimp.gallery;
	exports com.jwebmp.plugins.blueimp.gallery.options;
	exports com.jwebmp.plugins.blueimp.gallery.features;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.blueimp.gallery.implementations.BlueImpGalleryExclusionsModule;

	requires com.jwebmp.core;
	requires java.validation;

	requires com.guicedee.logmaster;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	opens com.jwebmp.plugins.blueimp.gallery.options to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.blueimp.gallery.features to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.blueimp.gallery to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
}
