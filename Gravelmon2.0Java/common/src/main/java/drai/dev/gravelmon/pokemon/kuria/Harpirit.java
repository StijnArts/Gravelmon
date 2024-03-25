package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Harpirit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harpirit() {
        super("Harpirit",
                Type.GHOST,Type.SOUND,
                new Stats(60,
                        40,
                        50,
                        100,
                        100,
                        80),
                List.of(Ability.SERENE_GRACE,Ability.FOREWARN), Ability.WONDERHARP,
                8, 81,
                new Stats(0,0,0,1,1,0), 100,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_2),
                List.of("It plays a serene tone with its harp-like tail. Those who listen to the sound are captivated by its loveliness and follow it endlessly, never to be seen again."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harpirit");

    }


}
