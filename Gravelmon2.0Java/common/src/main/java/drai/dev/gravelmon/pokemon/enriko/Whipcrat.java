package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Whipcrat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whipcrat() {
        super("Whipcrat",
                Type.NORMAL,
                new Stats(45,
                        65,
                        35,
                        35,
                        35,
                        60),
                List.of(Ability.HUSTLE,Ability.GUTS,Ability.ANGER_POINT), Ability.ANGER_POINT,
                3, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its tail always has a lot of tension held inside it. When threatened, it whips using its tail, releasing all the tension at once."),
                List.of(new EvolutionEntry("ratonine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,8),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.BIND,16),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Whipcrat");

    }


}
