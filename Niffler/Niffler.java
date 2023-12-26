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
        ahead(150); // Move forward a bit more

        // If close to a wall, turn away from the wall
        if (getX() < 50 || getX() > getBattleFieldWidth() - 50 || getY() < 50 || getY() > getBattleFieldHeight() - 50) {
            back(50);
            turnRight(90);
        }

        // Randomly change direction to avoid predictability
        if (Math.random() < 0.05) {
            turnRight(Math.random() * 90);
        }
    }

    // Event handler for when the robot hits a wall
    public void onHitWall(HitWallEvent e) {
        // Turn away from the wall
        back(20);
        turnRight(90);
    }
}
