package com.level_fix.mixin;

import com.level_fix.Config;
import com.level_fix.MixinHelper;
import net.minecraft.client.gui.screens.inventory.EffectsInInventory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EffectsInInventory.class)
public class EffectRenderingInventoryScreenMixin {
    @Redirect(method = "getEffectName", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/effect/MobEffectInstance;getAmplifier()I", ordinal = 1))
    private int getEffectAmplifier(MobEffectInstance instance) {
        return instance.getAmplifier() - 246;
    }

    @Redirect(method = "getEffectName", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;"))
    private MutableComponent effectLevelComponent(String key) {
        if (Config.getEffectEnabledRomanNumbersInInventory()) return Component.translatable(key);
        return Component.literal(MixinHelper.getLevel(key));
    }
}
