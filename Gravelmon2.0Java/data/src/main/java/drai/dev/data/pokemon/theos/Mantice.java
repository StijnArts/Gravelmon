package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mantice extends drai.dev.data.pokemon.Pokemon {
    public Mantice() {
        super("Mantice",
                Type.FAIRY, Type.FIGHTING,
                new Stats(40,
                        80,
                        35,
                        35,
                        45,
                        70),
                List.of(Ability.STAKEOUT), Ability.SHARPNESS,
                6, 160,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mantice have very swift and fluid movements. They gracefully dance around their prey before unleashing the fatal blow."),
                List.of(new EvolutionEntry("mantislash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mantice");

    }


}
