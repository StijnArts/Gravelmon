package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scourgeon extends drai.dev.data.pokemon.Pokemon {
    public Scourgeon() {
        super("Scourgeon",
                Type.FIGHTING,
                new Stats(92,
                        112,
                        101,
                        53,
                        79,
                        98),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 1010,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                182, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("While the ocean in Lagoone is flourishing with life, the rivers are rather empty in comparison, as Scourgeon will bully and drive away any smaller Pokemon."),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Scourgeon");

    }


}
