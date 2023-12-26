# Robocode

## Install 
### Download GitHub Repository

```bash
git clone --recursive https://github.com/eskopp/Robocode.git
```

### Install RoboCode
- [Download as GitHub Release](https://github.com/robo-code/robocode/releases)

- [Download from SourceForge](https://robocode.sourceforge.io/download)

- [Website](https://robocode.sourceforge.io/)

I recommend that you install Robocode in the following directory.

- Windows
    ```cmd
    C:\robocode
    ```
- Linux / Ubuntu
    ```bash
    /usr/games/robocode
    ```


## Java Code
The project does not need a main function, so it can be a bit complicated to build artifacts in different interpreters.

- Example
```java
import robocode.*;

public class MyStandingBot extends Robot {

    // The run method is called when the battle starts
    public void run() {
        // Here, do nothing, the bot will simply stand still
        // Note that this is the main battle loop, so the bot will just pause here.
        // You could also achieve this using a sleep method to introduce a delay:
        // try {
        //     Thread.sleep(1000000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }

    // The onScannedRobot method is called when another bot is detected
    public void onScannedRobot(ScannedRobotEvent e) {
        // Here, do nothing as the bot is standing still
    }

    // The onHitByBullet method is called when your bot is hit by a bullet
    public void onHitByBullet(HitByBulletEvent e) {
        // Here, do nothing as the bot is standing still
    }

    // The onHitWall method is called when your bot hits a wall
    public void onHitWall(HitWallEvent e) {
        // Here, do nothing as the bot is standing still
    }
}

```

