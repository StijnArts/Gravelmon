package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Urchum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Urchum() {
        super("Urchum",
                Type.POISON,
                new Stats(34,
                        44,
                        76,
                        24,
                        64,
                        43),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                100, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Venomous spines line its body. It is only vulnerable if all its spines break, although they grow back."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Urchum");

    }


}
