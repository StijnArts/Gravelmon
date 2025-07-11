package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pesteeny extends drai.dev.data.pokemon.Pokemon {
    public Pesteeny() {
        super("Pesteeny",
                Type.DARK,
                new Stats(45,
                        25,
                        25,
                        15,
                        15,
                        50),
                List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                2, 4,
                new Stats(0,0,0,0,0,1), 60,
                0.5,
                53, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.SHEDFANGS,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.OBSTRUCT,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)             ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pesteeny");

    }


}
