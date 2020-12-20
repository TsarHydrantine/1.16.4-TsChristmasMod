package com.tsarhydrantine.tsbase.tsBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class MagicBlock extends BlockItem {

	public MagicBlock(Block blockIn, Properties builder) {
		super(blockIn, builder);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
