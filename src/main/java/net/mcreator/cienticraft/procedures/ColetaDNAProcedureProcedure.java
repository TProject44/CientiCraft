package net.mcreator.cienticraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cienticraft.item.CeringavacacogumeloItem;
import net.mcreator.cienticraft.item.CeringavacaItem;
import net.mcreator.cienticraft.item.CeringaporcoItem;
import net.mcreator.cienticraft.item.CeringaovelhaItem;
import net.mcreator.cienticraft.item.CeringagalinhaItem;
import net.mcreator.cienticraft.item.CeringaaranhaItem;
import net.mcreator.cienticraft.item.CeringaItem;
import net.mcreator.cienticraft.CienticraftModElements;

import java.util.Map;
import java.util.HashMap;

@CienticraftModElements.ModElement.Tag
public class ColetaDNAProcedureProcedure extends CienticraftModElements.ModElement {
	public ColetaDNAProcedureProcedure(CienticraftModElements instance) {
		super(instance, 10);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ColetaDNAProcedure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure ColetaDNAProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof MooshroomEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringavacacogumeloItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof CowEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringavacaItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof ChickenEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringagalinhaItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof PigEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringaporcoItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof SpiderEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringaaranhaItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
		if (((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(CeringaItem.block, (int) (1)).getItem()) && (entity instanceof SheepEntity))) {
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).inventory.clearMatchingItems(
						p -> ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(),
						(int) 1);
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CeringaovelhaItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
	}

	@SubscribeEvent
	public void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		Entity entity = event.getTarget();
		PlayerEntity sourceentity = event.getPlayer();
		if (event.getHand() != sourceentity.getActiveHand())
			return;
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("sourceentity", sourceentity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
