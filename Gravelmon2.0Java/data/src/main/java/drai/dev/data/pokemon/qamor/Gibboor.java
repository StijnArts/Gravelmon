package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gibboor extends drai.dev.data.pokemon.Pokemon {
    public Gibboor() {
        super("Gibboor",
                Type.DARK,
                new Stats(50,
                        84,
                        80,
                        75,
                        47,
                        66),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                6, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FIELD),
                List.of("Due to their flexibility and astounding reflexes, Gibboor able to contort its body in odd and sometime unsettling angles in order to see in any directions."),
                List.of(new EvolutionEntry("grimandrill", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.SWAGGER,15),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.UPROAR,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,24),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,27),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,31),
                        new MoveLearnSetEntry(Move.THRASH,38),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,40),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,50)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 38, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gibboor");

    }


}
