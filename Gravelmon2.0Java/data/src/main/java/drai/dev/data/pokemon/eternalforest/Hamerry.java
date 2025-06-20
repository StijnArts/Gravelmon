package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hamerry extends Pokemon {
    public Hamerry() {
        super("Hamerry",
                Type.GRASS, Type.FAIRY,
                new Stats(60,
                        50,
                        40,
                        25,
                        45,
                        80),
                List.of(Ability.HARVEST, Ability.PICKUP), Ability.CHEEK_POUCH,
                3, 50,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of("Hamerry is a very popular Pokemon among children. Its cheeks give off a sweet smell, and give it a very friendly look."),
                List.of(new EvolutionEntry("hamysos", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.MINIMIZE, 6),
                        new MoveLearnSetEntry(Move.BULLET_SEED, 11),
                        new MoveLearnSetEntry(Move.COVET, 16),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT, 21),
                        new MoveLearnSetEntry(Move.CUTENESS, 26),
                        new MoveLearnSetEntry(Move.CAPTIVATE, 31),
                        new MoveLearnSetEntry(Move.FLING, 36),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, 41),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 46),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, 56),
                        new MoveLearnSetEntry(Move.CHARM, 66),
                        new MoveLearnSetEntry(Move.BEWITCHEDTACKLE, 71),
                        new MoveLearnSetEntry(Move.STOCKPILE, 76),
                        new MoveLearnSetEntry(Move.SPIT_UP, 76),
                        new MoveLearnSetEntry(Move.SWALLOW, 76),
                        new MoveLearnSetEntry(Move.SEED_BOMB, 81),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 86),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 91),
                        new MoveLearnSetEntry(Move.ANGELICSTRIKE, 100),

                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.QUASH, "tutor"),

                        new MoveLearnSetEntry(Move.BIOSHOCK, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.BARRAGE, "egg"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP, "egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "egg"),
                        new MoveLearnSetEntry(Move.HOLD_HANDS, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, "egg"),
                        new MoveLearnSetEntry(Move.ENCORE, "egg"),
                        new MoveLearnSetEntry(Move.FLATTER, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_BERRY_BUSH)
    .build(), List.of());
	
    }
}
