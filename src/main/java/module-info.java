module com.rufus.sambagui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.rufus.sambagui to javafx.fxml;
    exports com.rufus.sambagui;
    requires jcifs.ng;
}
