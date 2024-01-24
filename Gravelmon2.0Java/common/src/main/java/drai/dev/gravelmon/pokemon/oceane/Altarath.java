package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Altarath extends drai.dev.gravelmon.pokemon.Pokemon {
    public Altarath() {
        super("Altarath",
                Type.FIRE,Type.DRAGON,
                new Stats(72,
                        92,
                        78,
                        133,
                        67,
                        63),
                List.of(Ability.DROUGHT,Ability.PRESSURE,Ability.GOLDRUSH), Ability.GOLDRUSH,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                227, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("Believed to exude flames that even the seas couldn't fully contain, Altarath were only found in relatively inhospitable waters of its time. It is debated to this day if they were attracted to these areas, or if they made them that way with their powers."),
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
           setLangFileName("Altarath");

    }


}
