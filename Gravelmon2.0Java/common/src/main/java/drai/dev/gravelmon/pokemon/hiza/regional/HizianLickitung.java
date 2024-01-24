package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianLickitung extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianLickitung() {
        super("Lickitung",
                Type.FAIRY,
                new Stats(80,
                        55,
                        75,
                        60,
                        75,
                        40),
                List.of(Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Unlike ordinary Lickitung, it will only eat sweet food. It sticks stolen candy on its belly to stop and eat when its safe."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lickitung");

    }


}
