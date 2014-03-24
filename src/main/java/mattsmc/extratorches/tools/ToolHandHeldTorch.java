package mattsmc.extratorches.tools;

import mattsmc.extratorches.common.ExtraTorches;
import mattsmc.extratorches.common.ExtraTorchesItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ToolHandHeldTorch extends ItemSword  {
	public ToolHandHeldTorch() {
		super(ExtraTorchesItems.TorchMaterial);
		setCreativeTab(ExtraTorches.ExtraTorchesTab);
		setUnlocalizedName("ToolHandHeldTorch");
		setTextureName(ExtraTorches.MODID + ":toolHandHeldTorch");
		setFull3D();
		
	}
}
