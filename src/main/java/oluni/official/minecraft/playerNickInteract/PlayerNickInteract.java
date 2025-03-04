package oluni.official.minecraft.playerNickInteract;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerNickInteract extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onInteract(PlayerInteractAtEntityEvent e) {
        if (e.getPlayer().isSneaking()) {
            if (e.getRightClicked() instanceof Player) {
                Component message = Component.text(e.getRightClicked().getName());
                e.getPlayer().sendActionBar(message);
            }
        }
    }

}
