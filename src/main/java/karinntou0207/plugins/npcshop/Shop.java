package karinntou0207.plugins.npcshop;

import net.Indyuce.mmoitems.MMOItems;
import net.Indyuce.mmoitems.gui.CraftingStationView;
import net.mmogroup.mmolib.command.api.CommandTreeNode;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

//とりまライブラリにあったとこから映してきた
public class Shop {
    public static CommandTreeNode.CommandResult Open(Player player, String[] args){
        if (args.length < 3) {
            return CommandTreeNode.CommandResult.THROW_USAGE;
        } else if (!MMOItems.plugin.getCrafting().hasStation(args[2])) {
            player.sendMessage(ChatColor.RED + "There is no station called " + args[2] + ".");
            return CommandTreeNode.CommandResult.FAILURE;
        } else {
            (new CraftingStationView(player, MMOItems.plugin.getCrafting().getStation(args[2]), 1)).open();
            return CommandTreeNode.CommandResult.SUCCESS;
        }
    }
}
