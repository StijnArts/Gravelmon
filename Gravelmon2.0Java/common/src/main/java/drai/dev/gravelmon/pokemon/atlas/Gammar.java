package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gammar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gammar() {
        super("Gammar",
                Type.ELECTRIC,
                new Stats(55,
                        65,
                        50,
                        70,
                        45,
                        65),
                List.of(Ability.WATER_ABSORB,Ability.SWIFT_SWIM,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Because it is only small, it takes shelter in coral patches and rock formations. When cornered, it will release a jolt of electricity allowing make its escape. It is famed for having such bright colours, and is a sought after prize for many Trainers who participate in Pokémon Beauty Contests."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gammar");

    }


}
