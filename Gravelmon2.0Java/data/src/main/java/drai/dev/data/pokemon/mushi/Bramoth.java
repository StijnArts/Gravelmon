package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bramoth extends drai.dev.data.pokemon.Pokemon {
    public Bramoth() {
        super("Bramoth",
                Type.DARK, Type.FLYING,
                new Stats(75,
                        65,
                        60,
                        125,
                        105,
                        70),
                List.of(Ability.TINTED_LENS), Ability.ADAPTABILITY,
                9, 0,
                new Stats(0,0,0,3,1,0), 60,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Bramoth");

    }


}
