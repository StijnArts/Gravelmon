package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianRoserade extends Pokemon {
    public AyreianRoserade(String name, Aspect aspect) {
        super(name, aspect,"AyreianRoserade",
                Type.STEEL, Type.POISON,
                new Stats(60,105,75,115,60,105),
                List.of(Ability.STEELY_SPIRIT, Ability.POISON_TOUCH), Ability.TECHNICIAN,
                3, 20,
                new Stats(0,0,0,0,2,0), 150,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.GRASS),
                List.of("The poison in its right hand is quick acting. The poison in its left hand is slow acting. Both are life threatening."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, 1),
                        new MoveLearnSetEntry(Move.POISON_STING, 1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 4),
                        new MoveLearnSetEntry(Move.BIDE, 8),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 12),
                        new MoveLearnSetEntry(Move.POISON_JAB, 20),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM, 24),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB, 28),
                        new MoveLearnSetEntry(Move.TOXIC, 34),
                        new MoveLearnSetEntry(Move.HEAL_ORDER, 38),
                        new MoveLearnSetEntry(Move.BARB_BARRAGE, 42),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 46),
                        new MoveLearnSetEntry(Move.CURSE, 50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 56),
                        new MoveLearnSetEntry(Move.DOUBLE_IRON_BASH, 62),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tutor"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "tutor"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "tutor"),

                        new MoveLearnSetEntry(Move.COTTON_SPORE, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, "egg"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "egg"),
                        new MoveLearnSetEntry(Move.LIFE_DEW, "egg")
                ),
                List.of(Label.GEN4,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Roserade");
    }
}
