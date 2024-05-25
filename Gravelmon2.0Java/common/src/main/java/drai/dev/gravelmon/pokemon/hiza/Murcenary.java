package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Murcenary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Murcenary() {
        super("Murcenary",
                Type.NORMAL, Type.FIGHTING,
                new Stats(75,
                        103,
                        62,
                        66,
                        72,
                        112),
                List.of(Ability.LIMBER,Ability.IRON_FIST,Ability.SKILL_LINK), Ability.SKILL_LINK,
                19, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                225, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The size of Murcenary's scarf indicates its age. The ringed arms are as flexible as its long tail, giving it even more mobility around treetops."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,5),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,10),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,13),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.SWIFT,18),
                        new MoveLearnSetEntry(Move.ROUND,21),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,26),
                        new MoveLearnSetEntry(Move.DETECT,28),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,32),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,34),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,39),
                        new MoveLearnSetEntry(Move.IRON_TAIL,42),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,50)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 37, 52, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Murcenary");

    }


}
