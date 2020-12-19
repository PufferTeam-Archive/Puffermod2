package fr.minemobs.puffermod.utils;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ArmorRenderer extends ArmorItem {

    private ArmorBaseModel armorModel;

    public ArmorRenderer(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties, ArmorBaseModel armorModel) {

        super(material, equipmentSlot, properties);

        this.armorModel = armorModel;

    }

    @Override
    public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
        return armorModel.applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    public final String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return armorModel.getTexture();
    }
}
