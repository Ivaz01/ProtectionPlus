package com.the_cube_man69.protectionplus.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ProPlusWorld
{
    public static void ProtectionPlus()
    {
        initialiseWorldGen();
    }

    public static void initialiseWorldGen()
    {
        registerWorldGen(new ProPlusWorldGenOre(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
    }
}
