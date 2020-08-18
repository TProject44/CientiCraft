
package net.mcreator.cienticraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cienticraft.block.GloboBlock;
import net.mcreator.cienticraft.CienticraftModElements;

@CienticraftModElements.ModElement.Tag
public class Tab4ItemGroup extends CienticraftModElements.ModElement {
	public Tab4ItemGroup(CienticraftModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab_4") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GloboBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
