package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aerling extends drai.dev.data.pokemon.Pokemon {
    public Aerling() {
        super("Aerling",
                Type.FLYING, Type.DRAGON,
                new Stats(45,
                        30,
                        40,
                        75,
                        50,
                        60),
                List.of(Ability.AIR_LOCK), Ability.WIND_RIDER,
                5, 10,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("cyclowyrm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Aerling");

    }


}
