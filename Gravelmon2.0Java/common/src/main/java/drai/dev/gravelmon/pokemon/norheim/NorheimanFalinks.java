package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanFalinks extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanFalinks() {
        super("Falinks",
                Type.STEEL,Type.FIGHTING,
                new Stats(65,
                        110,
                        120,
                        50,
                        50,
                        75),
                List.of(Ability.BATTLE_ARMOR), Ability.STEELY_SPIRIT,
                8, 165,
                new Stats(0,1,1,0,0,0), 0,
                0.0,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Falinks");

    }


}
