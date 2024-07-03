package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Basield extends Pokemon {
    public Basield() {
        super( "Basield",
                Type.GRASS,
                new Stats(60,
                        56,
                        56,
                        88,
                        70,
                        75),
                List.of(Ability.OVERGROW), Ability.STATIC,
                7, 174,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FAIRY),
                List.of("It constantly generates ozone to clear the air around it. Sickness is rare among those who stay close by. "),
                List.of(new EvolutionEntry("basilux", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,4),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,8),
                        new MoveLearnSetEntry(Move.DAZZLE_POWDER,8),
                        new MoveLearnSetEntry(Move.STUN_SPORE,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,16),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,19),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.AROMA_WIND,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,37),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,42),
                        new MoveLearnSetEntry(Move.RAPID_GROWTH,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,51),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,"tutor"),
                        new MoveLearnSetEntry(Move.ABSORB,"tutor"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"tutor"),
                        new MoveLearnSetEntry(Move.SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tutor"),
                        new MoveLearnSetEntry(Move.SLASH,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.POISON_LEAF,"tutor"),
                        new MoveLearnSetEntry(Move.REFRESH,"tutor"),
                        new MoveLearnSetEntry(Move.RAPID_GROWTH,"tutor"),
                        new MoveLearnSetEntry(Move.ACCELVOLT,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.ENERGIZE,"egg"),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_HIDE,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg"),
                        new MoveLearnSetEntry(Move.PSYBURN,"egg"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.SPARK,"egg"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                        ),
                List.of(Label.DENEB),
                0,List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
