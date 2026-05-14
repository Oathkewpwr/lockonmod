package net.oathkewpwr.lockonmod;

import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Mouse.class)
public abstract class CameraController {

    @Inject(method = "updateMouse", at = @At("HEAD"), cancellable = true)
    private void onUpdateMouse(CallbackInfo ci) {
        /*
        TODO:
        1. Get LockOnManager instance
        2. If not locked, or if free lock is active, return
        3. If locked:
            Calculate desired yaw/pitch to face lockedTarget
            (Math.atan2 on the deltaTick between player pos and target pos)
            Lerp current yaw/pitch toward the lockedTarget (smooth tracking)
            write the result to player.setYaw() and player.setPitch()
            ci.cancel() to suppress vanilla mouse input
         */
    }

}
