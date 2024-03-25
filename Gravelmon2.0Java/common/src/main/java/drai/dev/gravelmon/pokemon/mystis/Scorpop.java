package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Scorpop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scorpop() {
        super("Scorpop",
                Type.FAIRY,Type.BUG,
                new Stats(70,
                        90,
                        60,
                        90,
                        60,
                        85),
                List.of(Ability.ARENA_TRAP), Ability.SWEET_VEIL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                159, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.BUG),
                List.of("- Sweet DecaySTAB Fairy - Play RoughSTAB Fairy - LungeSTAB Bug - Sugar Rush Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEETDECAY,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.LUNGE,1),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,1),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scorpop");

    }


}
