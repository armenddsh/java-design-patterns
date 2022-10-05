package com.shala.design.patterns.structural.proxy;

public class App {
    public static void main(String[] args) {
        
        var commandExecutor = new ExecuteCommand();
        // commandExecutor.runCommand("rm rf *");

        commandExecutor.runCommand("ls");
    }
}