@echo off
cd Niffler
javac -cp robocode.jar Niffler.java 
copy /Y Niffler.class ../Niffler.class
:: Basic installation
copy /Y Niffler.class C:\robocode\robots\Niffler.class