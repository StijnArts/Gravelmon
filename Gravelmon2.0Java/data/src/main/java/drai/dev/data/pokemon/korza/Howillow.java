package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Howillow extends drai.dev.data.pokemon.Pokemon {
    public Howillow() {
        super("Howillow",
                Type.GHOST,Type.GRASS,
                new Stats(123,
                        74,
                        73,
                        93,
                        97,
                        23),
                List.of(Ability.LEAF_GUARD), Ability.UNNERVE,
                25, 1724,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                169, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("On some nights, wailing can be heard coming from the forests. It's believed that these are the Howillow, mourning the fellow trees that were burned down in a past forest fire."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.SCREECH,7),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.LEECH_SEED,17),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,26),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,35),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,39),
                        new MoveLearnSetEntry(Move.INGRAIN,43),
                        new MoveLearnSetEntry(Move.CURSE,48),
                        new MoveLearnSetEntry(Move.FORESTS_CURSE,52),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,57),
                        new MoveLearnSetEntry(Move.CALM_MIND,63),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,66)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Howillow");

    }


}
