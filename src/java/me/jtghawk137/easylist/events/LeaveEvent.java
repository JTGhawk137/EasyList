package me.jtghawk137.easylist.events;

import me.jtghawk137.easylist.EasyList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        EasyList.getInstance().utils.removeStaff(e.getPlayer());
    }
}
