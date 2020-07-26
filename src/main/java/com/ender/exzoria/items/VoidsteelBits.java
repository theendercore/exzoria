package com.ender.exzoria.items;

import com.ender.exzoria.items.util.ModRarity;
import com.ender.exzoria.setup.ModSetup;
import net.minecraft.item.Item;

public class VoidsteelBits extends Item {

    public VoidsteelBits() {
        super(new Properties().group(ModSetup.EXZORIA).rarity(ModRarity.VOID)
        );
    }
}
