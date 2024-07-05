package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Skullarva extends Pokemon {
    public Skullarva() {
        super("Skullarva",
                Type.BUG,
                new Stats(25, 70, 15, 30, 25, 50),
                List.of(Ability.INTIMIDATE, Ability.MALICE), Ability.RUN_AWAY,
                2, 18,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                43, ExperienceGroup.FAST,
                70,
                39, List.of(EggGroup.BUG),
                List.of("Skullarva spends its early life hidden away in damp caves and crevasses. It tries to scare away predators and trainers by mimicking the cries of stronger Pokemon."),
                List.of(new EvolutionEntry("maskoon", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"13")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:string",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 17, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
            ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
