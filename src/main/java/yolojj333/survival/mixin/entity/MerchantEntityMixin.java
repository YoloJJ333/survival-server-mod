package yolojj333.survival.mixin.entity;

import net.minecraft.entity.passive.MerchantEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MerchantEntity.class)
public abstract class MerchantEntityMixin {
    @ModifyConstant(
            method = "canBeLeashed",
            constant = @Constant(intValue = 0)
    )
    private int allowLeashing(int constant) {
        return 1;
    }
}
