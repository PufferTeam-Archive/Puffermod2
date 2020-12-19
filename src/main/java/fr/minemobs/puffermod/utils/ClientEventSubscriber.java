package fr.minemobs.puffermod.utils;

import fr.minemobs.puffermod.Puffermod;
import fr.minemobs.puffermod.init.BlockInit;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Puffermod.modId, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        OBJLoader.INSTANCE.loadModel(new OBJModel.ModelSettings(new ResourceLocation("puffermod:models/obj/test.obj"),
                false, false,true, false, "puffermod:models/obj/test.mtl"));
		//ScreenManager.registerFactory(ModContainerTypes.EXAMPLE_FURNACE.get(), SawScreen::new);
        //ScreenManager.registerFactory(ModContainerTypes.ELECTRIC_FURNACE.get(), ElectricFurnaceScreen::new);
        //RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEST_ENTITY.get(), TestEntityRender::new);
        //RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RED_AMONGUS_ENTITY.get(), RedAmongusRenderer::new);
        //RenderTypeLookup.setRenderLayer(BlockInit.clear_glass.get(), RenderType.getCutoutMipped());
    }
}
