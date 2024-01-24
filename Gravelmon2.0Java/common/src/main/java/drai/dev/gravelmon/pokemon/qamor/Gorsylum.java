package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Gorsylum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gorsylum() {
        super("Gorsylum",
                Type.GHOST,Type.DRAGON,
                new Stats(90,
                        150,
                        104,
                        90,
                        90,
                        76),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,3,0,0,0,0), 15,
                0.5,
                284, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("Gorsylum constantly wail in despair, longing for sunlight despite being deathly harmed by it. Gorsylum will crumble into dust and ash when defeated in battle, but simply plunging its sword into the ground will bring it back from the surrounding debris."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gorsylum");

    }


}
