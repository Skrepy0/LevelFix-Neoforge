package com.level_fix.mixin;

import com.level_fix.Config;
import com.level_fix.MixinHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.alchemy.PotionContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PotionContents.class)
public class PotionContentsMixin {
    @Redirect(method = "addPotionTooltip(Ljava/lang/Iterable;Ljava/util/function/Consumer;FF)V",at = @At(value = "INVOKE",target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;"))
    private static MutableComponent toRoman(String key) {
        if (Config.getPotionEnabledRomanNumbers()) return Component.translatable(key);
        if (key.startsWith("potion.potency.")) {
            return Component.literal(MixinHelper.getLevel(key));
        }
        return Component.translatable(key);
    }
}
