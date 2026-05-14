package net.oathkewpwr.lockonmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class LockOnClient implements ClientModInitializer {

    public static final LockOnManager LOCK_ON_MANAGER = new LockOnManager();

    @Override
    public void onInitializeClient() {
        LockOnInputHandler.register();
        LockOnHudRenderer.register();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;
            LockOnInputHandler.handleInput(LOCK_ON_MANAGER, client.player);
            LOCK_ON_MANAGER.tick(client.player);
        });
    }
}
