package com.syco.deepslatetweaks.mixin;

import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Blocks.class)
public class BlocksMixin {
    // Modify Deepslate block strength
    @ModifyArgs(
            method = "<clinit>",
            slice = @Slice(
                    from = @At(value = "CONSTANT", args = "stringValue=deepslate"),
                    to = @At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;DEEPSLATE:Lnet/minecraft/world/level/block/Block;")
            ),
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;strength(FF)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;"
            )
    )
    private static void modifyDeepslateStrength(Args args) {
        // Set hardness to 1.0F (like stone) and keep resistance at 6.0F
        args.set(0, 0.5F);
        args.set(1, 6.0F);
    }

    // Modify Cobbled Deepslate block strength
    @ModifyArgs(
            method = "<clinit>",
            slice = @Slice(
                    from = @At(value = "CONSTANT", args = "stringValue=cobbled_deepslate"),
                    to = @At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;COBBLED_DEEPSLATE:Lnet/minecraft/world/level/block/Block;")
            ),
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;strength(FF)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;"
            )
    )
    private static void modifyCobbledDeepslateStrength(Args args) {
        // Set hardness to 2.0F (like cobblestone) and keep resistance at 6.0F
        args.set(0, 20.0F);
        args.set(1, 6.0F);
    }
}