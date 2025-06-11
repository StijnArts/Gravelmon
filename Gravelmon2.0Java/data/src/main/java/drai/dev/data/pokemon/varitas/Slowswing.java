package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slowswing extends drai.dev.data.pokemon.Pokemon {
    public Slowswing() {
        super("Slowswing",
                Type.NORMAL,Type.GHOST,
                new Stats(95,
                        75,
                        80,
                        100,
                        110,
                        30),
                List.of(Ability.OWN_TEMPO,Ability.STAKEOUT), Ability.POISON_HEAL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When competing for food, a Trubbish bit down on its head and the poison increased both its intellect and ghostly power. It stores a variety of snacks, tools and other objects of interest in the pouch on its front. It was named both after Slowking and because its tail tends to swing back and forth when it's in deep thought."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Slowswing");

    }


}
