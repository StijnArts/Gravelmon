package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Azuling extends drai.dev.gravelmon.pokemon.Pokemon {
    public Azuling() {
        super("Azuling",
                Type.NORMAL, Type.FLYING,
                new Stats(45,
                        25,
                        30,
                        54,
                        57,
                        40),
                List.of(Ability.KEEN_EYE,Ability.EARLY_BIRD), Ability.ALLSEEING,
                3, 14,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Azuling are some of the most cheerful Pokémon in the world. They live a relaxed life and have no worries at all. This is due to their high intelligence making it easy to outsmart any threat."),
                List.of(new EvolutionEntry("psyzul", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,17),
                        new MoveLearnSetEntry(Move.HEAL_BELL,22),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,28),
                        new MoveLearnSetEntry(Move.TAILWIND,34),
                        new MoveLearnSetEntry(Move.FROST_BREATH,38),
                        new MoveLearnSetEntry(Move.AIR_SLASH,46),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,64),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,74),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,80),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,86),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,93)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Azuling");

    }


}
