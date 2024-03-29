import com.jwebmp.plugins.blueimp.gallery.implementations.BlueImpGalleryInclusionModule;

module com.jwebmp.plugins.blueimp.gallery {
    exports com.jwebmp.plugins.blueimp.gallery;
    exports com.jwebmp.plugins.blueimp.gallery.options;
    exports com.jwebmp.plugins.blueimp.gallery.features;

    requires static lombok;

    requires com.jwebmp.client;
    requires com.jwebmp.core;

    provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.blueimp.gallery.BlueImpGalleryPageConfigurator;

    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BlueImpGalleryInclusionModule;
    requires transitive com.jwebmp.core.base.angular.client;
    requires com.guicedee.jsonrepresentation;

    opens com.jwebmp.plugins.blueimp.gallery.options to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
    opens com.jwebmp.plugins.blueimp.gallery.features to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
    opens com.jwebmp.plugins.blueimp.gallery to com.guicedee.guicedinjection, com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
}
