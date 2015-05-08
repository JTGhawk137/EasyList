package me.jtghawk137.easylist.commands;

import me.jtghawk137.easylist.EasyList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ListCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) { return true; }
        Player p = (Player) commandSender;
        p.sendMessage("Amount of players online: " + EasyList.getInstance().utils.getAmountOfPlayers() + "/" + Bukkit.getMaxPlayers());
        p.sendMessage("Online staff: " + EasyList.getInstance().utils.getStaffList().replaceAll("]", " "));
        return true;
    }
}
