package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gaierth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gaierth() {
        super("Gaierth",
                Type.GRASS,Type.BUG,
                new Stats(75,
                        80,
                        100,
                        165,
                        130,
                        120),
                List.of(Ability.GRASSY_SURGE), Ability.GRASSY_SURGE,
                87, 165,
                new Stats(0,0,0,2,1,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("By flapping its majestic wings, it constantly spreads various seeds that fully grow in mere seconds. It is deeply connected with the region of Hiza and all Pokémon that inhabit it."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.FALSE_SWIPE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.FELL_STINGER,29),
                        new MoveLearnSetEntry(Move.HELPING_HAND,32),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,36),
                        new MoveLearnSetEntry(Move.XSCISSOR,39),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,43),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,50)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .00003, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
