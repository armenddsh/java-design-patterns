package com.shala.design.patterns.structural.proxy;

public class ExecuteCommand implements CommandExecutor {
    private CommandExecutor executor;

    public ExecuteCommand() {
        this.executor = new CommandExectorImpl();
    } 

    @Override
    public void runCommand(final String cmd) throws IllegalArgumentException {
        if (cmd.contains("rm")) {
            throw new IllegalArgumentException("You are not allowed to execute this command");
        }
        
        this.executor.runCommand(cmd);
    }
}
