package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Yamaki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yamaki() {
        super("Yamaki",
                Type.ROCK, Type.PSYCHIC,
                new Stats(70,
                        200,
                        70,
                        40,
                        70,
                        90),
                List.of(Ability.ROUNDRECORD), Ability.ROUNDRECORD,
                17, 1632,
                new Stats(0,4,0,0,0,0), 45,
                0.0,
                230, ExperienceGroup.FAST,
                70,
                50, List.of(),
                List.of("Although fast and powerful, Yamaki is constantly confused. No one can get close enough to help it stop spinning, so it will probably spin the rest of its life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FLASH,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,12),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,16),
                        new MoveLearnSetEntry(Move.STORED_POWER,21),
                        new MoveLearnSetEntry(Move.BARRIER,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,33),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,39),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,47),
                        new MoveLearnSetEntry(Move.PSYCHIC,51),
                        new MoveLearnSetEntry(Move.GEMCRASH,55),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,62)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 54, 65, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Yamaki");

    }


}
