package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Seascull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seascull(Stats stats) {
        super("Seascull",
                Type.POISON, Type.FLYING,
                stats,
                List.of(Ability.POISON_TOUCH,Ability.CONTAMINATE,Ability.ACIDCLOUD), Ability.ACIDCLOUD,
                14, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Seascull thrives in toxic waves of waste, bathing in it. So much that this Pokemon has gained special properties. Seascull's screech may even damage the health of other Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,19),
                        new MoveLearnSetEntry(Move.POISON_JAB,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,33),
                        new MoveLearnSetEntry(Move.DEFOG,36),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.OUTRAGE,47),
                        new MoveLearnSetEntry(Move.POISONDART,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Seascull");

    }


}
