package com.gravelmon.common
import com.cobblemon.mod.common.CobblemonBlocks
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegisterEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.MOD_CONTEXT
import thedarkcolour.kotlinforforge.forge.registerObject
@Suppress("SameParameterValue", "HasPlatformType", "MemberVisibilityCanBePrivate", "unused")
@Mod("gravelmon")
class GravelmonForge {
    val MOD_ID = "gravelmon"
    val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID)
    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID)
    init {
        registerBlocks()
        registerItems()
        itemGroups()
    }

    private fun itemGroups(){
    }
    private fun registerBlocks() {
        MOD_BUS.addListener<RegisterEvent> { event ->
            event.register(Registries.BLOCK) { helper ->
               // GravelmonBlocks.register { identifier, block -> helper.register(ResourceLocation(identifier.namespace,identifier.path), block) }
            }
        }

    }

    private fun registerItems(){
        MOD_BUS.addListener<RegisterEvent> { event ->
            event.register(Registries.ITEM) { helper ->
                //GravelmonItems.register { identifier, item -> helper.register(ResourceLocation(identifier.namespace,identifier.path), item) }
            }
        }
    }

    fun id(path: String): ResourceLocation {
        return ResourceLocation("gravelmon", path)
    }
}