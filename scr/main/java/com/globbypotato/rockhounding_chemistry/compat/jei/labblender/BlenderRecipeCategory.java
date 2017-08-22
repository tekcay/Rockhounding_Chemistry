package com.globbypotato.rockhounding_chemistry.compat.jei.labblender;

import javax.annotation.Nonnull;

import com.globbypotato.rockhounding_chemistry.compat.jei.RHRecipeCategory;
import com.globbypotato.rockhounding_chemistry.compat.jei.RHRecipeUID;
import com.globbypotato.rockhounding_chemistry.machines.gui.GuiLabBlender;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BlenderRecipeCategory extends RHRecipeCategory {

	private static final int INPUT_SLOT[] = new int[]{0,1,2,3,4,5,6,7,8};
	private static final int OUTPUT_SLOT = 10;

	private final static ResourceLocation guiTexture = GuiLabBlender.TEXTURE_REF;

	public BlenderRecipeCategory(IGuiHelper guiHelper) {
		super(guiHelper.createDrawable(guiTexture, 50, 19, 90, 75), "jei.lab_blender.name");
	}

	@Nonnull
	@Override
	public String getUid() {
		return RHRecipeUID.BLENDER;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		BlenderRecipeWrapper wrapper = (BlenderRecipeWrapper) recipeWrapper;	

        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
            	guiItemStacks.init(j + i * 3, true, j * 18, i * 18);
            }
        }
		guiItemStacks.init(OUTPUT_SLOT, false, 65, 55);

		for(int y = 0; y < wrapper.getInputs().size(); y++){
			ItemStack ingr = wrapper.getInputs().get(y);
			if(ingr != null){
				ingr.stackSize = wrapper.getInputs().get(y).stackSize;
				guiItemStacks.set(y, ingr);
			}
		}
		guiItemStacks.set(OUTPUT_SLOT, wrapper.getOutputs());
	}
}