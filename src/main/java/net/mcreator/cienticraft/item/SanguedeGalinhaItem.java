
package net.mcreator.cienticraft.item;

@CienticraftModElements.ModElement.Tag
public class SanguedeGalinhaItem extends CienticraftModElements.ModElement {

	@ObjectHolder("cienticraft:sanguede_galinha")
	public static final Item block = null;

	public SanguedeGalinhaItem(CienticraftModElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TAB1ItemGroup.tab).maxStackSize(64));
			setRegistryName("sanguede_galinha");
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
