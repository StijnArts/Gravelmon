package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Beetile extends drai.dev.data.pokemon.Pokemon {
    public Beetile() {
        super("Beetile",
                Type.BUG,
                new Stats(50,
                        80,
                        55,
                        25,
                        35,
                        45),
                List.of(Ability.SAP_SIPPER,Ability.HYPER_CUTTER), Ability.OBLIVIOUS,
                4, 55,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Beetile use their horn to chip away at trees, getting to the sap inside. When they're close to evolving, they will stick to the side of an object and not let go until they evolve."),
                List.of(new EvolutionEntry("theossianheracross", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(1).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OLD_GROWTH_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Beetile");

    }


}
