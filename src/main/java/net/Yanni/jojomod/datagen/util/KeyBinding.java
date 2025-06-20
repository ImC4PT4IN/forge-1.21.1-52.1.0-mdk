package net.Yanni.jojomod.datagen.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

import java.security.Key;

public class KeyBinding {
    public static final String KEY_CATEGORY_JOJO = "key.category.jojomod.jojo";
    public static final String KEY_SUMMON_STAND = "key.jojomod.summon_stand";

    public static final KeyMapping SUMMONING_KEY = new KeyMapping(KEY_SUMMON_STAND, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Q, KEY_CATEGORY_JOJO);
}
