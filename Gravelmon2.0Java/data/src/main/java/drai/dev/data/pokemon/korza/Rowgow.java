package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rowgow extends drai.dev.data.pokemon.Pokemon {
    public Rowgow() {
        super("Rowgow",
                Type.DRAGON,
                new Stats(115,
                        120,
                        100,
                        50,
                        40,
                        50),
                List.of(Ability.BATTLE_ARMOR), Ability.OUTBURST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Fierce and territorial mons. Rowgow are constantly in search of Snifae, but are rarely successful in their hunts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,6),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,12),
                        new MoveLearnSetEntry(Move.FIRE_FANG,17),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,28),
                        new MoveLearnSetEntry(Move.IRON_TAIL,32),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,36),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,41),
                        new MoveLearnSetEntry(Move.CRUNCH,47),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.OUTRAGE,56),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Rowgow");

    }


}
