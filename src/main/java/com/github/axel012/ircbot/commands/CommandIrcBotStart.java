package com.github.axel012.ircbot.commands;

import com.github.axel012.ircbot.BotManager;
import com.github.axel012.ircbot.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandIrcBotStart implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length > 0) return  false;
        if(sender instanceof Player) {
            try
            {
                if(BotManager.getInstance().start())
                {
                    ChatUtils.log(sender,"Bot Started!");
                    ChatUtils.info(sender,"Bot listening on channel https://www.twitch.tv/" + BotManager.getInstance().getCurrentChannel());
                }
                else
                {
                    ChatUtils.warn(sender,"Bot already started ");
                }
            }
            catch (Exception e)
            {
                ChatUtils.error(sender,"Exception ocurred " + e.getMessage());
            }
        }
        return true;
    }
}
