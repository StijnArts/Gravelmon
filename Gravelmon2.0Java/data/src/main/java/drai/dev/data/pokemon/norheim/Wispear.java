package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wispear extends drai.dev.data.pokemon.Pokemon {
    public Wispear() {
        super("Wispear",
                Type.GHOST, Type.FIRE,
                new Stats(30,
                        55,
                        21,
                        75,
                        60,
                        65),
                List.of(Ability.LEVITATE,Ability.PRANKSTER,Ability.INFILTRATOR), Ability.INFILTRATOR,
                4, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wispear are spirits of young children who got lost after dark and never returned home. They may whisper in the ears of travelers, telling them which way to go and return to safety. They may play tricks however, making both people and Pokemon to walk astray into the unknown wilderness."),
                List.of(new EvolutionEntry("roomere", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,8),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,22),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.INCINERATE,29),
                        new MoveLearnSetEntry(Move.TORMENT,32),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,40),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,48),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,53),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,59),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wispear");

    }


}
