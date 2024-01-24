package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shelswap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shelswap() {
        super("Shelswap",
                Type.FAIRY,
                new Stats(50,
                        50,
                        105,
                        50,
                        105,
                        100),
                List.of(Ability.PICKPOCKET), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                161, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FLYING),
                List.of("An odd, secretive Pokemon. It collects lost eggs and brings them to safe new homes and parents. It's thought to have evolved from a mysterious egg that never hatched, so it protects the eggs of others."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shelswap");

    }


}
