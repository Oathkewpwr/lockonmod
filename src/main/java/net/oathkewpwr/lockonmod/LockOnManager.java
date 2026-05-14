package net.oathkewpwr.lockonmod;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;

public class LockOnManager {
    // if null, not locked on
    private LivingEntity lockedTarget;
    // if true, free-lock is on
    private boolean freeLockActive;

    // Core API
    public void acquireTarget(ClientPlayerEntity player) {
        // TODO: Check for lockable targets in a cone in front of the player

    }

    public void clearLock() {
        // TODO: null lockedTarget, reset freeLockActive

    }

    public void tick(ClientPlayerEntity player) {
        // TODO: check if target is still lockable
        /*
        if target is dead or out of range, call clearLock()
        else if free lock is not active, steer camera towards target
         */

    }

    public void setFreeLock(boolean active) {
        this.freeLockActive = active;
    }


}
