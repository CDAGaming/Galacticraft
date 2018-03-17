package micdoodle8.mods.galacticraft.core.entities;

public interface IBubbleProvider {
    //    public IBubble getBubble();
    float getBubbleSize();

    boolean getBubbleVisible();

    void setBubbleVisible(boolean shouldRender);
}
