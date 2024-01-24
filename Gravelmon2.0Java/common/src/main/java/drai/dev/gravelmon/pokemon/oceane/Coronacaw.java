package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Coronacaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coronacaw() {
        super("Coronacaw",
                Type.NORMAL,Type.FLYING,
                new Stats(70,
                        90,
                        75,
                        90,
                        65,
                        100),
                List.of(Ability.SWIFT_SWIM), Ability.MULTISCALE,
                8, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_2),
                List.of("The Coronacaw with the largest crest will lead the colony. Although seemingly fragile, the crests can withstand tremendous force and make good shields. Shards that break off become 'sea glass' and wash up on beaches, and are very popular with collectors."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coronacaw");

    }


}
