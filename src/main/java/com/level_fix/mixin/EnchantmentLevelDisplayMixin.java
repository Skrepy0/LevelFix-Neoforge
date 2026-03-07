package com.level_fix.mixin;

import com.level_fix.Config;
import com.level_fix.MixinHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.level_fix.MixinHelper.getLevel;
import static com.level_fix.MixinHelper.toRoman;

@Mixin(Enchantment.class)
public class EnchantmentLevelDisplayMixin {
    @Redirect(method = "getFullname",at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;"))
    private static MutableComponent effectLevelComponent(String key) {
        if (Config.getEnchantmentEnabledRomanNumbers()) {
            int level = Integer.parseInt(getLevel(key));
            String text = toRoman(level);
            if (Config.getShowBoth()) {
                text += String.format(" §8<§6%d§8>§r", level);
            }
            return Component.literal(text);
        }
        return Component.literal(MixinHelper.getLevel(key));
    }
}
