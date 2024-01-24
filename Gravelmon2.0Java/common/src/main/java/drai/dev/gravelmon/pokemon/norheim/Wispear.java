package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wispear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wispear() {
        super("Wispear",
                Type.GHOST,Type.FIRE,
                new Stats(30,
                        55,
                        21,
                        75,
                        60,
                        65),
                List.of(Ability.LEVITATE,Ability.PRANKSTER,Ability.INFILTRATOR), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wispear are spirits of young children who got lost after dark and never returned home. They may whisper in the ears of travelers, telling them which way to go and return to safety. They may play tricks however, making both people and Pokémon to walk astray into the unknown wilderness."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wispear");

    }


}
