@echo off
title Build Niffler v0.0.0
cd Niffler 
javac -cp robocode.jar Niffler.java 
:: Linux: cp | Windows copy :)
copy Niffler.class ../Niffler.class
cd ..
@echo on