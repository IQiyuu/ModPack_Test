package net.iqiyu.katatest.item;

import net.iqiyu.katatest.Katatest;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Katatest.MOD_ID);

    public static final RegistryObject<Item> KATANA = ITEMS.register("katana",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .durability(100)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    @SubscribeEvent
    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(KATANA);
        }

    }
}
