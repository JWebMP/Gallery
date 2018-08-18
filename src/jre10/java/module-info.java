import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;

module com.jwebmp.plugins.blueimp.gallery {
	exports com.jwebmp.plugins.blueimp.gallery;
	exports com.jwebmp.plugins.blueimp.gallery.options;

	provides IPageConfigurator with BlueImpGalleryPageConfigurator;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.fasterxml.jackson.annotation;
	requires com.jwebmp.logmaster;
	requires java.logging;
}
