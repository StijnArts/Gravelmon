package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Herokolus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Herokolus() {
        super("Herokolus",
                Type.FIGHTING,
                new Stats(60,
                        84,
                        62,
                        20,
                        30,
                        45),
                List.of(Ability.SHEER_FORCE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 110,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Herokolus train everyday so they can throw at their targets accurately. Its headpiece has special properties that help it to concentrate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Herokolus");

    }


}
