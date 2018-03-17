package micdoodle8.mods.galacticraft.api.world;

import net.minecraft.world.biome.Biome.SpawnListEntry;

import java.util.LinkedList;

/**
 * Implement this on any Galacticraft World Provider biome registered for a Celestial Body
 */
public interface IMobSpawnBiome {
    public void initialiseMobLists(LinkedList<SpawnListEntry> mobInfo);
}
