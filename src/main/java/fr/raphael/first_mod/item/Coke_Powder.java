package fr.raphael.first_mod.item;

import fr.raphael.first_mod.Mine_Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Coke_Powder {

    public static final Item COKE_POWDER = registerItem("coke_powder",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mine_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mine_Mod.LOGGER.debug("Registering Mod Items for " + Mine_Mod.MOD_ID);
    }
}
