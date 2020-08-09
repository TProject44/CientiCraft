
package net.mcreator.cienticraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cienticraft.item.TuboItem;
import net.mcreator.cienticraft.CienticraftModElements;

@CienticraftModElements.ModElement.Tag
public class Tab2ItemGroup extends CienticraftModElements.ModElement {
	public Tab2ItemGroup(CienticraftModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab_2") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TuboItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
