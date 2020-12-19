package fr.minemobs.puffermod.init;

import fr.minemobs.puffermod.Puffermod;
import fr.minemobs.puffermod.object.item.CheeseItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Puffermod.modId);

    public static final RegistryObject<Item> cheese = ITEMS.register("cheese",
            () -> new CheeseItem(new Item.Properties().group(Puffermod.ModItemGroup.instance)));

}
