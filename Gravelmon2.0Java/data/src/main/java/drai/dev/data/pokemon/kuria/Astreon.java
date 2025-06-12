package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astreon extends drai.dev.data.pokemon.Pokemon {
    public Astreon() {
        super("Astreon",
                Type.COSMIC,
                new Stats(65,
                        65,
                        60,
                        130,
                        110,
                        95),
                List.of(Ability.SIGNALBOOST), Ability.WONDER_SKIN,
                9, 171,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                190, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Astreon are almost never paying attention. They daydream constantly of space and the stars, and will spend all night staring at the sky."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.GLARE, 6),
                        new MoveLearnSetEntry(Move.SWOOSH, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.BOUNCE, 15),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 18),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 20),
                        new MoveLearnSetEntry(Move.AIR_CANNON, 21),
                        new MoveLearnSetEntry(Move.CALM_MIND, 24),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),
                        new MoveLearnSetEntry(Move.TAILWIND, 32),
                        new MoveLearnSetEntry(Move.SILVER_WIND, 36),
                        new MoveLearnSetEntry(Move.DEFOG, 40),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, 42),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.ROOST, 51),
                        new MoveLearnSetEntry(Move.HURRICANE, 57),
                        new MoveLearnSetEntry(Move.RECOVER, 61),
                        new MoveLearnSetEntry(Move.GEYSERPULSE, 67),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.TICKLE, "egg"),
                        new MoveLearnSetEntry(Move.WISH, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.COVET, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "egg"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE, "egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg")                    ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Astreon");
        addAdditionalEvolution("eevee", new EvolutionEntry("astreon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));
    }


}
