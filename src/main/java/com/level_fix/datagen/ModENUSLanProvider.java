package com.level_fix.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.level_fix.helper.LangHelper.toRoman;

public class ModENUSLanProvider extends FabricLanguageProvider{


    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("text.autoconfig.level_fix.title","Level Fix Options");
        translationBuilder.add("text.autoconfig.level_fix.option.enchantmentEnableRomanNumbers","Enchantment Level Roman Numerals");
        translationBuilder.add("text.autoconfig.level_fix.option.enchantmentEnableRomanNumbers.@Tooltip","When disabled, enchantment levels will be displayed as Arabic numerals.");
        translationBuilder.add("text.autoconfig.level_fix.option.potionEnableRomanNumbers","Potion Level Roman Numerals");
        translationBuilder.add("text.autoconfig.level_fix.option.potionEnableRomanNumbers.@Tooltip","When disabled, potion effect levels will be displayed as Arabic numerals.");
        translationBuilder.add("text.autoconfig.level_fix.option.effectEnableRomanNumbers","Effect UI Level Roman Numerals");
        translationBuilder.add("text.autoconfig.level_fix.option.effectEnableRomanNumbers.@Tooltip","When disabled, the player's current effect levels will be displayed as Arabic numerals.");
        for (int i = 1; i <= 256; i++) {
            translationBuilder.add("enchantment.level." + i, toRoman(i));
            translationBuilder.add("potion.potency."+ i, toRoman(i));
        }
    }
}
