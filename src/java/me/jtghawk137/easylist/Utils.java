package me.jtghawk137.easylist;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import java.util.ArrayList;

public class Utils {

    private ArrayList<String> staffList = new ArrayList<>();

    public void getStaff() {
        for(Player p : Bukkit.getOnlinePlayers()) {
            if(staffList.contains(p.getDisplayName())) {
                return;
            }
            if (p.hasPermission("easylist.staff")) {
                staffList.add(p.getDisplayName());
            }
        }
    }

    public void removeStaff(Player p) {
        if(staffList.contains(p.getDisplayName()))
        staffList.remove(p.getDisplayName());
    }

    public String getStaffList() {
        if(staffList.isEmpty()) { return "No staff are online..."; }

        return staffList.toString();
    }

    public int getAmountOfPlayers() {
        int players = 0;

        for(Player p : Bukkit.getOnlinePlayers()) {
            players++;
        }
        return players;
    }
}
