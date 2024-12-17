package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gustwee extends drai.dev.data.pokemon.Pokemon {
    public Gustwee() {
        super("Gustwee",
                Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WIND_RIDER,Ability.GALE_WINGS), Ability.AERILATE,
                5, 51,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They fly in great numbers with incredible coordination. Sometimes, what might be mistaken for a cloud is actually a massive flock of Gustwee."),
                List.of(new EvolutionEntry("elegyre", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 14, 36, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Gustwee");

    }


}
