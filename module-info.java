module com.example.assignment3a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment3a to javafx.fxml;
    exports com.example.assignment3a;
}