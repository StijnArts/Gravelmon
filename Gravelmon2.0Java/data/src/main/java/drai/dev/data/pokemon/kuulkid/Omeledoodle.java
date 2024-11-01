package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Omeledoodle extends drai.dev.data.pokemon.Pokemon {
    public Omeledoodle() {
        super("Omeledoodle",
                Type.FIRE,Type.FLYING,
                new Stats(110,
                        90,
                        75,
                        80,
                        60,
                        80),
                List.of(Ability.EARLY_BIRD), Ability.FLUFFY,
                16, 0,
                new Stats(3,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The call of this pokemon can awake a pokemon from even the deepest of slumbers. For this reason, farmers keep this pokemon around to make sure they wake up on time."),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Omeledoodle");

    }


}
