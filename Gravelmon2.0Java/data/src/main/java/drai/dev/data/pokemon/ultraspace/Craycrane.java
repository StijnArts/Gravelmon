package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Craycrane extends drai.dev.data.pokemon.Pokemon {
    public Craycrane() {
        super("Craycrane",
                Type.STEEL,
                new Stats(90,
                        100,
                        80,
                        80,
                        60,
                        70),
                List.of(Ability.HEAVY_METAL), Ability.STEELWORKER,
                70, 3000,
                new Stats(1,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Stomp Normal - Peck Flying - Sharpen Normal 8 Metal Sound Steel 16 Metal ClawSTAB Steel 22 Wild Charge Electric 28 Steel WingSTAB Steel 34 Iron Defense Steel 38 Iron HeadSTAB Steel 42 Brutal Swing Dark 50 Mirror Move Flying 54 Head Charge Normal 60 Flash CannonSTAB Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,8),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,22),
                        new MoveLearnSetEntry(Move.STEEL_WING,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,34),
                        new MoveLearnSetEntry(Move.IRON_HEAD,38),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,42),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,50),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,54),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,60)                        ),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Craycrane");

    }


}
