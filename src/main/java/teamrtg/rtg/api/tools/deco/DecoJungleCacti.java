package teamrtg.rtg.api.tools.deco;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CACTUS;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import teamrtg.rtg.api.tools.feature.WorldGenJungleCacti;
import teamrtg.rtg.api.world.RTGWorld;
import teamrtg.rtg.api.world.biome.deco.DecoBase;
import teamrtg.rtg.api.world.gen.RealisticBiomeGenerator;

/**
 * 
 * @author WhichOnesPink
 *
 */
public class DecoJungleCacti extends DecoBase
{
    
	public float strengthFactor;
	public int maxY;
	public boolean sandOnly;
	public int extraHeight;
	public byte sandMeta;
	
	public DecoJungleCacti()
	{
		super();
		
		/**
		 * Default values.
		 * These can be overridden when configuring the Deco object in the realistic biome.
		 */
		this.strengthFactor = 8f;
		this.maxY = 255; // No height limit by default.
		this.sandOnly = false;
		this.extraHeight = 7;
		this.sandMeta = (byte)1;
		
		this.addDecoTypes(DecoType.CACTUS);
	}
	
	@Override
	public void generate(RTGWorld rtgWorld, Random rand, int chunkX, int chunkY, float strength, float river, RealisticBiomeGenerator realisticBiomeGenerator, boolean hasPlacedVillageBlocks)
	{
		if (this.allowed) {

            if (TerrainGen.decorate(rtgWorld.world, rand, new BlockPos(chunkX, 0, chunkY), CACTUS)) {
                
            	WorldGenerator worldGenerator = new WorldGenJungleCacti(this.sandOnly, rand.nextInt(this.extraHeight), this.sandMeta);
            	
                for (int i = 0; i < this.strengthFactor * strength; i++)
                {
                    int intX = chunkX + rand.nextInt(16);// + 8;
                    int intY = rand.nextInt(160);
                    int intZ = chunkY + rand.nextInt(16);// + 8;
                    
                    if (intY < this.maxY)
                    {
                    	worldGenerator.generate(rtgWorld.world, rand, new BlockPos(intX, intY, intZ));
                    }
                }
            }
		}
	}
}
