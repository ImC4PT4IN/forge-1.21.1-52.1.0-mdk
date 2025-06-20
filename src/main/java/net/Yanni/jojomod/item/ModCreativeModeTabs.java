package net.Yanni.jojomod.item;

import net.Yanni.jojomod.JojoMod;
import net.Yanni.jojomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JojoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JOJO_ITEMS_TAB = CREATIVE_MODE_TABS.register("jojo_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METEORITE_SHARD.get()))
                    .title(Component.translatable("creativetab.jojomod.meteorite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.METEORITE_SHARD.get());
                        output.accept(ModItems.SHINY_METEORITE_SHARD.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> JOJO_BLOCKS_TAB = CREATIVE_MODE_TABS.register("jojo_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.METEORITE_BLOCK.get()))
                    .withTabsBefore(JOJO_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.jojomod.meteorite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.METEORITE_ORE.get());
                        output.accept(ModBlocks.METEORITE_BLOCK.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> JOJO_STANDS_TAB = CREATIVE_MODE_TABS.register("jojo_stands_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STAR_PLATINUM.get()))
                    .withTabsBefore(JOJO_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.jojomod.jojo_stands"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STAR_PLATINUM.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
