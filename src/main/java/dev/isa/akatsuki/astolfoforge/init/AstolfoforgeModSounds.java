
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

public class AstolfoforgeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AstolfoforgeMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ASTOLFO_YAHOO = REGISTRY.register("astolfo_yahoo", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("astolfoforge", "astolfo_yahoo")));
}
