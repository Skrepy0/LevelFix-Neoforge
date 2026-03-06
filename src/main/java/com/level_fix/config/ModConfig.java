package com.level_fix.config;


import com.level_fix.LevelFix;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = LevelFix.MOD_ID)
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public boolean enchantmentEnableRomanNumbers = true;
    @ConfigEntry.Gui.Tooltip
    public boolean potionEnableRomanNumbers = true;
    @ConfigEntry.Gui.Tooltip
    public boolean effectEnableRomanNumbers = true;
}
