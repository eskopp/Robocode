import robocode.*;

public class Niffler extends Robot {

    public void run() {
        // Setze den Roboternamen
        // setName("Niffler"); // Entfernt, da der Robotername direkt in Robocode festgelegt wird
    
        // Setze die Farben des Roboters
        setColors(java.awt.Color.BLUE, java.awt.Color.YELLOW, java.awt.Color.RED, java.awt.Color.ORANGE, java.awt.Color.WHITE);
    
        // Setze die Radarsichtbarkeit
        setAdjustRadarForRobotTurn(true);
        setAdjustGunForRobotTurn(true);
    
        // Die Hauptprogrammschleife
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }
    
}
