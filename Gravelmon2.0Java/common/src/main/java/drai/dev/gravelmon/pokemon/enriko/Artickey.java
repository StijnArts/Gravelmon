package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Artickey extends drai.dev.gravelmon.pokemon.Pokemon {
    public Artickey() {
        super("Artickey",
                Type.ROCK, Type.PSYCHIC,
                new Stats(25,
                        50,
                        75,
                        45,
                        90,
                        20),
                List.of(Ability.STURDY,Ability.SERENE_GRACE,Ability.REGENERATOR), Ability.REGENERATOR,
                11, 165,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                120, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its angular body resembles a key, to which the lock has yet to be found. When sleeping, they hide inside of tiny holes in the caves they live in."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,5),
                        new MoveLearnSetEntry(Move.KINESIS,7),
                        new MoveLearnSetEntry(Move.ACCELEROCK,10),
                        new MoveLearnSetEntry(Move.RECOVER,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.ROLLOUT,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.CALM_MIND,32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,36),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,40),
                        new MoveLearnSetEntry(Move.POWER_GEM,44),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,48),
                        new MoveLearnSetEntry(Move.STORED_POWER,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Artickey");

    }


}
