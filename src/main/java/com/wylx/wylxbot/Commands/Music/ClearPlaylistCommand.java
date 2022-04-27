package com.wylx.wylxbot.Commands.Music;

import com.wylx.wylxbot.Core.Events.Commands.CommandContext;
import com.wylx.wylxbot.Core.Events.Commands.ServerCommand;

public class ClearPlaylistCommand extends ServerCommand {
    ClearPlaylistCommand() {
        // TODO: Change perm
        super("clearplaylist",
                CommandPermission.EVERYONE,
                "Clear playlist and stop current track",
                "cp", "stop");
    }

    @Override
    public void runCommand(CommandContext ctx) {
        ctx.musicManager().clearQueue();
    }
}