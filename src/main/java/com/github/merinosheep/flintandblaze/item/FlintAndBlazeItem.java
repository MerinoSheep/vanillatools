package com.github.merinosheep.flintandblaze.item;

import com.github.merinosheep.flintandblaze.Main;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
public class FlintAndBlazeItem extends Item {
    public FlintAndBlazeItem() {
        super(new Item.Properties().setNoRepair().maxStackSize(1).defaultMaxDamage(260).group(ItemGroup.TOOLS));
    }

    @Override 
    public ActionResultType onItemUse(ItemUseContext context) {		
		BlockPos pos = context.getPos().up();//fire shoudl be set on top of the block that was right clicked and not replaced
		ItemStack stack = context.getItem();
		context.getWorld().setBlockState(pos,Blocks.FIRE.getDefaultState());
		//stack.setDamage(stack.getDamage()+1); 
		//if (stack.getDamage() >= stack.getMaxDamage()){
			stack.damageItem(1, context.getPlayer(),(onBroken)-> {
				Main.LOGGER.debug("BROKEN");
			});
			
		//}

		 //if this is reduced to 0, it is automatically "destroyed"
		 return ActionResultType.SUCCESS;
	}
       
}

