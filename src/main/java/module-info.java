module com.github.alvesxy {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.github.alvesxy to javafx.fxml;
    opens com.github.alvesxy.controller to javafx.fxml;

    exports com.github.alvesxy.controller;
    exports com.github.alvesxy;
}