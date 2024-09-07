
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.alwaysskibidi.potion.TheCurseOfTheForestMobEffect;
import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

public class AlwaysSkibidiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> THE_CURSE_OF_THE_FOREST = REGISTRY.register("the_curse_of_the_forest", () -> new TheCurseOfTheForestMobEffect());
}
