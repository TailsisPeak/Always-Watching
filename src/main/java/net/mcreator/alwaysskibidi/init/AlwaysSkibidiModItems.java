
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;

import net.mcreator.alwaysskibidi.item.AGiftFromTheForestItem;
import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

public class AlwaysSkibidiModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<Item, Item> A_GIFT_FROM_THE_FOREST = REGISTRY.register("a_gift_from_the_forest", AGiftFromTheForestItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
