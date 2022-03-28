package Commands.ServerSettings;

import Core.Commands.CommandContext;
import Core.Commands.ServerCommand;
import Database.DiscordServer;
import Database.ServerIdentifiers;
import net.dv8tion.jda.api.Permission;

public class SetPrefix extends ServerCommand {
    public SetPrefix() {
        super("setprefix", CommandPermission.DISCORD_PERM, Permission.ADMINISTRATOR,
                "set prefix for server");
    }

    @Override
    public void runCommand(CommandContext ctx) {
        DiscordServer db = ctx.db();
        String[] args = ctx.args();
        if (args.length != 2) return;
        ctx.event().getMessage().reply("Changing prefix to " + args[1]).queue();
        db.setSetting(ServerIdentifiers.Prefix, args[1]);
    }
}