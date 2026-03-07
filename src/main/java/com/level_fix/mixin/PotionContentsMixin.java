package com.level_fix.mixin;

import com.level_fix.Config;
import com.level_fix.MixinHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.alchemy.PotionContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.level_fix.MixinHelper.getLevel;
import static com.level_fix.MixinHelper.toRoman;

@Mixin(PotionContents.class)
public class PotionContentsMixin {
    @Redirect(method = "addPotionTooltip(Ljava/lang/Iterable;Ljava/util/function/Consumer;FF)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;"))
    private static MutableComponent redirectTooltip(String key) {
        if (Config.getPotionEnabledRomanNumbers()) {
            if (key.startsWith("potion.potency.")) {
                int level = Integer.parseInt(getLevel(key));
                if (Config.getShowBoth()){
                    return Component.literal(String.format("%s §8<§6%d§8>§r", toRoman(level), level));
                }else return Component.literal(toRoman(level));
            }
            return Component.translatable(key);
        }
        if (key.startsWith("potion.potency.")) {
            return Component.literal(MixinHelper.getLevel(key));
        }
        return Component.translatable(key);
    }
}
