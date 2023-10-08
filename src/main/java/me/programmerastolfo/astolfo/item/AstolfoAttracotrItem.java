
package me.programmerastolfo.astolfo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AstolfoAttracotrItem extends Item {
	public AstolfoAttracotrItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
