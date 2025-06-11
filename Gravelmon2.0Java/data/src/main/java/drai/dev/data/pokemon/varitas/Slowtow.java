package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slowtow extends drai.dev.data.pokemon.Pokemon {
    public Slowtow() {
        super("Slowtow",
                Type.NORMAL,Type.GHOST,
                new Stats(95,
                        100,
                        110,
                        75,
                        80,
                        30),
                List.of(Ability.OWN_TEMPO,Ability.STAKEOUT), Ability.POISON_HEAL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When lying frozen among trash, a Trubbish bit its tail believing it to be dead and caused them both to unexpectedly fuse. The transformed trubbish stays with Slowtow because it knows its sense of smell is better for leading them both to trash. When the trubbish bites down with poison teeth, Slowtow's senses become heightened."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Slowtow");

    }


}
