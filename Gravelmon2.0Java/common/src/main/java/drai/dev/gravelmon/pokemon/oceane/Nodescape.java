package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nodescape extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nodescape() {
        super("Nodescape",
                Type.FAIRY,Type.ROCK,
                new Stats(66,
                        63,
                        93,
                        77,
                        90,
                        21),
                List.of(Ability.BATTLE_ARMOR), Ability.MAGIC_GUARD,
                8, 165,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When a Hypnode has taken residence inside a Cupscape, it evolves into Nodescape. The Cupscape always appears to let the Hypnode take residence, but its partnership with it is considered parasitic."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nodescape");

    }


}
