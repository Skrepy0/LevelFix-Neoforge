package com.level_fix;

import com.level_fix.datagen.ModENUSLangProvider;
import com.level_fix.datagen.ModZHCNLangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = LevelFix.MOD_ID)
public class LevelFixDataGen {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        event.addProvider(new ModENUSLangProvider(packOutput));
        event.addProvider(new ModZHCNLangProvider(packOutput));
    }
}
