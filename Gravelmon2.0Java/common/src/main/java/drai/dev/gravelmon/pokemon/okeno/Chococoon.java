package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chococoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chococoon() {
        super("Chococoon",
                Type.BUG,
                new Stats(70,
                        42,
                        80,
                        30,
                        80,
                        16),
                List.of(Ability.BATTLE_ARMOR,Ability.JAWBREAKER,Ability.OBLIVIOUS), Ability.OBLIVIOUS,
                7, 165,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its rock-hard shell is delicious, but almost impossible to eat. Its color darkens as it gets closer to evolving."),
                List.of(new EvolutionEntry("bombeetle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.ENDURE,15),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 24, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chococoon");

    }


}
