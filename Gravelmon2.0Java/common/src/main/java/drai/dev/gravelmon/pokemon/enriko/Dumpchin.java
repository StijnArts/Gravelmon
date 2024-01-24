package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dumpchin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dumpchin() {
        super("Dumpchin",
                Type.POISON,
                new Stats(35,
                        50,
                        75,
                        20,
                        60,
                        20),
                List.of(Ability.HYDRATION,Ability.WATER_VEIL,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                68, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Decades ago, they were covered in sharp bristles. Nowadays, their skin is simply covered by a firm, but fuzzy mantle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.FLAIL,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.YAWN,21),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.SNORE,34),
                        new MoveLearnSetEntry(Move.REST,38),
                        new MoveLearnSetEntry(Move.ENDEAVOR,43)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dumpchin");

    }


}
