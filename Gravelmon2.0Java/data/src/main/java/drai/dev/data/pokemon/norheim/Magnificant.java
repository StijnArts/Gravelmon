package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Magnificant extends drai.dev.data.pokemon.Pokemon {
    public Magnificant() {
        super("Magnificant",
                Type.BUG, Type.FIRE,
                new Stats(100,
                        60,
                        60,
                        125,
                        95,
                        67),
                List.of(Ability.TINTED_LENS,Ability.SOLAR_POWER,Ability.DROUGHT), Ability.DROUGHT,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.TWINEEDLE,12),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,20),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,24),
                        new MoveLearnSetEntry(Move.SILVER_WIND,28),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,38),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,44),
                        new MoveLearnSetEntry(Move.ERUPTION,50)             ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magnificant");

    }


}
