package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Agacloakis extends drai.dev.data.pokemon.Pokemon {
    public Agacloakis() {
        super("Agacloakis",
                Type.GRASS, Type.DARK,
                new Stats(73,
                        72,
                        74,
                        103,
                        101,
                        112),
                List.of(Ability.OVERGROW), Ability.ADAPTABILITY,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,8),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.FAKE_OUT,14),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,17),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,22),
                        new MoveLearnSetEntry(Move.LEECH_SEED,26),
                        new MoveLearnSetEntry(Move.SCARY_FACE,29),
                        new MoveLearnSetEntry(Move.SEED_BOMB,33),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,37),
                        new MoveLearnSetEntry(Move.NATURE_POWER,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,55)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Agacloakis");

    }


}
