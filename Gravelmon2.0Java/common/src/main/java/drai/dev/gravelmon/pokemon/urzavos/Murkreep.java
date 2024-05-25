package drai.dev.gravelmon.pokemon.urzavos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Murkreep extends drai.dev.gravelmon.pokemon.Pokemon {
    public Murkreep() {
        super("Murkreep",
                Type.DARK, Type.GRASS,
                new Stats(70,
                        106,
                        90,
                        80,
                        64,
                        110),
                List.of(Ability.STRONG_JAW), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Cry: skurleton"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAW_LOCK,1)                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Murkreep");

    }


}
