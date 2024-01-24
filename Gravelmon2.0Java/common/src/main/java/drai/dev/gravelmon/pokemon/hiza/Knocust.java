package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Knocust extends drai.dev.gravelmon.pokemon.Pokemon {
    public Knocust() {
        super("Knocust",
                Type.FIGHTING,Type.BUG,
                new Stats(50,
                        82,
                        82,
                        50,
                        73,
                        83),
                List.of(Ability.SAND_RUSH), Ability.SWARM,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("Swarms of Knocust come flying to devour the vegetation during the dry season, If anything else is caught in the swarm it is delivered a flurry of punches."),
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
           setLangFileName("Knocust");

    }


}
