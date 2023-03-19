package fr.genkai.antichatplugin;

import fr.genkai.antichatplugin.event.ChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiChatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new ChatEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
