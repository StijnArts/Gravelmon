package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Heeleap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Heeleap() {
        super("Heeleap",
                Type.FIGHTING,Type.STEEL,
                new Stats(55,
                        55,
                        40,
                        40,
                        60,
                        55),
                List.of(Ability.QUICK_FEET,Ability.RECKLESS,Ability.PRANKSTER), Ability.PRANKSTER,
                8, 165,
                new Stats(0,0,0,0,1,0), 200,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("A tightly-coiled tail allows this Pokemon to bounce to great heights. When in danger, its tail can rapidly uncoil to a sharpened point to use as a weapon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.AXE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heeleap");

    }


}
