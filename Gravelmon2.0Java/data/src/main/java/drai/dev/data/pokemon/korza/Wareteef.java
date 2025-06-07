package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wareteef extends drai.dev.data.pokemon.Pokemon {
    public Wareteef() {
        super("Wareteef",
                Type.DARK,Type.ELECTRIC,
                new Stats(45,
                        35,
                        50,
                        165,
                        90,
                        125),
                List.of(Ability.DOWNLOAD), Ability.DOWNLOAD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                179, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("An Osnap that has become corrupted and unable to contain itself or control its actions. Though dangerous to be around, this pokemon still want to make people happy."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Wareteef");

    }


}
