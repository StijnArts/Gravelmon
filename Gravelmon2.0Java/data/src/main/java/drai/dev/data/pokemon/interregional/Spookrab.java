package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Spookrab extends drai.dev.data.pokemon.Pokemon {
    public Spookrab() {
        super("Spookrab",
                Type.GHOST, Type.GROUND,
                new Stats(60,
                        100,
                        20,
                        30,
                        30,
                        60),
                List.of(Ability.HYPER_CUTTER,Ability.RUN_AWAY,Ability.SAND_RUSH), Ability.SAND_RUSH,
                5, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Spookrab are rarely ever seen in person as they haunt the beaches through the night. Their claws can mimic the sounds of screaming."),
                List.of(new EvolutionEntry("crustgeist", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PINCH,7),
                        new MoveLearnSetEntry(Move.SAND_TOMB,11),
                        new MoveLearnSetEntry(Move.PROTECT,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,18),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.GRUDGE,25),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.CRABHAMMER,32),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,35),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,38),
                        new MoveLearnSetEntry(Move.SANDSHOT,43),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,47),
                        new MoveLearnSetEntry(Move.GUILLOTINE,54),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
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
