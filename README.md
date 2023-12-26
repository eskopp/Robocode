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
### Basic Project
The project does not need a main function, so it can be a bit complicated to build artifacts in different interpreters.

- Example
```java
import robocode.*;

public class MyBot extends Robot {

    // The run method is called when the battle starts
    public void run() {
         // ...
    }

}
```
### Build Class file
```bash
cd Niffler 
javac -cp robocode.jar Niffler.java
```

### Install Bot
- Ubuntu folder:
    ```bash
    ~/.robocode/robots
    ```
- Windows folder:
    ```bash
    C:\robocode\robots
    ```

### Windows Workflow
- Window:
    ```Powershell
    @echo off
    cd Niffler
    javac -cp robocode.jar Niffler.java 
    copy /Y Niffler.class ../Niffler.class
    :: Basic installation
    copy /Y Niffler.class C:\robocode\robots\Niffler.class
    ```
- Linux:
    ```bash
        cd Niffler
        javac -cp robocode.jar Niffler.java 
        cp Niffler.class ../Niffler.class
        cp Niffler.class ~/.robocode/robots/
    ```

## Robocode

