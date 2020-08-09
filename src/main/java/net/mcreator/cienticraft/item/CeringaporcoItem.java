
package net.mcreator.cienticraft.item;

@CienticraftModElements.ModElement.Tag
public class CeringaporcoItem extends CienticraftModElements.ModElement {

	@ObjectHolder("cienticraft:ceringaporco")
	public static final Item block = null;

	public CeringaporcoItem(CienticraftModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TAB1ItemGroup.tab).maxStackSize(64));
			setRegistryName("ceringaporco");
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
