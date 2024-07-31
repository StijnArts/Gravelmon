package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanHattrem extends drai.dev.data.pokemon.Pokemon {
    public LagoonanHattrem(String name, Aspect aspect) {
        super(name, aspect, "Hattrem",
                Type.FAIRY,Type.WATER,
                new Stats(57,
                        40,
                        65,
                        86,
                        73,
                        49),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 48,
                new Stats(0,0,0,2,0,0), 120,
                0.0,
                130, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("hatterene lagoonan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 38, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Hattrem");

    }


}
