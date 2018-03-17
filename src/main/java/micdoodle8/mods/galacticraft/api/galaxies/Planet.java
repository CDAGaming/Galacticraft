package micdoodle8.mods.galacticraft.api.galaxies;

import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Planet extends CelestialBody {
    protected SolarSystem parentSolarSystem = null;

    public Planet(String planetName) {
        super(planetName);
    }

    public static void addMobToSpawn(String planetName, SpawnListEntry mobData) {
        GalaxyRegistry.getCelestialBodyFromUnlocalizedName("planet." + planetName).addMobInfo(mobData);
    }

    public SolarSystem getParentSolarSystem() {
        return this.parentSolarSystem;
    }

    public Planet setParentSolarSystem(SolarSystem galaxy) {
        this.parentSolarSystem = galaxy;
        return this;
    }

    @Override
    public int getID() {
        return GalaxyRegistry.getPlanetID(this.bodyName);
    }

    @Override
    public String getUnlocalizedNamePrefix() {
        return "planet";
    }
}
