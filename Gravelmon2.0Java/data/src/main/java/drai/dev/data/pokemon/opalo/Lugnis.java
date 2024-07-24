package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Lugnis extends Pokemon {
    public Lugnis() {
        super("Lugnis",
                Type.FIRE,
                new Stats(39,60,43,65,52,50),
                List.of(Ability.BLAZE), Ability.UNNERVE,
                6, 300,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("luravit", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 10),
                        new MoveLearnSetEntry(Move.BITE, 13),
                        new MoveLearnSetEntry(Move.HOWL, 17),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 19),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 25),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 28),
                        new MoveLearnSetEntry(Move.SWAGGER, 31),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, 34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 37),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, 43),
                        new MoveLearnSetEntry(Move.INFERNO, 46),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP, "egg"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.BITE, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "egg"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "egg"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "egg"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, "egg"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.METAL_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
