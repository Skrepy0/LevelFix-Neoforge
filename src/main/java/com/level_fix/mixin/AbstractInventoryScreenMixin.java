package com.level_fix.mixin;

import com.level_fix.config.ConfigHelper;
import com.level_fix.helper.MixinHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractInventoryScreen.class)
@Environment(EnvType.CLIENT)
public class AbstractInventoryScreenMixin {

    @Redirect(method = "getStatusEffectDescription", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/effect/StatusEffectInstance;getAmplifier()I", ordinal = 1))
    private int getEffectAmplifier2(StatusEffectInstance instance) {
        return instance.getAmplifier() - 246;
    }


    @Redirect(method = "getStatusEffectDescription", at = @At(value = "INVOKE", target = "Lnet/minecraft/text/Text;translatable(Ljava/lang/String;)Lnet/minecraft/text/MutableText;"))
    private MutableText effectLevelComponent(String key) {
        if (ConfigHelper.getEffectEnableRomanNumbers()) return Text.translatable(key);
        return Text.literal(MixinHelper.getLevel(key));
    }
}
