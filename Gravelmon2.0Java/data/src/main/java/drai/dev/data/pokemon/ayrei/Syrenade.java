package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Syrenade extends Pokemon {
    public Syrenade() {
        super("Syrenade",
                Type.POISON, Type.SOUND,
                new Stats(90,85,80,55,128,162),
                List.of(Ability.QUEENLY_MAJESTY), Ability.REGENERATOR,
                18, 1440,
                new Stats(0,0,0,0,0,3), 45,
                0.25,
                139, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.FIELD),
                List.of("Its beautiful voice allures sailors lost at sea. While they're distracted, Syrenade signals the other members of its colony to ransack their ships."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACID_ARMOR, 1),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA, 1),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.FLIP_TURN, 1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, 1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 9),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 12),
                        new MoveLearnSetEntry(Move.SLUDGE, 15),
                        new MoveLearnSetEntry(Move.UPROAR, 21),
                        new MoveLearnSetEntry(Move.MUDDY_WATER, 25),
                        new MoveLearnSetEntry(Move.ENCORE, 30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 44),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, 51),
                        new MoveLearnSetEntry(Move.BOOMBURST, 58),

                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.AMNESIA, "tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tutor"),
                        new MoveLearnSetEntry(Move.BRINE, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CHARM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DIVE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENCORE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLIP_TURN, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WATERFALL, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, "tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(55)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        this.setCanBreathUnderwater(true);
        this.setCanSwim(true);
        this.setAvoidsLand(true);
    }
}
