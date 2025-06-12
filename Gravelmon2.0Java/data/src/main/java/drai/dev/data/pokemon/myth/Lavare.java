package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lavare extends Pokemon {
    public Lavare() {
        super("Lavare",
                Type.FIRE, Type.DRAGON,
                new Stats(90,75,100,40,100,65),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                9, 69,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FIELD),
                List.of("Lavee was known for its incredibly fast swimming skills in lava, this Pokemon can handle tempatures up to 750,000,000 degrees."),
                List.of(new EvolutionEntry("lavarator", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 6),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, 10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 13),
                        new MoveLearnSetEntry(Move.PROTECT, 17),
                        new MoveLearnSetEntry(Move.WILLOWISP, 21),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 27),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 30),
                        new MoveLearnSetEntry(Move.FACADE, 34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 36),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 40),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 43),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, 48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 54),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 58),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 65),
                        new MoveLearnSetEntry(Move.METEOR_MASH, 69)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 25, 43, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.21, 0.3,
                List.of());
    }
}
