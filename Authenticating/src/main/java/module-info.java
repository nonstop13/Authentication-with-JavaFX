module com.mycompany.authenticating {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.authenticating to javafx.fxml;
    exports com.mycompany.authenticating;
}
