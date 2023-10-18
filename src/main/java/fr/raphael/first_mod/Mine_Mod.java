package fr.raphael.first_mod;

import fr.raphael.first_mod.item.Coke_Powder;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mine_Mod implements ModInitializer {
    public static final String MOD_ID = "first_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        Coke_Powder.registerModItems();
    }
}
