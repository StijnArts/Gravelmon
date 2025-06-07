package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Conchle extends drai.dev.data.pokemon.Pokemon {
    public Conchle() {
        super("Conchle",
                Type.WATER, Type.ROCK,
                new Stats(50,
                        45,
                        92,
                        45,
                        50,
                        46),
                List.of(Ability.SHELL_ARMOR), Ability.SWIFT_SWIM,
                3, 60,
                new Stats(0,0,1,0,0,0), 150,
                0.5,
                63, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("turtlantis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setCanWalkOnWater(true);
           setLangFileName("Conchle");

    }


}
