package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kayo extends drai.dev.data.pokemon.Pokemon {
    public Kayo() {
        super("Kayo",
                Type.FIGHTING,Type.STEEL,
                new Stats(70,
                        115,
                        135,
                        85,
                        90,
                        60),
                List.of(Ability.UNAWARE), Ability.GUTS,
                19, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Kayo's body has reached peak performance, and now trains its mind to control its incredible strength. Constant impact has hardened the body and Kayo now hardly feels pain."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.STORM_THROW,1),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kayo");

    }


}
