package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Maskoon extends Pokemon {
    public Maskoon() {
        super("Maskoon",
                Type.BUG,
                new Stats(70, 60, 60, 45, 75, 35),
                List.of(Ability.INTIMIDATE, Ability.MALICE), Ability.RUN_AWAY,
                5, 80,
                new Stats(1,0,0,0,1,0), 120,
                0.5,
                121, ExperienceGroup.FAST,
                70,
                39, List.of(EggGroup.BUG),
                List.of("It imitates the cries of other Pokémon, but warps them so they sound morbid and unnatural. The pattern on its back is used to scare off predators."),
                List.of(new EvolutionEntry("mortasque", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,10),
                        new MoveLearnSetEntry(Move.HARDEN,13),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,17),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.WEB_BALL,25),
                        new MoveLearnSetEntry(Move.UPROAR,29),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:string",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 35, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
