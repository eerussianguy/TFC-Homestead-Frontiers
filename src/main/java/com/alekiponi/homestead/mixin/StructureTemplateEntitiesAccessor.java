package com.alekiponi.homestead.mixin;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin({StructureTemplate.class})
public interface StructureTemplateEntitiesAccessor {
    @Accessor("entityInfoList")
    List<StructureTemplate.StructureEntityInfo> accessor$getEntityInfoList();
}
