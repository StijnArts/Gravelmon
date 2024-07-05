package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class SalmosaultSaltwater extends Pokemon {
    public SalmosaultSaltwater() {
        super("SalmosaultSaltwater",
                Type.WATER,
                new Stats(92,
                        76,
                        63,
                        103,
                        96,
                        60),
                List.of(Ability.BERSERK, Ability.LIQUID_VOICE), Ability.SWIFT_SWIM,
                11, 220,
                new Stats(0,0,0,1,1,0), 120,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.WATER_2, EggGroup.WATER_1),
                List.of("SALMINI that mature in salty water evolve into this form. It carries a shell that it plays like a trumpet. Getting interrupted infuriates it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.YAWN,16),
                        new MoveLearnSetEntry(Move.FLAIL,19),
                        new MoveLearnSetEntry(Move.CORAL_BREAK,23),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,34),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,39),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,45),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,37),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                ),
                List.of(Label.URANIUM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 24, 49, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_ARID, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setLangFileName("Salmosault");
    }
}
