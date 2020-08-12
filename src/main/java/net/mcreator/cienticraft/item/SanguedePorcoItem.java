
package net.mcreator.cienticraft.item;

@CienticraftModElements.ModElement.Tag
public class SanguedePorcoItem extends CienticraftModElements.ModElement {

	@ObjectHolder("cienticraft:sanguede_porco")
	public static final Item block = null;

	public SanguedePorcoItem(CienticraftModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TAB1ItemGroup.tab).maxStackSize(64));
			setRegistryName("sanguede_porco");
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
