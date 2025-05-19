package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bounse extends drai.dev.data.pokemon.Pokemon {
    public Bounse() {
        super("Bounse",
                Type.NORMAL,
                new Stats(50,
                        50,
                        30,
                        50,
                        30,
                        70),
                List.of(Ability.JUMPIN), Ability.RUN_AWAY,
                4, 23,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Bounse has an extraordinary jumping ability, which it uses to see above the tall grass. Its small size allows it to easily avoid predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,2),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.SNATCH,14),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,17),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.PURSUIT,24),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.FLING,30),
                        new MoveLearnSetEntry(Move.BOUNCE,34),
                        new MoveLearnSetEntry(Move.LAST_RESORT,38),
                        new MoveLearnSetEntry(Move.UTURN,40),
                        new MoveLearnSetEntry(Move.SPLASH,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bounse");

    }


}
