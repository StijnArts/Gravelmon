package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Webbind extends drai.dev.data.pokemon.Pokemon {
    public Webbind() {
        super("Webbind",
                Type.BUG,
                new Stats(75,
                        65,
                        75,
                        20,
                        80,
                        15),
                List.of(Ability.STICKY_HOLD), Ability.STICKY_HOLD,
                5, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Webbind's body is covered in incredibly sticky webbing. Large clumps of them can often be found stuck together along with various debris."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STICKY_WEB,1)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Webbind");

    }


}
