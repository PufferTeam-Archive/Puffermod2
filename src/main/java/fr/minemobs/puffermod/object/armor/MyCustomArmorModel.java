package fr.minemobs.puffermod.object.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import fr.minemobs.puffermod.Puffermod;
import fr.minemobs.puffermod.utils.ArmorBaseModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;

public class MyCustomArmorModel extends ArmorBaseModel {

    private ModelRenderer bb_main;
    private ModelRenderer cube_r1;
    private ModelRenderer cube_r2;
    private ModelRenderer cube_r3;
    private ModelRenderer cube_r4;
    private ModelRenderer cube_r5;
    private ModelRenderer cube_r6;
    private ModelRenderer cube_r7;
    private ModelRenderer cube_r8;

    ResourceLocation ourTexture;

    public MyCustomArmorModel(ResourceLocation rl) {
        super(16, 16, rl);
        ourTexture = rl;
        setupArmorParts();
    }

    public void setupArmorParts() {
        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 8).addBox(-5.0F, -34.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addBox(2.0F, -36.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addBox(-2.0F, -38.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addBox(0.0F, -39.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 8).addBox(3.0F, -34.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addBox(-3.0F, -36.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, -35.0F, -2.5F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -35.0F, 2.5F);
        bb_main.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -32.0F, 8.0F);
        bb_main.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        cube_r3.setTextureOffset(0, 8).addBox(-5.0F, -2.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -32.0F, 0.0F);
        bb_main.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
        cube_r4.setTextureOffset(0, 8).addBox(-5.0F, -2.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(7.0F, -29.0F, 0.0F);
        bb_main.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 1.3963F);
        cube_r5.setTextureOffset(56, 60).addBox(-2.15F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(7.0F, -33.0F, 0.0F);
        bb_main.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 1.3963F);
        cube_r6.setTextureOffset(0, 0).addBox(-1.2076F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(6.0F, -35.0F, 0.0F);
        bb_main.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 1.2654F);
        cube_r7.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(5.0F, -37.0F, 0.0F);
        bb_main.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
        cube_r8.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
    }

    public BipedModel applySlot(EquipmentSlotType slot){
        armorHead.showModel = false;
        armorBody.showModel = false;
        armorRightArm.showModel = false;
        armorLeftArm.showModel = false;
        armorRightLeg.showModel = false;
        armorLeftLeg.showModel = false;
        armorRightBoot.showModel = false;
        armorLeftBoot.showModel = false;

        switch(slot){
            case HEAD:
                armorHead.showModel = true;
                break;
            case CHEST:
                armorBody.showModel = true;
                armorRightArm.showModel = true;
                armorLeftArm.showModel = true;
                break;
            case LEGS:
                armorRightLeg.showModel = true;
                armorLeftLeg.showModel = true;
                break;
            case FEET:
                armorRightBoot.showModel = true;
                armorLeftBoot.showModel = true;
                break;
            default:
                break;
        }

        return this;
    }

// Here we are going to change the return type of this to that name of our class if it's not changed already

// How do we do that?
    /* In java you can find a method return type by looking at whatever is before the method name. Here are some examples
     *  public String getTexture() {} will return a String
     *  public void doStuff() {} will return nothing, hence the name void
     *  public boolean isFlying() {} will return either true or false
     *  You get it, there are a ton of options for this
     *  Below we are returning an instance of our class. Our class is what we are referring to when we say return 'this'
     */

    public final MyCustomArmorModel applyEntityStats(BipedModel defaultArmor){
        this.isChild = defaultArmor.isChild;
        this.isSneak = defaultArmor.isSneak;
        this.isSitting = defaultArmor.isSitting;
        this.rightArmPose = defaultArmor.rightArmPose;
        this.leftArmPose = defaultArmor.leftArmPose;

        return this;
    }


    // We usually don't have to touch this method or any of the ones below
// Just use what BlockBench gives you for the render method
    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

// I'm not 100% sure because I'm doing this off the top of my head but you might get an error because your IDE wants to use a setRotationAngles method instead of setRotationAngle
// If you aren't having this problem just ignore this.

    public final void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    private final void copyModelAngles(ModelRenderer in, ModelRenderer out){
        out.rotateAngleX = in.rotateAngleX;
        out.rotateAngleY = in.rotateAngleY;
        out.rotateAngleZ = in.rotateAngleZ;
    }

}
