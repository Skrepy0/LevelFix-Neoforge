package com.level_fix.mixin;

import com.level_fix.config.ConfigHelper;
import com.level_fix.helper.MixinHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Enchantment.class)
@Environment(EnvType.CLIENT)
public class EnchantmentLevelDisplayMixin {
    @Redirect(method = "getName", at = @At(value = "INVOKE", target = "Lnet/minecraft/text/Text;translatable(Ljava/lang/String;)Lnet/minecraft/text/MutableText;"))
    private static MutableText effectLevelComponent(String key) {
        if (ConfigHelper.getEnchantmentEnableRomanNumbers()) return Text.translatable(key);
        return Text.literal(MixinHelper.getLevel(key));
    }
}
