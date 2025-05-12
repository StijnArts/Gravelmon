package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whaloon extends drai.dev.data.pokemon.Pokemon {
    public Whaloon() {
        super("Whaloon",
                Type.FLYING,
                new Stats(130,
                        30,
                        30,
                        70,
                        65,
                        60),
                List.of(Ability.CLOUD_NINE,Ability.OBLIVIOUS), Ability.WIND_RIDER,
                10, 680,
                new Stats(1,0,0,0,0,0), 130,
                0.5,
                105, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("orcloud", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Whaloon");

    }


}
