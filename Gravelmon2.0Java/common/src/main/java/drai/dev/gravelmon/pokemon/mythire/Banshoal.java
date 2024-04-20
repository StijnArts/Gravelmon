package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Banshoal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Banshoal() {
        super("Banshoal",
                Type.GHOST, Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOUNDPROOF), Ability.DANCER,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("Banshoal prizes itself on its appearance and loves to be the center of attention, which it achieves by overshadowing all competition with its colorful fins. However, its squawking voice is shrill enough to break glass."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JUMPSCARE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Banshoal");

    }


}
