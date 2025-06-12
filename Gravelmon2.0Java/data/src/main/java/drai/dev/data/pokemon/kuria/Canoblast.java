package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Canoblast extends drai.dev.data.pokemon.Pokemon {
    public Canoblast() {
        super("Canoblast",
                Type.FIGHTING, Type.STEEL,
                new Stats(85,
                        90,
                        110,
                        130,
                        80,
                        35),
                List.of(Ability.LASTBASTION), Ability.LASTBASTION,
                17, 652,
                new Stats(0,0,1,2,0,0), 95,
                -1,
                201, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canoblast's wheels have flattened, allowing it large defensive shields in place of its speed. The cannon has been optimized so it may launch long-range blasts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,20),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.COACHING,32),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 47, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Canoblast");

    }


}
