package com.github.axel012.ircbot;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

import java.util.HashMap;
import java.util.Map;

public class CommandData implements ConfigurationSerializable {
    public boolean enable;
    public int timeout;
    public boolean shared;
    public boolean vote;
    public String  data;
    CommandData(Map<String, Object> map){
        enable = (Boolean) map.get("enable");
        timeout = (Integer)   map.get("timeout");
        shared = (Boolean) map.get("shared");
        vote = (Boolean)   map.get("vote");
        data = (String)   map.get("data");
    }
    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("enable", enable);
        map.put("timeout", timeout);
        map.put("shared", shared);
        map.put("vote", vote);
        map.put("data", data);
        return map;
    }
}
