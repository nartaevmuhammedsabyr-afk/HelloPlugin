package me.nex.hello;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HelloPlugin extends JavaPlugin implements Listener {

@Override
public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
    getLogger().info("HelloPlugin enabled!");
}

@EventHandler
public void onJoin(PlayerJoinEvent event) {
    event.getPlayer().sendMessage("§aДобро пожаловать на сервер!");
}

}
