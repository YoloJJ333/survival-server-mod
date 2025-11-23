package yolojj333.survival.mixin.server.command;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.dedicated.command.WhitelistCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Environment(EnvType.SERVER)
@Mixin(WhitelistCommand.class)
public abstract class WhitelistCommandMixin {
    @ModifyConstant(
            method = "register",
            constant = @Constant(
                    intValue = 3,
                    ordinal = 0
            )
    )
    private static int modifyPermissionLevel(int requiredLevel) {
        return 1;
    }
}
