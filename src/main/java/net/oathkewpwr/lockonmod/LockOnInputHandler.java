package net.oathkewpwr.lockonmod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class LockOnInputHandler {
    public static KeyBinding lockOnKey; // base keybind is M2 (middle mouse button)
    public static KeyBinding freeLockKey; // base keybind is tab; keybind is held to use free lock

    public static void register() {
        // TODO: use KeyBindingHelper.registerKeyBinding() to register keybinds
        // Reminder syntax for later: KeyBinding(translationKey, type, defaultKey, category)
        KeyBindingHelper.registerKeyBinding(lockOnKey = new KeyBinding("key.lockonmod.lock_on", InputUtil.Type.MOUSE, 2, "category.lockonmod.general"));
        KeyBindingHelper.registerKeyBinding(freeLockKey = new KeyBinding("key.lockonmod.free_lock", InputUtil.Type.KEYSYM, 342, "category.lockonmod.general"));
    }

    public static void handleInput(LockOnManager manager, ClientPlayerEntity player) {
        // TODO: call this each tick from the ClientTickEvent
        /*
        if lock on key is pressed:
            if already locked, clear lock
            else, try to lock-on to a valid entity
         */

    }
}
