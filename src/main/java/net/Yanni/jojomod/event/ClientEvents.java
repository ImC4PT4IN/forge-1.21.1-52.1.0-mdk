package net.Yanni.jojomod.event;

import net.Yanni.jojomod.JojoMod;
import net.Yanni.jojomod.datagen.util.KeyBinding;
import net.Yanni.jojomod.sound.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = JojoMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {


        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinding.SUMMONING_KEY.consumeClick()) {
                if (Minecraft.getInstance().player != null && Minecraft.getInstance().level != null) {
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal("Summoned a stand"));
                    Minecraft.getInstance().level.playSound(
                            Minecraft.getInstance().player,
                            Minecraft.getInstance().player.blockPosition(),
                            ModSounds.SUMMON_STAND_SOUND.get(),
                            SoundSource.PLAYERS,
                            1.0f,
                            1.0f
                    );
                }
            }
        }
    }
    @Mod.EventBusSubscriber(modid =  JojoMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.SUMMONING_KEY);
        }
    }
}
