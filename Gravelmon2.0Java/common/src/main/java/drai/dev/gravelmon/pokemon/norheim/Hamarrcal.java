package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hamarrcal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hamarrcal() {
        super("Hamarrcal",
                Type.ELECTRIC,Type.ROCK,
                new Stats(110,
                        140,
                        120,
                        120,
                        110,
                        80),
                List.of(Ability.LIGHTNING_ROD), Ability.ELECTRIC_SURGE,
                8, 165,
                new Stats(0,2,2,0,0,0), 45,
                0.0,
                306, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Once worshipped by agricultural people for centuries in hope of rain and a successful harvest. Little did they know however how this Pokemon once drained multiple seas; creating stormy, cosmic clouds. Hamarrcal's precison when striking is out of this world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.CHARGE,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,22),
                        new MoveLearnSetEntry(Move.GRAVITY,28),
                        new MoveLearnSetEntry(Move.ACCELEROCK,36),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,50),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,56),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,62),
                        new MoveLearnSetEntry(Move.THUNDER,72),
                        new MoveLearnSetEntry(Move.METEOR_MASH,80),
                        new MoveLearnSetEntry(Move.CRABHAMMER,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hamarrcal");

    }


}
