
package net.mcreator.cienticraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.cienticraft.itemgroup.Tab3ItemGroup;
import net.mcreator.cienticraft.CienticraftModElements;

@CienticraftModElements.ModElement.Tag
public class TubovacacogumeloItem extends CienticraftModElements.ModElement {
	@ObjectHolder("cienticraft:tubovacacogumelo")
	public static final Item block = null;
	public TubovacacogumeloItem(CienticraftModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Tab3ItemGroup.tab).maxStackSize(64));
			setRegistryName("tubovacacogumelo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
