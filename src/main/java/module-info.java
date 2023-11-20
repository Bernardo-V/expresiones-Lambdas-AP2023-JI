module com.argentinaprograma.expresioneslambdas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.argentinaprograma.expresioneslambdas to javafx.fxml;
    exports com.argentinaprograma.expresioneslambdas;
}