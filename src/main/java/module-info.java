module com.example.demo1110 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;

    opens com.example.demo1110 to javafx.fxml;
    exports com.example.demo1110;
}