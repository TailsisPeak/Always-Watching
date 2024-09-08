
package net.mcreator.alwaysskibidi.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdavancetechItem extends Item {
	public AdavancetechItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}
}
