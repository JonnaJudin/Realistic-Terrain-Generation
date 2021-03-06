package teamrtg.rtg.modules.vanilla;

import teamrtg.rtg.api.module.ModBiomes;
import teamrtg.rtg.modules.vanilla.biomes.*;

/**
 * @author topisani
 */
public class RealisticVanillaBiomes extends ModBiomes {

    public RTGBiomeVanillaBeach BEACH;
    public RTGBiomeVanillaBirchForest BIRCH_FOREST;
    public RTGBiomeVanillaBirchForestHills BIRCH_FOREST_HILLS;
    public RTGBiomeVanillaBirchForestHillsM BIRCH_FOREST_HILLS_M;
    public RTGBiomeVanillaBirchForestM BIRCH_FOREST_M;
    public RTGBiomeVanillaColdBeach COLD_BEACH;
    public RTGBiomeVanillaColdTaiga COLD_TAIGA;
    public RTGBiomeVanillaColdTaigaHills COLD_TAIGA_HILLS;
    public RTGBiomeVanillaColdTaigaM COLD_TAIGA_M;
    public RTGBiomeVanillaDeepOcean DEEP_OCEAN;
    public RTGBiomeVanillaDesert DESERT;
    public RTGBiomeVanillaDesertHills DESERT_HILLS;
    public RTGBiomeVanillaDesertM DESERT_M;
    public RTGBiomeVanillaExtremeHills EXTREME_HILLS;
    public RTGBiomeVanillaExtremeHillsEdge EXTREME_HILLS_EDGE;
    public RTGBiomeVanillaExtremeHillsM EXTREME_HILLS_M;
    public RTGBiomeVanillaExtremeHillsPlus EXTREME_HILLS_PLUS;
    public RTGBiomeVanillaExtremeHillsPlusM EXTREME_HILLS_PLUS_M;
    public RTGBiomeVanillaFlowerForest FLOWER_FOREST;
    public RTGBiomeVanillaForest FOREST;
    public RTGBiomeVanillaForestHills FOREST_HILLS;
    public RTGBiomeVanillaFrozenOcean FROZEN_OCEAN;
    public RTGBiomeVanillaFrozenRiver FROZEN_RIVER;
    public RTGBiomeVanillaIceMountains ICE_MOUNTAINS;
    public RTGBiomeVanillaIcePlains ICE_PLAINS;
    public RTGBiomeVanillaIcePlainsSpikes ICE_PLAINS_SPIKES;
    public RTGBiomeVanillaJungle JUNGLE;
    public RTGBiomeVanillaJungleEdge JUNGLE_EDGE;
    public RTGBiomeVanillaJungleEdgeM JUNGLE_EDGE_M;
    public RTGBiomeVanillaJungleHills JUNGLE_HILLS;
    public RTGBiomeVanillaJungleM JUNGLE_M;
    public RTGBiomeVanillaMegaSpruceTaiga MEGA_SPRUCE_TAIGA;
    public RTGBiomeVanillaMegaTaiga MEGA_TAIGA;
    public RTGBiomeVanillaMegaTaigaHills MEGA_TAIGA_HILLS;
    public RTGBiomeVanillaMesa MESA;
    public RTGBiomeVanillaMesaBryce MESA_BRYCE;
    public RTGBiomeVanillaMesaPlateau MESA_PLATEAU;
    public RTGBiomeVanillaMesaPlateauF MESA_PLATEAU_F;
    public RTGBiomeVanillaMesaPlateauFM MESA_PLATEAU_F_M;
    public RTGBiomeVanillaMesaPlateauM MESA_PLATEAU_M;
    public RTGBiomeVanillaMushroomIsland MUSHROOM_ISLAND;
    public RTGBiomeVanillaMushroomIslandShore MUSHROOM_ISLAND_SHORE;
    public RTGBiomeVanillaOcean OCEAN;
    public RTGBiomeVanillaPlains PLAINS;
    public RTGBiomeVanillaRedwoodTaigaHills REDWOOD_TAIGA_HILLS;
    public RTGBiomeVanillaRiver RIVER;
    public RTGBiomeVanillaRoofedForest ROOFED_FOREST;
    public RTGBiomeVanillaRoofedForestM ROOFED_FOREST_M;
    public RTGBiomeVanillaSavanna SAVANNA;
    public RTGBiomeVanillaSavannaM SAVANNA_M;
    public RTGBiomeVanillaSavannaPlateau SAVANNA_PLATEAU;
    public RTGBiomeVanillaSavannaPlateauM SAVANNA_PLATEAU_M;
    public RTGBiomeVanillaStoneBeach STONE_BEACH;
    public RTGBiomeVanillaSunflowerPlains SUNFLOWER_PLAINS;
    public RTGBiomeVanillaSwampland SWAMPLAND;
    public RTGBiomeVanillaSwamplandM SWAMPLAND_M;
    public RTGBiomeVanillaTaiga TAIGA;
    public RTGBiomeVanillaTaigaHills TAIGA_HILLS;
    public RTGBiomeVanillaTaigaM TAIGA_M;

    @Override
    public void initBiomes() {

        addBiome(BEACH = new RTGBiomeVanillaBeach());
        addBiome(BIRCH_FOREST = new RTGBiomeVanillaBirchForest());
        addBiome(BIRCH_FOREST_HILLS = new RTGBiomeVanillaBirchForestHills());
        addBiome(BIRCH_FOREST_HILLS_M = new RTGBiomeVanillaBirchForestHillsM());
        addBiome(BIRCH_FOREST_M = new RTGBiomeVanillaBirchForestM());
        addBiome(COLD_BEACH = new RTGBiomeVanillaColdBeach());
        addBiome(COLD_TAIGA = new RTGBiomeVanillaColdTaiga());
        addBiome(COLD_TAIGA_HILLS = new RTGBiomeVanillaColdTaigaHills());
        addBiome(COLD_TAIGA_M = new RTGBiomeVanillaColdTaigaM());
        addBiome(DEEP_OCEAN = new RTGBiomeVanillaDeepOcean());
        addBiome(DESERT = new RTGBiomeVanillaDesert());
        addBiome(DESERT_HILLS = new RTGBiomeVanillaDesertHills());
        addBiome(DESERT_M = new RTGBiomeVanillaDesertM());
        addBiome(EXTREME_HILLS = new RTGBiomeVanillaExtremeHills());
        addBiome(EXTREME_HILLS_EDGE = new RTGBiomeVanillaExtremeHillsEdge());
        addBiome(EXTREME_HILLS_M = new RTGBiomeVanillaExtremeHillsM());
        addBiome(EXTREME_HILLS_PLUS = new RTGBiomeVanillaExtremeHillsPlus());
        addBiome(EXTREME_HILLS_PLUS_M = new RTGBiomeVanillaExtremeHillsPlusM());
        addBiome(FLOWER_FOREST = new RTGBiomeVanillaFlowerForest());
        addBiome(FOREST = new RTGBiomeVanillaForest());
        addBiome(FOREST_HILLS = new RTGBiomeVanillaForestHills());
        addBiome(FROZEN_OCEAN = new RTGBiomeVanillaFrozenOcean());
        addBiome(FROZEN_RIVER = new RTGBiomeVanillaFrozenRiver());
        addBiome(ICE_MOUNTAINS = new RTGBiomeVanillaIceMountains());
        addBiome(ICE_PLAINS = new RTGBiomeVanillaIcePlains());
        addBiome(ICE_PLAINS_SPIKES = new RTGBiomeVanillaIcePlainsSpikes());
        addBiome(JUNGLE = new RTGBiomeVanillaJungle());
        addBiome(JUNGLE_EDGE = new RTGBiomeVanillaJungleEdge());
        addBiome(JUNGLE_EDGE_M = new RTGBiomeVanillaJungleEdgeM());
        addBiome(JUNGLE_HILLS = new RTGBiomeVanillaJungleHills());
        addBiome(JUNGLE_M = new RTGBiomeVanillaJungleM());
        addBiome(MEGA_SPRUCE_TAIGA = new RTGBiomeVanillaMegaSpruceTaiga());
        addBiome(MEGA_TAIGA = new RTGBiomeVanillaMegaTaiga());
        addBiome(MEGA_TAIGA_HILLS = new RTGBiomeVanillaMegaTaigaHills());
        addBiome(MESA = new RTGBiomeVanillaMesa());
        addBiome(MESA_BRYCE = new RTGBiomeVanillaMesaBryce());
        addBiome(MESA_PLATEAU = new RTGBiomeVanillaMesaPlateau());
        addBiome(MESA_PLATEAU_F = new RTGBiomeVanillaMesaPlateauF());
        addBiome(MESA_PLATEAU_F_M = new RTGBiomeVanillaMesaPlateauFM());
        addBiome(MESA_PLATEAU_M = new RTGBiomeVanillaMesaPlateauM());
        addBiome(MUSHROOM_ISLAND = new RTGBiomeVanillaMushroomIsland());
        addBiome(MUSHROOM_ISLAND_SHORE = new RTGBiomeVanillaMushroomIslandShore());
        addBiome(OCEAN = new RTGBiomeVanillaOcean());
        addBiome(PLAINS = new RTGBiomeVanillaPlains());
        addBiome(REDWOOD_TAIGA_HILLS = new RTGBiomeVanillaRedwoodTaigaHills());
        addBiome(RIVER = new RTGBiomeVanillaRiver());
        addBiome(ROOFED_FOREST = new RTGBiomeVanillaRoofedForest());
        addBiome(ROOFED_FOREST_M = new RTGBiomeVanillaRoofedForestM());
        addBiome(SAVANNA = new RTGBiomeVanillaSavanna());
        addBiome(SAVANNA_M = new RTGBiomeVanillaSavannaM());
        addBiome(SAVANNA_PLATEAU = new RTGBiomeVanillaSavannaPlateau());
        addBiome(SAVANNA_PLATEAU_M = new RTGBiomeVanillaSavannaPlateauM());
        addBiome(STONE_BEACH = new RTGBiomeVanillaStoneBeach());
        addBiome(SUNFLOWER_PLAINS = new RTGBiomeVanillaSunflowerPlains());
        addBiome(SWAMPLAND = new RTGBiomeVanillaSwampland());
        addBiome(SWAMPLAND_M = new RTGBiomeVanillaSwamplandM());
        addBiome(TAIGA = new RTGBiomeVanillaTaiga());
        addBiome(TAIGA_HILLS = new RTGBiomeVanillaTaigaHills());
        addBiome(TAIGA_M = new RTGBiomeVanillaTaigaM());
    }
}
