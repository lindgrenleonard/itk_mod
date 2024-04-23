package itk.gg.itk_hot.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class BlockInitializers {

    public static final Block EXAMPLE_BLOCK = new ExampleBlock(FabricBlockSettings.create().strength(4.0f));

    public static void registerAllBlocks(){
        final String modId = "itk_cock";
        Registry.register(Registries.BLOCK, new Identifier("itkock", "example_block"), EXAMPLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("itkock", "example_block"), new BlockItem(EXAMPLE_BLOCK, new Item.Settings()));

    }
}
