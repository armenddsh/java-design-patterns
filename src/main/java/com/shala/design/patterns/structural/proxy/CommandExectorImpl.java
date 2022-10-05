package com.shala.design.patterns.structural.proxy;

public class CommandExectorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) {
        System.out.println("Executing command: " + cmd);
    }
}