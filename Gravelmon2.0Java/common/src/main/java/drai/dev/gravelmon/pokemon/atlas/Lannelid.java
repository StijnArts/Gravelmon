package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lannelid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lannelid() {
        super("Lannelid",
                Type.POISON,
                new Stats(96,
                        83,
                        69,
                        75,
                        82,
                        55),
                List.of(Ability.STICKY_HOLD,Ability.SUCTION_CUPS,Ability.POWERLEECH), Ability.POWERLEECH,
                10, 165,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("You can tell how recently Lannelid has fed by its size, though when it has gone unfed, it can stretch its body to fit through a hole the width of a pencil. They thrive in stagnant water, however, they often poison the entire pool of any other life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,6),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,17),
                        new MoveLearnSetEntry(Move.SLUDGE,21),
                        new MoveLearnSetEntry(Move.MUD_SHOT,25),
                        new MoveLearnSetEntry(Move.SWALLOW,29),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,34),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,39),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,43),
                        new MoveLearnSetEntry(Move.HEMODRAIN,46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,51),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,54),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,60),
                        new MoveLearnSetEntry(Move.BELCH,66),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.POISONBURST,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TORPEDODASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 1, 19, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
