package com.the_cube_man69.protectionplus.world;

import com.the_cube_man69.protectionplus.block.BlockPotatoOre;
import com.the_cube_man69.protectionplus.block.BlockProPlus;
import com.the_cube_man69.protectionplus.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;


public class ProPlusWorldGenOre implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
        case -1:
            generateNether(random, chunkX * 16, chunkZ * 16, world);
            break;
        case 0:
            generateSurface(random, chunkX * 16, chunkZ * 16, world);
            break;
        case 1:
            generateEnd(random, chunkX * 16, chunkZ * 16, world);
            break;
        default:
            ;
        }
    }

    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVainSize, int maxVainSize ,int spawnChance)
    {
        for(int i = 0;i < spawnChance; i++)
        {
            int defaultChunkSize = 16;

            int xPos = posX + random.nextInt(defaultChunkSize);
            int yPos = minY + random.nextInt(maxY - minY);
            int zPos = posZ + random.nextInt(defaultChunkSize);

            new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), blockSpawn).generate(world,random, xPos, yPos, zPos);
        }
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world)
    {

    }

    private void generateSurface(Random random, int chunkX, int chunkZ, World world)
    {
        addOre(ModBlocks.potatoOre, Blocks.stone, random, world, chunkX, chunkZ, 30, 100, 5, 10, 20);
    }

    private void generateNether(Random random, int chunkX, int i1, World world)
    {

    }
}
