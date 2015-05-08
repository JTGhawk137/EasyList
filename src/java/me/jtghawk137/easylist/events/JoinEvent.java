package me.jtghawk137.easylist.events;

import me.jtghawk137.easylist.EasyList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        EasyList.getInstance().utils.getStaff();
    }
}
