package ch.epfl.cs107.icmaze.actor.util;

/**
 * Cooldown
 * Utility class to manage cooldowns and timers.
 */
public final class Cooldown {
    private float t = 0f;
    private float cd;

    /**
     * Default Cooldown constructor
     * 
     * @param cd (float): duration of the cooldown in seconds
     */
    public Cooldown(float cd) {
        this.cd = cd;
    }

    /**
     * Update the timer and check if the cooldown is over
     * 
     * @param dt (float): Delta time since last update
     * @return (boolean): true if the cooldown is ready, false otherwise
     */
    public boolean ready(float dt) {
        t += dt;
        if (t >= cd) {
            t = 0f;
            return true;
        }
        return false;
    }

    /**
     * Reset the timer to 0
     */
    public void reset() {
        t = 0f;
    }
}
