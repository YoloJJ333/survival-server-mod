package yolojj333.survival.mixin.recipe;

import net.minecraft.recipe.FireworkRocketRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FireworkRocketRecipe.class)
public abstract class FireworkRocketRecipeMixin {
    @ModifyConstant(
            method = "matches(Lnet/minecraft/recipe/input/CraftingRecipeInput;Lnet/minecraft/world/World;)Z",
            constant = @Constant(intValue = 3)
    )
    private int increaseMaxSpeed(int constant) {
        return 8;
    }
}
