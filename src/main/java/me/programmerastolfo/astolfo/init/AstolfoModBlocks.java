
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.programmerastolfo.astolfo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import me.programmerastolfo.astolfo.block.AstolfoFlowerBlock;
import me.programmerastolfo.astolfo.AstolfoMod;

public class AstolfoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AstolfoMod.MODID);
	public static final RegistryObject<Block> ASTOLFO_FLOWER = REGISTRY.register("astolfo_flower", () -> new AstolfoFlowerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
