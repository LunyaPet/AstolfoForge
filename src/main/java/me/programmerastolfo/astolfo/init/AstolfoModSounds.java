
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.programmerastolfo.astolfo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import me.programmerastolfo.astolfo.AstolfoMod;

public class AstolfoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AstolfoMod.MODID);
	public static final RegistryObject<SoundEvent> ASTOLFO_YAHOO = REGISTRY.register("astolfo_yahoo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("astolfo", "astolfo_yahoo")));
}
