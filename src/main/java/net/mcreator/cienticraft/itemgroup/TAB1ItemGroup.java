
package net.mcreator.cienticraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cienticraft.item.CeringaporcoItem;
import net.mcreator.cienticraft.CienticraftModElements;

@CienticraftModElements.ModElement.Tag
public class TAB1ItemGroup extends CienticraftModElements.ModElement {
	public TAB1ItemGroup(CienticraftModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab_1") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CeringaporcoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
