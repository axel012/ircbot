package com.github.axel012.ircbot.Utils;

import org.bukkit.Material;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Utils {
    public  static  void generateItemsList() throws  Exception {
        Material materials[] = Material.values();
            BufferedWriter writer = new BufferedWriter(new FileWriter("plugins/Ircbot/items.txt"));
        for (Material m : materials) {
            if (!m.isItem() && !m.isAir()) continue;
            writer.write(String.format("%s \n",m.name().toLowerCase()));
        }
        writer.close();
    }

}
