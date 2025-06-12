package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Asterave extends drai.dev.data.pokemon.Pokemon {
    public Asterave() {
        super("Asterave",
                Type.DRAGON,Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                UnitConverter.feetToMeters(2, 6), 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("astradarna", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55")))),
                List.of(),
                List.of(Label.ALDAO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Asterave");

    }


}
