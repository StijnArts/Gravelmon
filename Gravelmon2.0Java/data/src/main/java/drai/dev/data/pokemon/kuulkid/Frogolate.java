package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frogolate extends drai.dev.data.pokemon.Pokemon {
    public Frogolate() {
        super("Frogolate",
                Type.WATER,Type.FAIRY,
                new Stats(64,
                        65,
                        43,
                        53,
                        47,
                        60),
                List.of(Ability.MELTY), Ability.MELTY,
                6, 0,
                new Stats(2,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Frogolates are often skittish, keeping a safe distance from any threats that come their way. It is a common folktale that if you follow a Frogolate's tracks, it will lead to a flowing river of chocolate."),
                List.of(new EvolutionEntry("freddophibian", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"minecraft:cocoa_beans")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Frogolate");

    }


}
