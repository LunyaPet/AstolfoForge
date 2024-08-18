
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

public class AstolfoforgeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AstolfoforgeMod.MODID);
	public static final RegistryObject<SoundEvent> ASTOLFO_YAHOO = REGISTRY.register("astolfo_yahoo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("astolfoforge", "astolfo_yahoo")));
}
