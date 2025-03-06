package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mudpole extends drai.dev.data.pokemon.Pokemon {
    public Mudpole() {
        super("Mudpole",
                Type.GROUND, Type.POISON,
                new Stats(52,
                        52,
                        42,
                        40,
                        45,
                        61),
                List.of(Ability.POISON_TOUCH,Ability.STICKY_HOLD,Ability.HYDRATION), Ability.HYDRATION,
                4, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("It lives in mud, which it absorbs into a second skin. The mud forms blisters that are filled with poison, and if any Pokemon bites into it, they will be knocked out cold."),
                List.of(new EvolutionEntry("sapuddle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 24, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Mudpole");

    }


}
