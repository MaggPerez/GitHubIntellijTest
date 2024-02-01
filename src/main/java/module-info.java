module org.example.githubintellijtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.githubintellijtest to javafx.fxml;
    exports org.example.githubintellijtest;
}