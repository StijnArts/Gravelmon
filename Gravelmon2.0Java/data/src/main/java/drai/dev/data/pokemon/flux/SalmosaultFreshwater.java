package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SalmosaultFreshwater extends Pokemon {
    public SalmosaultFreshwater() {
        super("SalmosaultFreshwater",
                Type.WATER,
                new Stats(92,
                        76,
                        63,
                        103,
                        96,
                        60),
                List.of(Ability.STAMINA, Ability.TECHNICIAN), Ability.SWIFT_SWIM,
                11, 220,
                new Stats(0,1,1,0,0,0), 120,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_2, EggGroup.WATER_1),
                List.of("SALMINI that mature in fresh water evolve into this form. It's fierce and territorial, and loves throwing stones as much as collecting them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.YAWN,16),
                        new MoveLearnSetEntry(Move.FLAIL,19),
                        new MoveLearnSetEntry(Move.JAW_LOCK,23),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,34),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,39),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,45),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_RIVER)
    .setAntiBiomes(Biome.IS_ARID, Biome.IS_TEMPERATE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setLangFileName("Salmosault");
    }
}
