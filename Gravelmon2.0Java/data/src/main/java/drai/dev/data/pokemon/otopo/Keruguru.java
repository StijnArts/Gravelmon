package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Keruguru extends drai.dev.data.pokemon.Pokemon {
    public Keruguru() {
        super("Keruguru",
                Type.FIGHTING,
                new Stats(55,
                        33,
                        140,
                        110,
                        10,
                        107),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Even concrete is pulverised as Keruguru twists its arm whilst throwing a punch. After three minutes of combat, the Pokemon takes a break. It is frequently encountered sparring with Hitmonlee when transported to other regions."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Keruguru");

    }


}
