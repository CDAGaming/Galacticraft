package micdoodle8.mods.galacticraft.api.transmission.tile;

import micdoodle8.mods.galacticraft.api.transmission.grid.IGridNetwork;

public interface INetworkProvider {
    IGridNetwork getNetwork();

    void setNetwork(IGridNetwork network);

    boolean hasNetwork();
}
