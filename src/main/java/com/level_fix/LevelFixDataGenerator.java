package com.level_fix;

import com.level_fix.datagen.ModENUSLanProvider;
import com.level_fix.datagen.ModZHCNLanProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;

public class LevelFixDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModENUSLanProvider::new);
        pack.addProvider(ModZHCNLanProvider::new);
    }
}
