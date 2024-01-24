package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Lavarator extends Pokemon {
    public Lavarator() {
        super("Lavarator",
                Type.FIRE, Type.DRAGON,
                new Stats(110,95,110,70,120,70),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                14, 69,
                new Stats(0,0,1,0,2,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FIELD),
                List.of("Lavarator can break through any substance known to man, the pure heat of its blade arms can saw through titanium."),
                List.of(),
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
                ), SpawnContext.SURFACE, SpawnPool.RARE, 43, 67, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
