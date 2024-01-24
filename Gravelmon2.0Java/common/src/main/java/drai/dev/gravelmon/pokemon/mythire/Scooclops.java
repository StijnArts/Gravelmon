package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scooclops extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scooclops() {
        super("Scooclops",
                Type.GHOST,
                new Stats(40,
                        60,
                        50,
                        20,
                        40,
                        90),
                List.of(Ability.SPEED_BOOST), Ability.LIMBER,
                8, 165,
                new Stats(0,0,0,0,0,1), 180,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("It's almost weightless when moving fast enough, so it can glide between rooftops and valleys without falling down. However, Scooclops cannot steer at all and crashes into obstacles easily."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.RUSHDOWN,"tm"),
                        new MoveLearnSetEntry(Move.TRASHTALK,"tm"),
                        new MoveLearnSetEntry(Move.JUMPSCARE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGYLOOP,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scooclops");

    }


}
