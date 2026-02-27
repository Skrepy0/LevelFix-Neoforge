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

        // Roman numeral levels up to 255
        for (int i = 11; i <= 256; ++i) {
            add("enchantment.level." + i, toRoman(i));
            add("potion.potency." + i, toRoman(i));
        }
    }
}
