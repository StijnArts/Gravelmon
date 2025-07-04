package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoonoes extends drai.dev.data.pokemon.Pokemon {
    public Hoonoes() {
        super("Hoonoes",
                Type.GHOST,
                new Stats(60,
                        30,
                        45,
                        65,
                        60,
                        50),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.LEVITATE,
                10, 5,
                new Stats(0,0,0,1,0,0), 255,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoonoes like to hide in the shadows making loud noises to scare people passing by. It's said they can fortell when someone will die."),
                List.of(new EvolutionEntry("younoes", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hoonoes");

    }


}
