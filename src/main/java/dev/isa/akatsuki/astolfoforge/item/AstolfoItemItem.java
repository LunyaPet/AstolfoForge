
package dev.isa.akatsuki.astolfoforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AstolfoItemItem extends Item {
	public AstolfoItemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
