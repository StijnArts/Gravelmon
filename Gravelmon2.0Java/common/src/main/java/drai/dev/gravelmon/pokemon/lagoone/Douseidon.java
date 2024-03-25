package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Douseidon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Douseidon() {
        super("Douseidon",
                Type.WATER,Type.PSYCHIC,
                new Stats(81,
                        71,
                        80,
                        109,
                        100,
                        89),
                List.of(Ability.TORRENT), Ability.TRACE,
                16, 430,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("A sonar wave can be beamed from its crest stopping and paralysing its opponents. They are very distrustful of others making very difficult to get along with."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Douseidon");

    }


}
