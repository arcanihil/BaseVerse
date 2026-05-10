package com.arcanihil.baseverse;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItems {
    public static final DeferredItem<Item> RUBY = BaseVerseMod.ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties()
    );

    // Предмет, который позволяет ставить блок рубина
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = BaseVerseMod.ITEMS.register(
            "ruby_block",
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties())
    );
    // Метод инициализации (подавляем предупреждение - это нормально для регистрации)
    @SuppressWarnings("unused")
    public static void init() {
        // Пустой метод - нужен только для загрузки класса
    }
}