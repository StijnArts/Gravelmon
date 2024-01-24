package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Javernaut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Javernaut() {
        super("Javernaut",
                Type.GROUND,Type.FIGHTING,
                new Stats(110,
                        125,
                        80,
                        60,
                        66,
                        54),
                List.of(Ability.SUNSCREEN,Ability.THICK_FAT,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(1,2,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Javernaut are employed in farms and, more rarely, in construction sites, to help with the heavy work. A hit from its club-like tail can knock down trees."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Javernaut");

    }


}
