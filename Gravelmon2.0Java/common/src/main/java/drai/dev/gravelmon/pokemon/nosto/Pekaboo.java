package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pekaboo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pekaboo() {
        super("Pekaboo",
                Type.POISON,Type.FLYING,
                new Stats(25,
                        60,
                        25,
                        38,
                        25,
                        45),
                List.of(Ability.POISON_POINT), Ability.MERCILESS,
                8, 165,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("5 PeckSTAB Flying 9 Poison DartSTAB Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,5),
                        new MoveLearnSetEntry(Move.POISONDART,9)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pekaboo");

    }


}
