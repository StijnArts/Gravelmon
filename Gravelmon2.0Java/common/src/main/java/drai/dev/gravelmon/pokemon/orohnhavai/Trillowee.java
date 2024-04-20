package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Trillowee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trillowee() {
        super("Trillowee",
                Type.GRASS, Type.GHOST,
                new Stats(60,
                        120,
                        67,
                        120,
                        82,
                        86),
                List.of(Ability.UNBURDEN), Ability.INSOMNIA,
                8, 165,
                new Stats(0,2,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("It became more wicked upon evolution. There have been rare cases of Trillowee kidnapping wandering children. It is said to imitate the sound of a crying child to lure strangers into the forest. Trillowee will then swoop in and steal their soul."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trillowee");

    }


}
