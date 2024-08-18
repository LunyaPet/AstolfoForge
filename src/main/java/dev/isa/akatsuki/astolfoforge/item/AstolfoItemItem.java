
package dev.isa.akatsuki.astolfoforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AstolfoItemItem extends Item {
	public AstolfoItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
