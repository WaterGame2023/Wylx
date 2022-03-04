package Commands.BotUtil;

import Core.Commands.ServerCommand;
import Core.Events.SilentEvent;
import Core.ProcessPackage.ProcessPackage;

public class BotUtilPackage extends ProcessPackage {
    public BotUtilPackage() {
        super(
                new ServerCommand[]{
                        new PingCommand(),
                        new RestartCommand(),
                        new SystemCommand(),
                        new UpdateCommand()
                }, new SilentEvent[]{});
    }

    @Override
    public String getHeader() {
        return "Commands for interacting with and checking up on Wylx itself";
    }
}