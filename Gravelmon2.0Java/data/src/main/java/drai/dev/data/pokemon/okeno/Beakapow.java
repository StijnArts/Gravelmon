package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beakapow extends drai.dev.data.pokemon.Pokemon {
    public Beakapow() {
        super("Beakapow",
                Type.ROCK, Type.FLYING,
                new Stats(60,
                        80,
                        123,
                        78,
                        76,
                        73),
                List.of(Ability.ROCK_HEAD,Ability.BATTLE_ARMOR,Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                                              ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 45, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beakapow");

    }


}
