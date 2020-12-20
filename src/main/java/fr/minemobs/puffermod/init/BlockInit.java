package fr.minemobs.puffermod.init;

import fr.minemobs.puffermod.Puffermod;
import fr.minemobs.puffermod.object.block.WoodenFrameBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.SoundType.METAL;
import static net.minecraft.block.SoundType.WOOD;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Puffermod.modId);

    public static final RegistryObject<Block> wooden_frame = BLOCKS.register("wooden_frame", () -> new WoodenFrameBlock(
            Block.Properties.from(Blocks.REDSTONE_BLOCK).sound(WOOD)));

    public static final RegistryObject<Block> test_block = BLOCKS.register("test_block", () -> new Block(
            Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(METAL).notSolid().setOpaque(AbstractBlock.AbstractBlockState::isOpaqueCube)));
}
