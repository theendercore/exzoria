package com.ender.exzoria.items.tools;

import com.ender.exzoria.items.util.ModItemTier;
import com.ender.exzoria.items.util.ModRarity;
import com.ender.exzoria.setup.ModSetup;
import net.minecraft.item.*;

public class VoidsteelPickaxe extends PickaxeItem {

    public VoidsteelPickaxe() {
        super(ModItemTier.VOIDSTEEL, 1, -2.8F, (new Item.Properties().group(ModSetup.EXZORIA).rarity(ModRarity.VOID)));
    }
}
