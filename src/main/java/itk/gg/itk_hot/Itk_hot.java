package itk.gg.itk_hot;

import itk.gg.itk_hot.blocks.BlockInitializers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registry;

public class Itk_hot implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockInitializers.registerAllBlocks();
    }
}
