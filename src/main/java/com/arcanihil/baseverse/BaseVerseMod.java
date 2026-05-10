package com.arcanihil.baseverse;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(BaseVerseMod.MOD_ID)
public class BaseVerseMod {
    public static final String MOD_ID = "baseverse";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public BaseVerseMod(IEventBus modEventBus) {
        // Регистрируем предметы и блоки
        ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        ModItems.init();
        ModBlocks.init();

        LOGGER.info("BaseVerse загружен! Привет из мира модов!");
    }
}