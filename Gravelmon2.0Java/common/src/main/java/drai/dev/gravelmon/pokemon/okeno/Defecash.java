package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Defecash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Defecash() {
        super("Defecash",
                Type.GRASS,Type.DRAGON,
                new Stats(90,
                        83,
                        80,
                        83,
                        80,
                        37),
                List.of(Ability.STORM_DRAIN,Ability.OBLIVIOUS,Ability.STRONG_JAW), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Flytrap FangSTAB Grass - Vortex Drain Water - Whirlpool Water - TwisterSTAB Dragon - Dragon BreathSTAB Dragon - OutrageSTAB Dragon - Nature's Call Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NATURESCALL,1),
                        new MoveLearnSetEntry(Move.DRAGONFANG,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Defecash");

    }


}
