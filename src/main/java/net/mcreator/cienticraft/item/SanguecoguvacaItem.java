
package net.mcreator.cienticraft.item;

@CienticraftModElements.ModElement.Tag
public class SanguecoguvacaItem extends CienticraftModElements.ModElement {

	@ObjectHolder("cienticraft:sanguecoguvaca")
	public static final Item block = null;

	public SanguecoguvacaItem(CienticraftModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TAB1ItemGroup.tab).maxStackSize(64));
			setRegistryName("sanguecoguvaca");
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
