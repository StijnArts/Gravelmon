package drai.dev.data.pokemon.fliga;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Julimese extends drai.dev.data.pokemon.Pokemon {
    public Julimese() {
        super("Julimese",
                Type.GRASS, Type.ELECTRIC,
                new Stats(71,
                        59,
                        71,
                        89,
                        167,
                        83),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                4, 0,
                new Stats(0,0,0,0,3,0), 30,
                0.0,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-028 Twin. A member of an Ultra Beast family. It's said that if it were to be separated from its twin body for long enough, it would erupt into a burst so destructive it'd be enough to erase matter."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.STUNJAB,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.TICKLE,14),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.WORRY_SEED,31),
                        new MoveLearnSetEntry(Move.FACEPLANT,36),
                        new MoveLearnSetEntry(Move.DISCHARGE,41),
                        new MoveLearnSetEntry(Move.ROTOTILLER,46),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,51),
                        new MoveLearnSetEntry(Move.POWER_WHIP,57)                ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Julimese");

    }


}
