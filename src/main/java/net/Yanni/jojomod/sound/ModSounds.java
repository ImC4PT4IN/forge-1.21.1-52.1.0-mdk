package net.Yanni.jojomod.sound;

import net.Yanni.jojomod.JojoMod;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JojoMod.MOD_ID);

    public static final RegistryObject<SoundEvent> SUMMON_STAND_SOUND = registerSoundEvent("summon_stand_sound");

    public static final RegistryObject<SoundEvent> METEORITE_ORE_BREAK = registerSoundEvent("meteorite_ore_break");
    public static final RegistryObject<SoundEvent> METEORITE_ORE_STEP = registerSoundEvent("meteorite_ore_step");
    public static final RegistryObject<SoundEvent> METEORITE_ORE_PLACE = registerSoundEvent("meteorite_ore_place");
    public static final RegistryObject<SoundEvent> METEORITE_ORE_HIT = registerSoundEvent("meteorite_ore_hit");
    public static final RegistryObject<SoundEvent> METEORITE_ORE_FALL = registerSoundEvent("meteorite_ore_fall");

    public static final ForgeSoundType METEORITE_ORE_SOUNDS = new ForgeSoundType(1f,1f,
            ModSounds.METEORITE_ORE_BREAK, ModSounds.METEORITE_ORE_STEP, ModSounds.METEORITE_ORE_FALL, ModSounds.METEORITE_ORE_PLACE,
            ModSounds.METEORITE_ORE_HIT);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(JojoMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
