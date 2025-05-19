package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Merriwick extends drai.dev.data.pokemon.Pokemon {
    public Merriwick() {
        super("Merriwick",
                Type.NORMAL,Type.FIRE,
                new Stats(98,
                        53,
                        79,
                        124,
                        63,
                        71),
                List.of(Ability.PRANKSTER,Ability.MAGICIAN), Ability.IGNITION,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                220, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Merriwick will go to great lengths to bring joy to others. It can light up the daytime sky with its powerful explosions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CELEBRATE,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,9),
                        new MoveLearnSetEntry(Move.SAFEGUARD,13),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,18),
                        new MoveLearnSetEntry(Move.UPROAR,22),
                        new MoveLearnSetEntry(Move.LIGHTUP,27),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,31),
                        new MoveLearnSetEntry(Move.BURN_UP,36),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,40),
                        new MoveLearnSetEntry(Move.OVERHEAT,44),
                        new MoveLearnSetEntry(Move.BOOMBURST,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,57),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Merriwick");

    }


}
