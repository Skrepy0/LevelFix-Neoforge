package com.level_fix.config;

import me.shedaniel.autoconfig.AutoConfig;

public class ConfigHelper {
    public static ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    public static boolean getEnchantmentEnableRomanNumbers() {
        return config.enchantmentEnableRomanNumbers;
    }
    public static boolean getPotionEnableRomanNumbers() {
        return config.potionEnableRomanNumbers;
    }
    public static boolean getEffectEnableRomanNumbers() {
        return config.effectEnableRomanNumbers;
    }
}
