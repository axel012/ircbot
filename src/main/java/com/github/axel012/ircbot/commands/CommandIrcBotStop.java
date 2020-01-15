package com.github.axel012.ircbot.commands;

import com.github.axel012.ircbot.BotManager;
import com.github.axel012.ircbot.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandIrcBotStop implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length > 0) return  false;
        if(BotManager.getInstance().stop()){
            ChatUtils.log(sender,"Stopped successfully");
        }else{
            ChatUtils.warn(sender,"Already stopped!");
        }
        return true;
    }
}
