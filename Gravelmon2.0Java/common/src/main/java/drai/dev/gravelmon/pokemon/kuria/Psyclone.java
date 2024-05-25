package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Psyclone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyclone() {
        super("Psyclone",
                Type.FLYING, Type.PSYCHIC,
                new Stats(75,
                        50,
                        60,
                        124,
                        89,
                        90),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.ALLSEEING,
                19, 404,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Psyclone are seen throughout the sky, watching over the world and learning from everything they see. Their loss of feet through evolution forces them to refine their wings and mind."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 36, 54, .14, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Psyclone");

    }


}
