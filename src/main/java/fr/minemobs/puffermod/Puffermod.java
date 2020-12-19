package fr.minemobs.puffermod;

import fr.minemobs.puffermod.init.BlockInit;
import fr.minemobs.puffermod.init.CustomArmorInit;
import fr.minemobs.puffermod.init.ItemInit;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("puffermod")
@Mod.EventBusSubscriber(modid = "puffermod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Puffermod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String modId = "puffermod";

    public Puffermod(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        modEventBus.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        //Todo
        //DeferredWorkQueue.runLater(StructureGen::generateStructure);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(ModItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties.group(ModItemGroup.instance));
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }


    public static class ModItemGroup extends ItemGroup {

        public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "Puffermod Items");

        public ModItemGroup(int index, String label) {
            super(index, label);
        }

        /*@Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.refined_iron_ingot.get());
        }*/

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.STONE);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

    }

}