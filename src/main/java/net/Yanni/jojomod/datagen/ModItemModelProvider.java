package net.Yanni.jojomod.datagen;

import net.Yanni.jojomod.JojoMod;
import net.Yanni.jojomod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JojoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.METEORITE_SHARD.get());
        basicItem(ModItems.SHINY_METEORITE_SHARD.get());

        basicItem(ModItems.STAR_PLATINUM.get());
    }
}