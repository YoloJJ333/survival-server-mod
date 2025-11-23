package yolojj333.survival.mixin.item;

import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.GoatHornItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GoatHornItem.class)
public abstract class GoatHornItemMixin {
    @Redirect(
            method = "use",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/player/ItemCooldownManager;set(Lnet/minecraft/item/ItemStack;I)V"
            )
    )
    private void removeHornCooldown(ItemCooldownManager instance, ItemStack stack, int duration) {
    }
}
