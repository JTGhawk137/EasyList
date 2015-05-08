package me.jtghawk137.easylist;

import me.jtghawk137.easylist.commands.EasyListCommand;
import me.jtghawk137.easylist.commands.ListCommand;
import me.jtghawk137.easylist.events.JoinEvent;
import me.jtghawk137.easylist.events.LeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @Author JTGhawk137
 */

public class EasyList extends JavaPlugin {

    private String version = getDescription().getVersion();
    private static EasyList instance;

    public Utils utils = new Utils();

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
    }

    private void registerCommands() {
       getCommand("list").setExecutor(new ListCommand());
    }

    public String getVersion() {
        return version;
    }

    public static EasyList getInstance() { return instance; }
}