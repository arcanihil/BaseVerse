package com.arcanihil.baseverse;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // Регистр для блоков
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BaseVerseMod.MOD_ID);

    // Сам блок рубина (копируем свойства алмазного блока: прочность, взрывоустойчивость и т.д.)
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.register(
            "ruby_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK))
    );
    @SuppressWarnings("unused")
    public static void init() {
        // Пустой метод - нужен только для загрузки класса
    }
}