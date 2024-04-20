package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maracabre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maracabre() {
        super("Maracabre",
                Type.GHOST, Type.GRASS,
                new Stats(85,
                        86,
                        67,
                        126,
                        97,
                        70),
                List.of(Ability.SERENE_GRACE,Ability.SOULABSORB,Ability.WANDERING_SPIRIT), Ability.WANDERING_SPIRIT,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They dance all night as a way of honoring the departed. It is said these Pokemon help wandering spirits find their way to visit their living relatives. The trail of petals they leave guide them back home to the world of spirits."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,16),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,34),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,40),
                        new MoveLearnSetEntry(Move.CURSE,46),
                        new MoveLearnSetEntry(Move.WILLOWISP,52),
                        new MoveLearnSetEntry(Move.HEX,58),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,64),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,70),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,76)                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maracabre");

    }


}
