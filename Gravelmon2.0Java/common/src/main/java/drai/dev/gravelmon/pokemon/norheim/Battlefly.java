package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Battlefly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Battlefly() {
        super("Battlefly",
                Type.BUG,Type.FIGHTING,
                new Stats(55,
                        55,
                        65,
                        105,
                        65,
                        90),
                List.of(Ability.COMPOUND_EYES,Ability.INNER_FOCUS,Ability.NO_GUARD), Ability.NO_GUARD,
                8, 165,
                new Stats(0,0,0,2,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Focus Energy Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Battlefly");

    }


}
