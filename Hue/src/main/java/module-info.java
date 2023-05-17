module nl.andretjuhh.hue {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens nl.andretjuhh.hue to javafx.fxml;
    exports nl.andretjuhh.hue;
}