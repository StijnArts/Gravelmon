package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Skewern extends drai.dev.data.pokemon.Pokemon {
    public Skewern() {
        super("Skewern",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.HUSTLE,Ability.SUPER_LUCK,Ability.SKILL_LINK), Ability.SKILL_LINK,
                4, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Residing in trees, they drop down onto enemies below, hitting them with their spike. A large group of them can damage their enemy very badly. They fight with Seedot over territory."),
                List.of(new EvolutionEntry("pierceed", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(              new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.ARM_THRUST,17),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,25),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,37),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,41),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,49),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,53),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,60)          ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skewern");

    }


}
