package com.level_fix;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec.BooleanValue ENCHANTMENT_ENABLED_ROMAN_NUMBERS = BUILDER.define("enchantment_enabled_roman_numbers", true);
    public static final ModConfigSpec.BooleanValue POTION_ENABLED_ROMAN_NUMBERS = BUILDER.define("potion_enabled_roman_numbers", true);
    public static final ModConfigSpec.BooleanValue EFFECT_ENABLED_ROMAN_NUMBERS = BUILDER.define("effect_enabled_roman_numbers", true);
    public static boolean getEnchantmentEnabledRomanNumbers() {
        return ENCHANTMENT_ENABLED_ROMAN_NUMBERS.get();
    }
    public static boolean getPotionEnabledRomanNumbers() {
        return POTION_ENABLED_ROMAN_NUMBERS.get();
    }
    public static boolean getEffectEnabledRomanNumbersInInventory() {
        return EFFECT_ENABLED_ROMAN_NUMBERS.get();
    }
    static final ModConfigSpec SPEC = BUILDER.build();
}
