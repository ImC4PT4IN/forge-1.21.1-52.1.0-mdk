package net.Yanni.jojomod.item;

import net.Yanni.jojomod.JojoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JojoMod.MOD_ID);

    public static final RegistryObject<Item> STAR_PLATINUM = ITEMS.register("star_platinum",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> METEORITE_SHARD = ITEMS.register("meteorite_shard",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHINY_METEORITE_SHARD = ITEMS.register("shiny_meteorite_shard",
            () ->  new Item(new Item.Properties()));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
