package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Syreist extends drai.dev.data.pokemon.Pokemon {
    public Syreist() {
        super("Syreist",
                Type.POISON, Type.GHOST,
                new Stats(20,
                        60,
                        15,
                        85,
                        65,
                        75),
                List.of(Ability.POISON_POINT), Ability.CLEAR_BODY,
                5, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.6,
                70, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its eyeball is its main body, and it feeds off of bacteria. It latches onto sick people during the night, sucking their blood to keep itself nourished."),
                List.of(new EvolutionEntry("injectoplasm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,7),
                        new MoveLearnSetEntry(Move.PECK,10),
                        new MoveLearnSetEntry(Move.ACID,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,20),
                        new MoveLearnSetEntry(Move.GLARE,24),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,26),
                        new MoveLearnSetEntry(Move.SLUDGE,30),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.VENOSHOCK,40),
                        new MoveLearnSetEntry(Move.MEGAHORN,44),
                        new MoveLearnSetEntry(Move.HORN_DRILL,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
