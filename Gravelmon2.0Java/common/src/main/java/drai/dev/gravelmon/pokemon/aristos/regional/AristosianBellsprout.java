package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class AristosianBellsprout extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianBellsprout(String name, Aspect aspect) {
        super(name, aspect,"AristosianBellsprout",
                Type.GRASS, Type.FIRE,
                new Stats(50,
                        70,
                        35,
                        75,
                        30,
                        40),
                List.of(Ability.CHLOROPHYLL), Ability.FLASH_FIRE,
                5, 32,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Bellsprout developed glands in its mouth which allow it to spit flames and catch prey more efficiently. It occasionally sets itself on fire while hunting."),
                List.of(new EvolutionEntry("AristosianWeepinbell", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.SINGE,1),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.WRAP,11),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,13),
                        new MoveLearnSetEntry(Move.ACID,16),
                        new MoveLearnSetEntry(Move.STUN_SPORE,18),
                        new MoveLearnSetEntry(Move.INCINERATE,22),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,26),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,29),
                        new MoveLearnSetEntry(Move.SLAM,32),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,36),
                        new MoveLearnSetEntry(Move.FIRE_LASH,41),
                        new MoveLearnSetEntry(Move.WRING_OUT,47),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,50),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,55),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm")                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 30, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bellsprout");

    }


}
