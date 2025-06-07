package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cubtus extends drai.dev.data.pokemon.Pokemon {
    public Cubtus() {
        super("Cubtus",
                Type.GRASS,
                new Stats(46,
                        68,
                        45,
                        55,
                        35,
                        58),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                5, 65,
                new Stats(0,1,0,0,0,0), 45,
                0.87,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("It's fur may look cuddly, but it's littered with many tiny thorns. However, they rather feel like little dull pin-pricks. The only thing that is not completely covered with thorns is the fur ruffle around the neck. It's rather soft."),
                List.of(new EvolutionEntry("paddorn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cubtus");

    }


}
