module pl.edu.uwm.wmii.jakubgiecko.laboratorium00.l00 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.edu.uwm.wmii.jakubgiecko.laboratorium00.l00 to javafx.fxml;
    exports pl.edu.uwm.wmii.jakubgiecko.laboratorium00.l00;
}