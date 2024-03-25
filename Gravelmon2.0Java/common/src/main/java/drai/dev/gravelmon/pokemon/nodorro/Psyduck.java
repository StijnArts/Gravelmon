package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Psyduck extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyduck() {
        super("Psyduck",
                Type.WATER,
                new Stats(50,
                        52,
                        48,
                        65,
                        50,
                        55),
                List.of(Ability.DAMP,Ability.CLOUD_NINE), Ability.SWIFT_SWIM,
                8, 196,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Always tormented by headaches. It uses psychic powers, but whether it intends to do so is not known. - Place holder"),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Psyduck");

    }


}
