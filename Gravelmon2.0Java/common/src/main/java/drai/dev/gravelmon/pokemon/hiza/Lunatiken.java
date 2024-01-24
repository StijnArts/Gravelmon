package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lunatiken extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lunatiken() {
        super("Lunatiken",
                Type.PSYCHIC,Type.FLYING,
                new Stats(77,
                        73,
                        86,
                        105,
                        83,
                        56),
                List.of(Ability.TINTED_LENS), Ability.IMMUNITY,
                8, 165,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Upon evolving, its intelligence and psychic powers grew too much for its small brain to support, causing its behaviour to sometimes be unpredicable."),
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
           setLangFileName("Lunatiken");

    }


}
