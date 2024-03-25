package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Plagfowl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plagfowl() {
        super("Plagfowl",
                Type.GHOST,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                5, 100,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Plagfowl, a misunderstood Pokémon that is thought to bring misfortune and illness upon people, but is actually very harmless. It often lives alone because of that."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plagfowl");

    }


}
