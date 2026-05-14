package net.oathkewpwr.lockonmod;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

public class LockOnHudRenderer {

    public static void register() {
        // HudRenderCallback.EVENT.register(LockOnHudRenderer::render)
        // Fabric API: net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
    }

    private static void render(DrawContext context, RenderTickCounter tickCounter) {
        /*
        TODO:
        1. If not locked, return
        2. Project the target's 3D world position to 2D screen coords
            WorldRenderer/GameRenderer for projection matrix
            Look at other mods' code code for how they do world-to-screen projection
            modelViewMatrix and projectionMatrix from RenderSystem
        3. Draw reticle at that position
         */
    }
}
