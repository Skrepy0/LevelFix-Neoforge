package com.level_fix.helper;

public class MixinHelper {
    private MixinHelper() {
    }

    public static String getLevel(String key) {
        int lastDotIndex = key.lastIndexOf(".");
        String level = "";
        if (lastDotIndex >= 0) {
            level = key.substring(lastDotIndex + 1);
        }
        return level;
    }
}
