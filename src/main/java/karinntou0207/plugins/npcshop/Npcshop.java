package karinntou0207.plugins.npcshop;

import karinntou0207.plugins.npcshop.commands.ShopCommand;
import net.Indyuce.mmoitems.manager.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Npcshop extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("NPCShop enabled");
        getCommand("npcshop").setExecutor(new ShopCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NPCShop disabled");
    }
}
