package me.jtghawk137.easylist.commands;

import me.jtghawk137.easylist.EasyList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EasyListCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {
            System.out.println("Author: JTGhawk137");
            System.out.println("Version: " + EasyList.getInstance().getVersion());
            System.out.println("Commands: /list, /easylist");
            return true;
        }

        Player p = (Player) commandSender;
        p.sendMessage("Author: JTGhawk137");
        p.sendMessage("Version: " + EasyList.getInstance().getVersion());
        p.sendMessage("Commands: /list, /easylist");
        return true;
    }
}
