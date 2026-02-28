package com.level_fix.mixin;

import com.level_fix.Config;
import com.level_fix.MixinHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Enchantment.class)
public class EnchantmentLevelDisplayMixin {
    @Redirect(method = "getFullname",at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;translatable(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;"))
    private static MutableComponent effectLevelComponent(String key) {
        if (Config.getEnchantmentEnabledRomanNumbers())return Component.translatable(key);
        return Component.literal(MixinHelper.getLevel(key));
    }
}
