module com.example.examiantionsystem1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examiantionsystem1 to javafx.fxml;
    exports com.example.examiantionsystem1;
}