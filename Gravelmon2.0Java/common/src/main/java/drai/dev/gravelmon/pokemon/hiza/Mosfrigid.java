package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mosfrigid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mosfrigid() {
        super("Mosfrigid",
                Type.ICE,Type.BUG,
                new Stats(40,
                        70,
                        45,
                        70,
                        85,
                        92),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It drains the warmth of people and Pokémon it stings. The warmer its own body gets, the better it can fly."),
                List.of(new EvolutionEntry("skiito", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))
                ),
                List.of(     new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,4),
                        new MoveLearnSetEntry(Move.INFESTATION,8),
                        new MoveLearnSetEntry(Move.MIST,12),
                        new MoveLearnSetEntry(Move.DEFOG,16),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,21),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,28),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,32),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,40),
                        new MoveLearnSetEntry(Move.TAILWIND,44),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,52)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 25, 37, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
