import robocode.*;

public class Niffler extends Robot {

    // Flag to check if an enemy has been scanned
    boolean scannedEnemy = false;

    public void run() {
        // Set robot colors
        setColors(java.awt.Color.BLUE, java.awt.Color.YELLOW, java.awt.Color.RED, java.awt.Color.ORANGE, java.awt.Color.WHITE);
        setAdjustRadarForRobotTurn(true);
        setAdjustGunForRobotTurn(true);

        // Main loop
        while (true) {
            // Scan for enemies and perform dynamic movement
            scanForEnemies();
            performDynamicMovement();
        }
    }

    // Event handler for when an enemy is scanned
    public void onScannedRobot(ScannedRobotEvent e) {
        // Turn the radar toward the scanned enemy
        double radarTurn = getHeading() + e.getBearing() - getRadarHeading();
        turnRadarRight(radarTurn);

        // Turn the gun toward the scanned enemy and fire
        double gunTurn = getHeading() + e.getBearing() - getGunHeading();
        turnGunRight(gunTurn);

        // If the enemy is close, increase firepower
        if (e.getDistance() < 200) {
            fire(3);
        } else {
            fire(1);
        }
        scannedEnemy = true;
    }

    // Method to scan for enemies continuously
    private void scanForEnemies() {
        if (!scannedEnemy) {
            turnRadarRight(360);
        }
        scannedEnemy = false;
    }

    // Method for dynamic robot movement
    private void performDynamicMovement() {
        // Move forward by default
        ahead(100);

        // Randomly change direction to avoid predictability
        if (Math.random() < 0.1) {
            if (Math.random() < 0.5) {
                turnRight(Math.random() * 90);
            } else {
                turnLeft(Math.random() * 90);
            }
        }
    }
}
