package rtg.world.gen.terrain.enhancedbiomes;

import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainEBCreekBed extends TerrainBase
{
	public TerrainEBCreekBed()
	{

	}

	@Override
	public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river)
	{
        return terrainFlatLakes(x, y, simplex, river, 3f, 60f);
	}
}
