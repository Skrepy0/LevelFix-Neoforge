package com.level_fix.mixin;

import com.level_fix.config.ConfigHelper;
import com.level_fix.helper.MixinHelper;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PotionContentsComponent.class)
public class PotionUtilMixin {
    @Redirect(method = "buildTooltip(Ljava/lang/Iterable;Ljava/util/function/Consumer;FF)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/text/Text;translatable(Ljava/lang/String;)Lnet/minecraft/text/MutableText;"))
    private static MutableText redirectBuildTooltip(String key) {
        if (ConfigHelper.getPotionEnableRomanNumbers()) return Text.translatable(key);
        if (key.startsWith("potion.potency.")) {
            return Text.literal(MixinHelper.getLevel(key));
        }
        return Text.translatable(key);
    }
}
