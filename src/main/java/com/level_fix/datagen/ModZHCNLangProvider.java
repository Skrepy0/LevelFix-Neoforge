package com.level_fix.datagen;

import com.level_fix.LevelFix;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;


public class ModZHCNLangProvider extends LanguageProvider {
    public ModZHCNLangProvider(PackOutput output) {
        super(output, LevelFix.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add("level_fix.configuration.enchantment_enabled_roman_numbers","附魔等级启用罗马数字");
        add("level_fix.configuration.enchantment_enabled_roman_numbers.tooltip","关闭后，§d附魔等级§r将显示为阿拉伯数字");
        add("level_fix.configuration.potion_enabled_roman_numbers","药水等级启用罗马数字");
        add("level_fix.configuration.potion_enabled_roman_numbers.tooltip","关闭后，§d药水效果等级§r将显示为阿拉伯数字");
        add("level_fix.configuration.effect_enabled_roman_numbers","效果等级ui显示启用罗马数字");
        add("level_fix.configuration.effect_enabled_roman_numbers.tooltip","关闭后，玩家当前的§d效果等级§r将显示为阿拉伯数字");
    }
}
