module nl.andretjuhh {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.andretjuhh to javafx.fxml;
    exports nl.andretjuhh;
}
