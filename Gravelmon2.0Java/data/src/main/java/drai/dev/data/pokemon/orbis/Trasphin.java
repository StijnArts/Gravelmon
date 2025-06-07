package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trasphin extends drai.dev.data.pokemon.Pokemon {
    public Trasphin() {
        super("Trasphin",
                Type.GHOST, Type.POISON,
                new Stats(60,
                        50,
                        55,
                        80,
                        80,
                        70),
                List.of(Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                12, 0,
                new Stats(0,0,0,1,1,0), 130,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Years of ocean pollution have caused Trasphin to absorb toxins and oil into their bodies to adapt. They are full of sludge that they expel out of their bottle like noses."),
                List.of(new EvolutionEntry("whaste", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Trasphin");

    }


}
