package eq.larry.dev.aud;

import eq.larry.dev.HypingMoney;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerAud implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        HypingMoney.get().getIgnoredPlayers().add(event.getPlayer());
        Bukkit.getScheduler().runTaskLaterAsynchronously((Plugin)HypingMoney.get(), () -> HypingMoney.get().getIgnoredPlayers().remove(event.getPlayer()), 5L);
    }
}
