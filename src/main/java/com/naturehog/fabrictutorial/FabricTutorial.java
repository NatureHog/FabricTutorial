package com.naturehog.fabrictutorial;


import com.naturehog.fabrictutorial.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class FabricTutorial implements ModInitializer {

    public static final String MOD_ID = "nh_fabrictutorial";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
