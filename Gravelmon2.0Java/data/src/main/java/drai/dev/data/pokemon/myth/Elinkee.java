package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Elinkee extends Pokemon {
    public Elinkee() {
        super("Elinkee",
                Type.WATER, Type.DRAGON,
                new Stats(80,80,60,80,65,60),
                List.of(Ability.INTIMIDATE), Ability.SPRING_LOADED,
                14, 69,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_1, EggGroup.DRAGON),
                List.of("Elinkee despite looking thick, can coil their bodies into dense springs and spring up to 200ft into the air."),
                List.of(new EvolutionEntry("serpensync", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.AQUA_JET, 1),
                        new MoveLearnSetEntry(Move.BIND, 10),
                        new MoveLearnSetEntry(Move.JET_STRIKE, 12),
                        new MoveLearnSetEntry(Move.GLARE, 14),
                        new MoveLearnSetEntry(Move.HEADBUTT, 17),
                        new MoveLearnSetEntry(Move.CRUNCH, 21),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 23),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 26),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 31),
                        new MoveLearnSetEntry(Move.ICE_FANG, 39),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 46),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 52),
                        new MoveLearnSetEntry(Move.OUTRAGE, 60),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 62),

                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.OCTAZOOKA, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.SPLASH, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, "egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND, "egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG, "egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
