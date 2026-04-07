module com.example.cosmoform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cosmoform to javafx.fxml;
    exports com.example.cosmoform;
}