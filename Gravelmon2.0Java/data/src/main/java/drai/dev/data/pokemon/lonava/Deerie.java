package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Deerie extends drai.dev.data.pokemon.Pokemon {
    public Deerie() {
        super("Deerie",
                Type.FAIRY, Type.GHOST,
                new Stats(73,
                        65,
                        67,
                        95,
                        85,
                        98),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                25, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("After a life of constant roaming across the Lonavan wilderness, Deerie learn how to move beyond physicality itself. When a Deerie is sighted, it is taken as an omen of something catastrophic to come. The Spell Tags hanging from its antlers are said to ward off a 'ceaseless evil.'"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,9),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,18),
                        new MoveLearnSetEntry(Move.TRICK,24),
                        new MoveLearnSetEntry(Move.HEX,28),
                        new MoveLearnSetEntry(Move.REFLECT,34),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,45)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Deerie");

    }


}
