package com.bonksharp;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class basic extends JavaPlugin {
    public basic() {
        // No-argument constructor
    }

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plug is enabled mcMusic");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plug is Disabled mcMusic");
    }
}