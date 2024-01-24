package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mothight extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mothight() {
        super("Mothight",
                Type.BUG,Type.FIGHTING,
                new Stats(65,
                        105,
                        80,
                        65,
                        65,
                        55),
                List.of(Ability.SHIELD_DUST,Ability.ANGER_POINT,Ability.HEATPROOF), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sparring and thrashing into Battlefly makes this Pokémon's temperature rise; a way of surviving and fighting over a potential mate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mothight");

    }


}
