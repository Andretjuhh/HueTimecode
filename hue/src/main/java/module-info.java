module com.andretjuhh {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.andretjuhh to javafx.fxml;
    exports com.andretjuhh;
}
