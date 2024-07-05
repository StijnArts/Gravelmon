package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dumpchin extends drai.dev.data.pokemon.Pokemon {
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
                7, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                68, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Decades ago, they were covered in sharp bristles. Nowadays, their skin is simply covered by a firm, but fuzzy mantle."),
                List.of(new EvolutionEntry("urchimpale", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
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
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
