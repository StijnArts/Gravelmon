package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Powda extends drai.dev.data.pokemon.Pokemon {
    public Powda() {
        super("Powda",
                Type.GROUND,Type.ELECTRIC,
                new Stats(72,
                        52,
                        91,
                        92,
                        81,
                        97),
                List.of(Ability.STATIC,Ability.TECHNICIAN), Ability.MINUS,
                8, 417,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Powda sweep up large amounts of dust and debris with their bushy tails. The static electricity gathered is stored in its body, heavily boosting its power."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.MUD_SHOT,8),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.NUZZLE,17),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,21),
                        new MoveLearnSetEntry(Move.MUD_BOMB,29),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,34),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,38),
                        new MoveLearnSetEntry(Move.SANDSHOT,43),
                        new MoveLearnSetEntry(Move.SPIKES,47),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,52),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,56)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Powda");

    }


}
