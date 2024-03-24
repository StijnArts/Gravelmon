package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pipkorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pipkorn() {
        super("Pipkorn",
                Type.GRASS,Type.FIRE,
                new Stats(65,
                        45,
                        40,
                        96,
                        85,
                        114),
                List.of(Ability.FIERYSPIRIT,Ability.OWN_TEMPO,Ability.SOLAR_POWER), Ability.SOLAR_POWER,
                6, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                149, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pipkorn's flames are constantly consuming the oxygen around it. It moves frenetically and can barely stay still for long. Its hard to determine if it's in pain or not."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,5),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,11),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,17),
                        new MoveLearnSetEntry(Move.GROWTH,23),
                        new MoveLearnSetEntry(Move.LEECH_SEED,29),
                        new MoveLearnSetEntry(Move.SYNTHESIS,35),
                        new MoveLearnSetEntry(Move.OVERHEAT,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,49),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,52),
                        new MoveLearnSetEntry(Move.ME_FIRST,54),
                        new MoveLearnSetEntry(Move.INGRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 44, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Pipkorn");

    }


}
