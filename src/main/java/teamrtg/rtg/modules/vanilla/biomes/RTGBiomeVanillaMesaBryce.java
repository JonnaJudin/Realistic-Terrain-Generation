package teamrtg.rtg.modules.vanilla.biomes;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import teamrtg.rtg.api.tools.deco.DecoBoulder;
import teamrtg.rtg.api.tools.deco.DecoCactus;
import teamrtg.rtg.api.tools.deco.DecoDeadBush;
import teamrtg.rtg.api.tools.deco.DecoShrub;
import teamrtg.rtg.api.tools.deco.collection.DecoCollectionDesertRiver;
import teamrtg.rtg.api.tools.surface.SurfaceBase;
import teamrtg.rtg.api.util.math.CanyonColour;
import teamrtg.rtg.api.world.RTGWorld;
import teamrtg.rtg.api.world.biome.TerrainBase;
import teamrtg.rtg.api.world.biome.surface.part.SurfacePart;
import teamrtg.rtg.modules.vanilla.RTGBiomeVanilla;

public class RTGBiomeVanillaMesaBryce extends RTGBiomeVanilla {

    public RTGBiomeVanillaMesaBryce() {

        super(Biomes.MUTATED_MESA, Biomes.RIVER);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainBase() {
            @Override
            public float generateNoise(RTGWorld rtgWorld, int x, int y, float biomeWeight, float border, float river) {

                return terrainBryce(x, y, rtgWorld.simplex, river, 20f, biomeWeight);
            }
        };
    }

    @Override
    public SurfacePart initSurface() {

        return SurfaceBase.surfaceMesa(this, CanyonColour.MESA_WHITE);
    }

    @Override
    public void initDecos() {

        this.addDecoCollection(new DecoCollectionDesertRiver());

        DecoBoulder decoBoulder = new DecoBoulder();
        decoBoulder.boulderBlock = Blocks.COBBLESTONE.getDefaultState();
        decoBoulder.maxY = 83;
        this.addDeco(decoBoulder);

        DecoShrub decoShrub = new DecoShrub();
        decoShrub.loops = 3;
        decoShrub.maxY = 90;
        addDeco(decoShrub);

        DecoDeadBush decoDeadBush = new DecoDeadBush();
        decoDeadBush.maxY = 100;
        decoDeadBush.loops = 3;
        this.addDeco(decoDeadBush);

        DecoCactus decoCactus = new DecoCactus();
        decoCactus.soilBlock = Blocks.SAND.getStateFromMeta(1);
        decoCactus.soilMeta = (byte) 1;
        decoCactus.loops = 18;
        decoCactus.maxY = 100;
        this.addDeco(decoCactus);
    }
}
