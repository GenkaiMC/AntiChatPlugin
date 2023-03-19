package fr.genkai.antichatplugin.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class ChatEvent implements Listener {

    @EventHandler
    public void chatEvent(PlayerChatEvent e) {
        e.setCancelled(true);
    }

}
