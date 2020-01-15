package com.github.axel012.ircbot;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.Random;

public class ChatUtils {
    private   static  String _colors[] = {"black","dark_blue","dark_green","dark_aqua","dark_red",
            "dark_purple","gold","gray","dark_gray","blue","green","aqua","light_purple","yellow"};
    private static Random _random = new Random();

    public  static void info(CommandSender sender,String message){
        sender.sendMessage(ChatColor.AQUA + "[INFO] " + ChatColor.WHITE + message);
    }

    public  static void log(CommandSender sender,String message){
        sender.sendMessage(ChatColor.GREEN + "[OK] " + ChatColor.WHITE + message);
    }
    public  static void error(CommandSender sender,String message){
        sender.sendMessage(ChatColor.RED + "[ERROR] " + ChatColor.WHITE + message);
    }
    public  static void warn(CommandSender sender,String message){
        sender.sendMessage(ChatColor.YELLOW + "[WARN] " + ChatColor.WHITE + message);
    }

    public  static  void twitchChatToMinecraft(String user,String message){
        //dispatch async event
        Bukkit.getServer().getScheduler()
            .scheduleSyncDelayedTask(IrcMain.getPlugin(IrcMain.class), new Runnable() {
            public void run() {
                int colorIndex = _random.nextInt(_colors.length);
                String color = _colors[colorIndex];
                String cmd = String.format("tellraw @a [\"\",{\"text\":\"[CHAT] \",\"color\":\"aqua\"},{\"text\":\"%s:\",\"color\":\"%s\"},{\"text\":\" %s\"}]",
                        user,color,message);
                System.out.println(cmd);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),cmd);
            }
        });

    }

    public  static  void execCommand(String cmd){
        //dispatch async event
        Bukkit.getServer().getScheduler()
                .scheduleSyncDelayedTask(IrcMain.getPlugin(IrcMain.class), new Runnable() {
                    public void run() {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(),cmd);
                    }
                });
    }


}
