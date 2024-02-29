package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Torchurn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Torchurn() {
        super("Torchurn",
                Type.FIRE,Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.DROUGHT,Ability.PRESSURE,Ability.GOLDRUSH), Ability.GOLDRUSH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("In ancient times, these Pokemon would anchor themselves close to the shore partially-submerged. Torchurn used sunlight to enhance their flames whilst incubating with enough intensity to breach its hardened Limbtacle shell, which doubled as a deterrent to predators."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Torchurn");

    }


}
