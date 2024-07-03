package drai.dev.gravelmon.pokemon.lagoone.regional;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class LagoonanFinneon extends drai.dev.gravelmon.pokemon.Pokemon {
    public LagoonanFinneon(String name, Aspect aspect) {
        super(name, aspect, "Finneon",
                Type.GHOST,
                new Stats(49,
                        49,
                        56,
                        49,
                        61,
                        66),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 70,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("lagoonanlumineon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,9),
                        new MoveLearnSetEntry(Move.WHIRLWIND,14),
                        new MoveLearnSetEntry(Move.GRAVITY_WAVE,19),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,23),
                        new MoveLearnSetEntry(Move.SAFEGUARD,27),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,32),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,41),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,50),
                        new MoveLearnSetEntry(Move.REFLECT,50),
                        new MoveLearnSetEntry(Move.TYPHOON,55)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 7, 27, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Finneon");

    }


}
