
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import dev.isa.akatsuki.astolfoforge.block.AstolfoFlowerBlock;
import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

public class AstolfoforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AstolfoforgeMod.MODID);
	public static final RegistryObject<Block> ASTOLFO_FLOWER = REGISTRY.register("astolfo_flower", () -> new AstolfoFlowerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
