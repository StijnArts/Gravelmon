package drai.dev.gravelmon.registries;

import dev.architectury.registry.registries.*;
import drai.dev.gravelsextendedbattles.loot.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;

import java.util.*;

import static drai.dev.gravelmon.registries.GravelmonItems.*;

public class GravelmonFossilItems {

    //Fossil Items
    //Infinity
    public static RegistrySupplier<Item> TUSK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "tusk_fossil",
            "arctusk");
    public static RegistrySupplier<Item> HORN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "horn_fossil",
            "iceros");

    //Vega
    public static RegistrySupplier<Item> FANG_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "fang_fossil",
            "grindon");
    public static RegistrySupplier<Item> WING_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.OAK_TREE.uncommon()
            ),
            "wing_fossil",
            "ptervus");
    public static RegistrySupplier<Item> DARK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
            ),
            "dark_fossil",
            "tyranos");

    //Deneb Procyon
    public static RegistrySupplier<Item> SAIL_SPINE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.MUD_PIT.uncommon(),
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "sail_spine_fossil",
            "sailodon");
    public static RegistrySupplier<Item> SCUBA_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon()
            ),
            "scuba_fossil",
            "foreiphin");

    //Lockemon
    public static RegistrySupplier<Item> SEARED_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "seared_fossil",
            "feafurr");
    public static RegistrySupplier<Item> NOSE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "nose_fossil",
            "phisnooz");
    public static RegistrySupplier<Item> HELMET_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "helmet_fossil",
            "macedontus");
    public static RegistrySupplier<Item> FROZEN_PEAK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "frozen_peak_fossil",
            "crynorawst");

    //Sage
    public static RegistrySupplier<Item> DUAL_HORN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "dual_horn_fossil",
            "calphite");
    public static RegistrySupplier<Item> MAW_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
            ),
            "maw_fossil",
            "dinkywink");

    //Pokemon Uranium
    public static RegistrySupplier<Item> TRUNK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "trunk_fossil",
            "snopach");
    public static RegistrySupplier<Item> HAIR_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "hair_fossil",
            "slothohm");
    public static RegistrySupplier<Item> GOLD_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
            ),
            "gold_fossil",
            "jungore");

    //Xenoverse
    public static RegistrySupplier<Item> PRINT_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "print_fossil",
            "rockapye");
    public static RegistrySupplier<Item> SPACE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
            ),
            "space_fossil",
            "sputnink");

    //Atlas
    public static RegistrySupplier<Item> CRUST_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon(),
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon()
            ),
            "crust_fossil",
            "velosoil");
    public static RegistrySupplier<Item> SEED_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
                    BaseCobblemonDigSites.OAK_TREE.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "seed_fossil",
            "juraseed");
    public static RegistrySupplier<Item> DEVIL_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
                    BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon()
            ),
            "devil_fossil",
            "carnibble");
    public static RegistrySupplier<Item> FRILL_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "frill_fossil",
            "dilophang");
    public static RegistrySupplier<Item> MOUNTAIN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "mountain_fossil",
            "mampth");
    public static RegistrySupplier<Item> SLOW_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "slow_fossil",
            "mesoth");

    //Ferroa
    public static RegistrySupplier<Item> SAW_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "saw_fossil",
            "snipion crozoican");
    public static RegistrySupplier<Item> SNOUT_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "snout_fossil",
            "enigmore");
    public static RegistrySupplier<Item> CAVE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "cave_fossil",
            "broogah");

    //HIZA
    public static RegistrySupplier<Item> TEETH_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
            ),
            "teeth_fossil",
            "sharkaic");
    public static RegistrySupplier<Item> THAGOMIZER_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
                    BaseCobblemonDigSites.POWDERED_DEPOSIT.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "thagomizer_fossil",
            "stegosear");
    public static RegistrySupplier<Item> WING_FINGER_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon(),
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon()
            ),
            "wing_finger_fossil",
            "pterai");

    //Isiah
    public static RegistrySupplier<Item> SMOKE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "smoke_fossil",
            "lizmoke");
    public static RegistrySupplier<Item> CONDUCTOR_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "conductor_fossil",
            "elekto");

    //Lonava
    public static RegistrySupplier<Item> OAR_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon()
            ),
            "oar_fossil",
            "angloch");

    //mythire
    public static RegistrySupplier<Item> TAR_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "tar_fossil",
            "ribitar");

    //Nosto
    public static RegistrySupplier<Item> CHAIN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
            ),
            "chain_fossil",
            "seasaw");

    //Oceane
    public static RegistrySupplier<Item> BULB_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "bulb_fossil",
            "topsee");
    public static RegistrySupplier<Item> CUP_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "cup_fossil",
            "churlice");
    public static RegistrySupplier<Item> SWIRL_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "swirl_fossil",
            "camozoic");

    //Orohn Havai
    public static RegistrySupplier<Item> PLATE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.OAK_TREE.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "plate_fossil",
            "stegrump");
    public static RegistrySupplier<Item> CUSP_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
            ),
            "cusp_fossil",
            "devostoric");
    public static RegistrySupplier<Item> BIG_TOOTH_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon(),
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
            ),
            "big_tooth_fossil",
            "petirex");
    public static RegistrySupplier<Item> WEB_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "web_fossil",
            "arrocknid");
    public static RegistrySupplier<Item> MOUND_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon()
            ),
            "mound_fossil",
            "kragodon");
    public static RegistrySupplier<Item> LAZY_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.FROZEN_POND.uncommon()
            ),
            "lazy_fossil",
            "therasloth");

    //qamor
    public static RegistrySupplier<Item> SABER_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "saber_fossil",
            "cragato");
    public static RegistrySupplier<Item> CONCH_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "conch_fossil",
            "chiticonch");

    //Varitas
    public static RegistrySupplier<Item> DUCK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
            ),
            "duck_fossil",
            "lasaur");

    //Cyare
    public static RegistrySupplier<Item> THUMB_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
            ),
            "thumb_fossil",
            "tinguano");

    //Dhiome
    public static RegistrySupplier<Item> FERN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
                    BaseCobblemonDigSites.OAK_TREE.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "fern_fossil",
            "petrifern");

    //Enjin
    public static RegistrySupplier<Item> HAMMER_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ERODED_PILLAR.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon()
            ),
            "hammer_fossil",
            "pterabonk");

    //Crozoic
    public static RegistrySupplier<Item> LARVA_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
            ),
            "larva_fossil",
            "picant");
    public static RegistrySupplier<Item> MEMBRANE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.OAK_TREE.uncommon(),
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon()
            ),
            "membrane_fossil",
            "glizyrup");
    public static RegistrySupplier<Item> EYE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "eye_fossil",
            "eyesi crozoican");
    public static RegistrySupplier<Item> CHEEK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.BIRCH_TREE.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "cheek_fossil",
            "pekohmu");
    public static RegistrySupplier<Item> LONG_CLAW_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "long_claw_fossil",
            "razaury");
    public static RegistrySupplier<Item> BRAIN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon(),
                    BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon()
            ),
            "brain_fossil",
            "brainibash");
    public static RegistrySupplier<Item> THORN_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.LUSH_DEN.uncommon(),
                    BaseCobblemonDigSites.ROOTED_PIT.uncommon()
            ),
            "thorn_fossil",
            "seigoxic");
    public static RegistrySupplier<Item> GLOVE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
            ),
            "glove_fossil",
            "seanodont");
    public static RegistrySupplier<Item> BASKET_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.FROZEN_POND.uncommon(),
                    new ResourceLocation("cobblemon", "fossils/prehistoric_tuff_pit")
            ),
            "basket_fossil",
            "chillaxo");
    public static RegistrySupplier<Item> SPORE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.MOSSY_POND.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "spore_fossil",
            "shroolumn");
    public static RegistrySupplier<Item> HOOK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon(),
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon()
            ),
            "hook_fossil",
            "fishereel");
    public static RegistrySupplier<Item> ANTENNA_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "antenna_fossil",
            "mander");
    public static RegistrySupplier<Item> METAL_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
            ),
            "metal_fossil",
            "shredpole");
    public static RegistrySupplier<Item> CORD_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon(),
                    BaseCobblemonDigSites.MUD_PIT.uncommon()
            ),
            "cord_fossil",
            "cryotera");
    public static RegistrySupplier<Item> STREAMLINED_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
            ),
            "streamlined_fossil",
            "stricycle");
    public static RegistrySupplier<Item> EGG_BEAK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon()
            ),
            "egg_beak_fossil",
            "ovimourn");
    public static RegistrySupplier<Item> DRILL_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon()
            ),
            "drill_fossil",
            "varaquake");
    public static RegistrySupplier<Item> SCORCHED_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUNSCORCHED_REMAINS.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
            ),
            "scorched_fossil",
            "rexinder");
    public static RegistrySupplier<Item> NECK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SANDY_DEN.uncommon(),
                    BaseCobblemonDigSites.SUNSCORCHED_DEN.uncommon()
            ),
            "neck_fossil",
            "miniclod");
    public static RegistrySupplier<Item> SIX_WING_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "six_wing_fossil",
            "oxygryph");
    public static RegistrySupplier<Item> MOHAWK_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
                    BaseCobblemonDigSites.SPRUCE_TREE.uncommon()
            ),
            "mohawk_fossil",
            "sharpunk");
    public static RegistrySupplier<Item> BUCKTEETH_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
                    BaseCobblemonDigSites.LUSH_DEN.uncommon()
            ),
            "buckteeth_fossil",
            "tropichomp");
    public static RegistrySupplier<Item> BOXER_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_IMPACT.uncommon()
            ),
            "boxer_fossil",
            "punshell");
    public static RegistrySupplier<Item> SPIKE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "spike_fossil",
            "pikoral");
    public static RegistrySupplier<Item> WEBBED_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
                    new ResourceLocation("cobblemon", "fossils/prehistoric_meteorite_pond")
            ),
            "webbed_fossil",
            "hungrebe");
    public static RegistrySupplier<Item> CORRUPT_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.SUSPICIOUS_MOUND.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon()
            ),
            "corrupt_fossil",
            "soulhofen");
    public static RegistrySupplier<Item> NEEDLE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "needle_fossil",
            "stunge");
    public static RegistrySupplier<Item> LILY_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "lily_fossil",
            "clawryde");
    public static RegistrySupplier<Item> STRANGE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.HYDROTHERMAL_VENTS.uncommon(),
                    BaseCobblemonDigSites.VIBRANT_HYDROTHERMAL_VENTS.uncommon()
            ),
            "strange_fossil",
            "tullabaloo");
    public static RegistrySupplier<Item> CONE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.UNDERWATER_FISSURE.uncommon(),
                    BaseCobblemonDigSites.SUBMERGED_SPIKE.uncommon()
            ),
            "cone_fossil",
            "squicecone");
    public static RegistrySupplier<Item> SHOULDER_SPIKE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.ENHYDRO_AGATE.uncommon(),
                    BaseCobblemonDigSites.DRIPSTONE_OASIS.uncommon()
            ),
            "shoulder_spike_fossil",
            "palagaia");
    public static RegistrySupplier<Item> RAMPART_FOSSIL = fossilItem(
            List.of(
                    new ResourceLocation("cobblemon", "fossils/prehistoric_tuff_pit"),
                    BaseCobblemonDigSites.FROZEN_SPIKE.uncommon()
            ),
            "rampart_fossil",
            "pachibrik");
    public static RegistrySupplier<Item> TOE_FOSSIL = fossilItem(
            List.of(
                    BaseCobblemonDigSites.PRESERVED_SKELETON.uncommon(),
                    BaseCobblemonDigSites.SANDY_DEN.uncommon()
            ),
            "toe_fossil",
            "reptor");


    public static void touch() {

    }
}
