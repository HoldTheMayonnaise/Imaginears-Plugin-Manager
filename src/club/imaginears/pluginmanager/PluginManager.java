package club.imaginears.pluginmanager;

import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class PluginManager extends JavaPlugin {


    private static PluginManager instance;
    public static Boolean debug = true;
    public File warpsFile;
    public FileConfiguration warps;

    private static club.imaginears.pluginmanager.PluginManager c;

    @Override
    public void onEnable() {

        instance = this;
        registerCommands();
        registerEvents();
        Bukkit.getConsoleSender().sendMessage("[Imaginears Plugin Manager] Starting");

    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static PluginManager getInstance() {
        return instance;
    }



    public void registerCommands() {
        getCommand("reloadplugin").setExecutor(new ReloadPluginCommand());
        getCommand("loadplugin").setExecutor(new LoadPluginCommand());
        getCommand("unloadplugin").setExecutor(new UnloadPluginCommand());
    }

    public void registerEvents() {
        org.bukkit.plugin.PluginManager pm = Bukkit.getPluginManager();

    }

}
