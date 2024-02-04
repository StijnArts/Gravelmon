package drai.dev.gravelmon.pokemon.avoris.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AvorianMaractus extends drai.dev.gravelmon.pokemon.Pokemon {
    public AvorianMaractus(int dex) {
        super(dex, "AvorianMaractus",
                Type.GHOST,Type.GRASS,
                new Stats(75,
                        86,
                        67,
                        106,
                        67,
                        60),
                List.of(Ability.SERENE_GRACE,Ability.SOULABSORB,Ability.WANDERING_SPIRIT), Ability.WANDERING_SPIRIT,
                10, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Once every fall, groups of this Pokémon gather and dance in unison throughout the entire night. Other Ghost-type Pokémon are invited to dance along with them. The bone-chilling rattling in their hollow bodies is enough to paralyze adults with fear."),
                List.of(new EvolutionEntry("maracabre", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "night")))),
                List.of(
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,16),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,32),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,36),
                        new MoveLearnSetEntry(Move.CURSE,40),
                        new MoveLearnSetEntry(Move.WILLOWISP,44),
                        new MoveLearnSetEntry(Move.HEX,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,52),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,56),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,60)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 46, 10, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maractus");

    }


}
