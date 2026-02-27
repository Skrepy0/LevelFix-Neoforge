# LevelFix

**LevelFix** 是一个轻量级的 NeoForge 模组，旨在修复 Minecraft 中附魔等级与药水效果等级的罗马数字显示问题。原版游戏在等级超过 10 后会显示为 `enchantment.level.255` 这类占位符，而药水效果在屏幕上的等级显示甚至会完全消失。本模组将这些占位符替换为准确的罗马数字（如 `CCLV`），并让效果 UI 中的等级重新出现，使游戏界面回归自然、清晰。

## 功能特点

- **修复附魔等级显示**：将附魔等级占位符（如 `enchantment.level.255`）转换为正确的罗马数字，最高支持 256 级。
- **修复药水效果等级显示**：同样修复药水效果等级占位符（如 `potion.potency.255`），以罗马数字显示。
- **修复效果 UI 等级显示**：修复效果 UI 界面中，超过 10 级的药水效果等级无法显示的问题，使其正确呈现罗马数字。
- **兼容性**：仅修改客户端显示，不改变游戏机制，完美兼容其他模组。
- **轻量高效**：通过 Mixin 和语言文件实现，无性能开销。

## 安装方法

1. 确保已安装 **NeoForge** 对应版本（需与模组支持的 Minecraft 版本匹配）。
2. 从 [Releases](https://github.com/Skrepy0/LevelFix-Neoforge/releases) 页面下载最新版本的 `LevelFix-x.x.x.jar`。
3. 将下载的 `.jar` 文件放入游戏目录的 `mods` 文件夹中。
4. 启动游戏，模组将自动生效。

## 兼容性

- **Minecraft 版本**：1.21.1
- **NeoForge 版本**：推荐使用最新稳定版
- **环境**：只需客户端安装

## 问题反馈

如果你在使用过程中遇到任何 Bug 或有功能建议，欢迎通过以下方式反馈：
- [GitHub Issues](https://github.com/Skrepy0/LevelFix-Neoforge/issues)

## 致谢

感谢所有参与测试和建议的玩家！如果你喜欢这个模组，不妨给项目点一个 Star ⭐，支持作者继续维护和更新。

---

**LevelFix** is a lightweight NeoForge mod designed to fix the display of Roman numerals for enchantment and potion effect levels in Minecraft. In vanilla, when levels exceed 10, placeholders such as `enchantment.level.255` appear, and potion effect levels may even disappear entirely from the UI. This mod replaces those placeholders with accurate Roman numerals (e.g., `CCLV`) and restores the missing level display in the effects UI, bringing the interface back to a natural and clear state.

## Features

- **Fixes Enchantment Level Display**: Converts enchantment level placeholders (like `enchantment.level.255`) into correct Roman numerals, supporting up to level 256.
- **Fixes Potion Effect Level Display**: Similarly converts potion effect level placeholders (like `potion.potency.255`) to Roman numerals.
- **Fixes Effect UI Level Display**: Resolves the issue where potion effect levels above 10 are not shown in the effects UI, ensuring they are correctly displayed as Roman numerals.
- **Compatibility**: Only modifies client-side visuals; does not alter game mechanics and works seamlessly with other mods.
- **Lightweight and Efficient**: Implemented via Mixin and language files with zero performance overhead.

## Installation

1. Ensure you have the corresponding version of **NeoForge** installed (matching the mod's supported Minecraft version).
2. Download the latest `LevelFix-x.x.x.jar` from the [Releases](https://github.com/Skrepy0/LevelFix-Neoforge/releases) page.
3. Place the downloaded `.jar` file into the `mods` folder of your game directory.
4. Launch the game; the mod will take effect automatically.

## Compatibility

- **Minecraft Version**: 1.21.1
- **NeoForge Version**: Latest stable release recommended
- **Environment**: Client-side only installation required

## Feedback

If you encounter any bugs or have feature suggestions, please report them via:
- [GitHub Issues](https://github.com/Skrepy0/LevelFix-Neoforge/issues)

## Acknowledgements

Thanks to all players who participated in testing and provided suggestions! If you like this mod, feel free to give the project a Star ⭐ to support continued maintenance and updates.

---