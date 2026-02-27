package com.level_fix;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static com.mojang.text2speech.Narrator.LOGGER;

@Mod(value = LevelFix.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = LevelFix.MOD_ID, value = Dist.CLIENT)
public class LevelFixClient {
    public LevelFixClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        LOGGER.info("LevelFixClient setup");
    }
}
