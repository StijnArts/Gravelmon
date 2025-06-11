package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crustgeist extends drai.dev.data.pokemon.Pokemon {
    public Crustgeist() {
        super("Crustgeist",
                Type.GHOST, Type.GROUND,
                new Stats(70,
                        135,
                        50,
                        60,
                        60,
                        90),
                List.of(Ability.HYPER_CUTTER,Ability.RAIN_DISH,Ability.SAND_RUSH), Ability.SAND_RUSH,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Crustgeist hide their bodies underground, only exposing their dish. They keep an old shell on their back to create an alluring aroma for their prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PINCH,7),
                        new MoveLearnSetEntry(Move.SAND_TOMB,11),
                        new MoveLearnSetEntry(Move.PROTECT,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,18),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.GRUDGE,25),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.CRABHAMMER,34),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,38),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,41),
                        new MoveLearnSetEntry(Move.SANDSHOT,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,50),
                        new MoveLearnSetEntry(Move.GUILLOTINE,58),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm"),
                        new MoveLearnSetEntry(Move.TEATIME,"tm"),
                        new MoveLearnSetEntry(Move.CLAMP,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
