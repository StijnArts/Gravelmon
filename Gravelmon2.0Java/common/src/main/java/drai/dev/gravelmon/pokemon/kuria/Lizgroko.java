package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lizgroko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lizgroko() {
        super("Lizgroko",
                Type.POISON,Type.FIGHTING,
                new Stats(75,
                        80,
                        64,
                        70,
                        64,
                        82),
                List.of(Ability.HUSTLE,Ability.INNER_FOCUS), Ability.FLASH_FIRE,
                11, 280,
                new Stats(1,0,0,0,0,1), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("When a battle gets heated, their tail and bulb on their back will begin to glow. They really do not like when their opponents run away, and they will chase them to no end."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lizgroko");

    }


}
