package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Skirmaki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Skirmaki() {
        super("Skirmaki",
                Type.NORMAL, Type.FIGHTING,
                new Stats(72,
                        73,
                        53,
                        53,
                        63,
                        90),
                List.of(Ability.LIMBER,Ability.IRON_FIST,Ability.SKILL_LINK), Ability.SKILL_LINK,
                11, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                152, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is really smart and won't back away from a fight. If one seeN running away, its most likely luring its foe into an ambush."),
                List.of(new EvolutionEntry("murcenary", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
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
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 18, 35, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skirmaki");

    }


}
