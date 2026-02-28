package com.level_fix.datagen;

import com.level_fix.LevelFix;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static com.level_fix.datagen.LangHelper.toRoman;

public class ModENUSLangProvider extends LanguageProvider {
    public ModENUSLangProvider(PackOutput output) {
        super(output, LevelFix.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("level_fix.configuration.enchantment_enabled_roman_numbers", "Enchantment Level Roman Numerals");
        add("level_fix.configuration.enchantment_enabled_roman_numbers.tooltip", "When disabled, enchantment levels will be displayed as Arabic numerals.");
        add("level_fix.configuration.potion_enabled_roman_numbers", "Potion Level Roman Numerals");
        add("level_fix.configuration.potion_enabled_roman_numbers.tooltip", "When disabled, potion effect levels will be displayed as Arabic numerals.");
        add("level_fix.configuration.effect_enabled_roman_numbers", "Effect UI Level Roman Numerals");
        add("level_fix.configuration.effect_enabled_roman_numbers.tooltip", "When disabled, the player's current effect levels will be displayed as Arabic numerals.");
        for (int i = 11; i <= 256; ++i) {
            add("enchantment.level." + i, toRoman(i));
            add("potion.potency." + i, toRoman(i));
        }
    }
}
