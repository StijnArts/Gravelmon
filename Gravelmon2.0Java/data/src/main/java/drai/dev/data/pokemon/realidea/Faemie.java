package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Faemie extends Pokemon {
    public Faemie() {
        super("Faemie",
                Type.PSYCHIC, Type.FAIRY,
                new Stats(100,90,60,100,130,80),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                4, 3,
                new Stats(1,0,1,0,1,0), 3,
                -1,
                263, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
