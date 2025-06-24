package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Howligoon extends drai.dev.data.pokemon.Pokemon {
    public Howligoon() {
        super("Howligoon",
                Type.FIGHTING,
                new Stats(40,
                        55,
                        40,
                        70,
                        40,
                        55),
                List.of(Ability.SOUNDPROOF,Ability.RIVALRY), Ability.COMPETITIVE,
                10, 215,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Howligoon constantly fight for leadership, with the loudest howler being the Alpha of the tribe. When they're in a bad mood they will bang on their chest and go on a rampage."),
                List.of(new EvolutionEntry("boomian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Howligoon");

    }


}
