package fr.minemobs.puffermod.init;

import fr.minemobs.puffermod.Puffermod;
import fr.minemobs.puffermod.object.armor.MyCustomArmorModel;
import fr.minemobs.puffermod.utils.ArmorRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Puffermod.modId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomArmorInit {

    @SubscribeEvent
    public static void registerArmor(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new ArmorRenderer(ArmorMaterial.LEATHER,
                EquipmentSlotType.HEAD, new Item.Properties().group(Puffermod.ModItemGroup.instance),
                new MyCustomArmorModel(new ResourceLocation(Puffermod.modId,"textures/armors/mycustomarmormodel.png")))
                .setRegistryName("example_hat"));

    }

}
