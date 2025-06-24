package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mofly extends drai.dev.data.pokemon.Pokemon {
    public Mofly() {
        super("Humini",
                Type.BUG, Type.FAIRY,
                new Stats(40,
                        45,
                        40,
                        55,
                        40,
                        85),
                List.of(Ability.HONEY_GATHER,Ability.SHIELD_DUST), Ability.INFILTRATOR,
                5, 17,
                new Stats(0,0,0,0,0,1), 250,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("humoth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Humini");

    }


}
