
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mrpgdev.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mrpgdev.block.TestBlock;
import net.mcreator.mrpgdev.MrpgDevMod;

public class MrpgDevModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MrpgDevMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
