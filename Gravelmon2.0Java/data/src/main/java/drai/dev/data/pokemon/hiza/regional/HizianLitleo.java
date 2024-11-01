package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianLitleo extends drai.dev.data.pokemon.Pokemon {
    public HizianLitleo(String name, Aspect aspect) {
        super(name, aspect, "Litleo",
                Type.GHOST,
                new Stats(62,
                        73,
                        58,
                        50,
                        54,
                        72),
                List.of(Ability.STEADFAST), Ability.STEADFAST,
                6, 165,
                new Stats(0,0,0,1,0,0), 220,
                0.125,
                74, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They usually can be seen playing and pouncing on thin air, its unknown if they are playing with the wind or unseen spirits."),
                List.of(new EvolutionEntry("hizianpyroar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.WORK_UP,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,11),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,15),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,18),
                        new MoveLearnSetEntry(Move.WHIRLWIND,20),
                        new MoveLearnSetEntry(Move.TWISTER,23),
                        new MoveLearnSetEntry(Move.SPITE,28),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,33),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.LAST_RESORT,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,50)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 35, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Litleo");

    }


}
