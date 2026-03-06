package com.level_fix.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {


    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("text.autoconfig.level_fix.title","Level Fix 选项");
        translationBuilder.add("text.autoconfig.level_fix.option.enchantmentEnableRomanNumbers","附魔等级启用罗马数字");
        translationBuilder.add("text.autoconfig.level_fix.option.enchantmentEnableRomanNumbers.@Tooltip","关闭后，附魔等级将显示为阿拉伯数字");
        translationBuilder.add("text.autoconfig.level_fix.option.potionEnableRomanNumbers","药水等级启用罗马数字");
        translationBuilder.add("text.autoconfig.level_fix.option.potionEnableRomanNumbers.@Tooltip","关闭后，药水效果等级将显示为阿拉伯数字");
        translationBuilder.add("text.autoconfig.level_fix.option.effectEnableRomanNumbers","效果等级ui显示启用罗马数字");
        translationBuilder.add("text.autoconfig.level_fix.option.effectEnableRomanNumbers.@Tooltip","关闭后，玩家当前的效果等级将显示为阿拉伯数字");
    }
}
