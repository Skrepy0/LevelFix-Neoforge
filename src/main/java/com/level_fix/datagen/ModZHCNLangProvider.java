package com.level_fix.datagen;

import com.level_fix.LevelFix;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;


public class ModZHCNLangProvider extends LanguageProvider {
    public ModZHCNLangProvider(PackOutput output) {
        super(output, LevelFix.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {}
}
