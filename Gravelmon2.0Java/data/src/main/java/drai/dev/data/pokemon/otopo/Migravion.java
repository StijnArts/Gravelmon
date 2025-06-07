package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Migravion extends drai.dev.data.pokemon.Pokemon {
    public Migravion() {
        super("Migravion",
                Type.FLYING,
                new Stats(78,
                        60,
                        42,
                        58,
                        52,
                        80),
                List.of(Ability.CLOUD_NINE), Ability.EARLY_BIRD,
                7, 92,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                65, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Legends say Migravion never truly stops flying. If one is seen circling an area, it is believed to be guiding lost Pokémon toward safety. Its feathers take on hues that match the landscapes of its nesting grounds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.WHIRLWIND,17),
                        new MoveLearnSetEntry(Move.TWISTER,22),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.WING_ATTACK,38),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,44),
                        new MoveLearnSetEntry(Move.ROOST,50),
                        new MoveLearnSetEntry(Move.TAILWIND,55),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,62)),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Migravion");

    }


}
