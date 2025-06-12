package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bramoth extends drai.dev.data.pokemon.Pokemon {
    public Bramoth() {
        super("Bramoth",
                Type.DARK, Type.FLYING,
                new Stats(75,
                        65,
                        60,
                        125,
                        105,
                        70),
                List.of(Ability.TINTED_LENS), Ability.ADAPTABILITY,
                9, 0,
                new Stats(0,0,0,3,1,0), 60,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Bramoth");

    }


}
