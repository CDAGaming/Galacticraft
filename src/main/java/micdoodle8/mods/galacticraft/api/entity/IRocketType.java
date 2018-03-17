package micdoodle8.mods.galacticraft.api.entity;

import net.minecraft.util.text.TextComponentTranslation;

public interface IRocketType {
    EnumRocketType getType();

    int getRocketTier();

    enum EnumRocketType {
        DEFAULT(0, "", false, 2),
        INVENTORY27(1, new TextComponentTranslation("gui.rocket_type.0").getFormattedText(), false, 20),
        INVENTORY36(2, new TextComponentTranslation("gui.rocket_type.1").getFormattedText(), false, 38),
        INVENTORY54(3, new TextComponentTranslation("gui.rocket_type.2").getFormattedText(), false, 56),
        PREFUELED(4, new TextComponentTranslation("gui.rocket_type.3").getFormattedText(), true, 2);

        private int index;
        private String tooltip;
        private boolean preFueled;
        private int inventorySpace;

        private EnumRocketType(int index, String tooltip, boolean preFueled, int inventorySpace) {
            this.index = index;
            this.tooltip = tooltip;
            this.preFueled = preFueled;
            this.inventorySpace = inventorySpace;
        }

        public String getTooltip() {
            return this.tooltip;
        }

        public int getIndex() {
            return this.index;
        }

        public int getInventorySpace() {
            return this.inventorySpace;
        }

        public boolean getPreFueled() {
            return this.preFueled;
        }
    }
}
