package drai.dev.gravelmon.pokemon.infinity.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class EhgoMagnemite extends EghoPokemon {
    public EhgoMagnemite(int dexNo) {
        super(dexNo,"EhgoMagnemite",
                Type.GRASS, Type.STEEL,
                new Stats(40, 80, 55, 35, 70, 45),
                List.of(Ability.OVERGROW, Ability.REGENERATOR), Ability.ANALYTIC,
                4, 200,
                new Stats(0,1,0,0,1,0), 65,
                -1,
                89, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.MINERAL),
                List.of("Once Hazeport City plateaued in urbanization, many Magnemite migrated to Genisis Forest. Over the years, they became one with the plant life."),
                List.of(new EvolutionEntry("eghomagneton", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,4),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,7),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.VINE_WHIP,18),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,21),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,25),
                        new MoveLearnSetEntry(Move.METAL_BURST,29),
                        new MoveLearnSetEntry(Move.SLAM,32),
                        new MoveLearnSetEntry(Move.SEED_BOMB,35),
                        new MoveLearnSetEntry(Move.SCREECH,39),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.LOCKON,46),
                        new MoveLearnSetEntry(Move.BULLDOZE,49),
                        new MoveLearnSetEntry(Move.FISSURE,53),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,57),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"egg"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"egg"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN1),
                4, List.of(
                        new ItemDrop("minecraft:vines",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUSH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Magnemite");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
