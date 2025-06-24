package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Octricity extends drai.dev.data.pokemon.Pokemon {
    public Octricity() {
        super("Octricity",
                Type.WATER,Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Octricity can make the rings on its head flash brightly, and it uses this to disorient predators. If that does not work it can wrap its tentacle around and opponent and deliver a hearty shock."),
                List.of(new EvolutionEntry("plasmapod", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_LUKEWARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Octricity");

    }


}
