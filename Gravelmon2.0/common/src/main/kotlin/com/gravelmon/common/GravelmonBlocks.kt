package com.gravelmon.common

import com.cobblemon.mod.common.platform.PlatformRegistry
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.ExperienceDroppingBlock
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.math.intprovider.UniformIntProvider

@Suppress("SameParameterValue", "HasPlatformType", "MemberVisibilityCanBePrivate", "unused")
object GravelmonBlocks : PlatformRegistry<Registry<Block>, RegistryKey<Registry<Block>>, Block>() {

    @JvmField
    val ASTRAL_STONE_ORE = evolutionStoneOre("astral_stone_ore")
    @JvmField
    val DEEPSLATE_ASTRAL_STONE_ORE = deepslateEvolutionStoneOre("deepslate_astral_stone_ore")

    private fun evolutionStoneOre(name: String) : ExperienceDroppingBlock = this.create(name,
        ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE), UniformIntProvider.create(1, 2)))

    private fun deepslateEvolutionStoneOre(name: String) = this.create(name,
        ExperienceDroppingBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE), UniformIntProvider.create(1, 2)))
    override val registry: Registry<Block> = Registries.BLOCK
    override val registryKey: RegistryKey<Registry<Block>> = RegistryKeys.BLOCK


}

