package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Junkid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Junkid() {
        super("Junkid",
                Type.STEEL,
                new Stats(50,
                        65,
                        100,
                        23,
                        40,
                        12),
                List.of(Ability.WEAK_ARMOR,Ability.HEATPROOF,Ability.HEAVY_METAL), Ability.HEAVY_METAL,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.0,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Comprised of pieces of junk screwed together and given life, Junkid are typically timid until approached gingerly. They love to be fed small pieces of discarded garbage."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Junkid");

    }


}
