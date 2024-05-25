package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Secheel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Secheel() {
        super("Secheel",
                Type.POISON,
                new Stats(60,
                        55,
                        40,
                        43,
                        45,
                        22),
                List.of(Ability.STICKY_HOLD,Ability.SUCTION_CUPS), Ability.POWERLEECH,
                3, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its mouth acts like a suction pad, which will attach to its prey and won't release until it has sucked enough blood to satisfy it. Inside its body, it will turn the blood into poison."),
                List.of(new EvolutionEntry("lannelid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,6),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,17),
                        new MoveLearnSetEntry(Move.SLUDGE,20),
                        new MoveLearnSetEntry(Move.MUD_SHOT,23),
                        new MoveLearnSetEntry(Move.SWALLOW,27),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,31),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,35),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,39),
                        new MoveLearnSetEntry(Move.HEMODRAIN,42),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,46),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,54),
                        new MoveLearnSetEntry(Move.BELCH,60),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.POISONBURST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
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
