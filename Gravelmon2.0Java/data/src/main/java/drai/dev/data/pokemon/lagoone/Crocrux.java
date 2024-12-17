package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crocrux extends drai.dev.data.pokemon.Pokemon {
    public Crocrux() {
        super("Crocrux",
                Type.PSYCHIC,
                new Stats(55,
                        65,
                        50,
                        65,
                        50,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 120,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("caimarune", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 41, 4.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Crocrux");

    }


}
