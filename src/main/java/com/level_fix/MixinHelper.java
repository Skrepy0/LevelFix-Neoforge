package com.level_fix;

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
    public static String toRoman(int number) {

        if (number < 1) {
            throw new IllegalArgumentException("输入必须大于0");
        }

        // 定义罗马数字的基本组成部分
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (number <= 10) {
            if (number == 10) {
                return "X";
            } else
                return units[number];
        }
        // 分解数字的各个部分
        int thousandPart = number / 1000;
        int hundredPart = (number % 1000) / 100;
        int tenPart = (number % 100) / 10;
        int unitPart = number % 10;

        // 构建罗马数字字符串
        return thousands[thousandPart] + hundreds[hundredPart] + tens[tenPart] + units[unitPart];
    }
}
