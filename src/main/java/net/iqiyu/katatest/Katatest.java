package net.iqiyu.katatest;

import com.mojang.logging.LogUtils;
import net.iqiyu.katatest.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Katatest.MOD_ID)
public class Katatest {
    public static final String MOD_ID = "katatest";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Katatest() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register((modEventBus));

        MinecraftForge.EVENT_BUS.register(this);
    }

}
