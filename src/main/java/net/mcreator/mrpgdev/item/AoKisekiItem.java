
package net.mcreator.mrpgdev.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AoKisekiItem extends Item {
	public AoKisekiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
