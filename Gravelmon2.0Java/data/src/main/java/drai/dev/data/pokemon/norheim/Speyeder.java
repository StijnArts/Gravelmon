package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Speyeder extends drai.dev.data.pokemon.Pokemon {
    public Speyeder() {
        super("Speyeder",
                Type.BUG, Type.GHOST,
                new Stats(55,
                        90,
                        35,
                        65,
                        70,
                        80),
                List.of(Ability.INTIMIDATE,Ability.HARVEST,Ability.FRISK), Ability.FRISK,
                6, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.ASTONISH,8),
                        new MoveLearnSetEntry(Move.INFESTATION,11),
                        new MoveLearnSetEntry(Move.SCARY_FACE,13),
                        new MoveLearnSetEntry(Move.BUG_BITE,19),
                        new MoveLearnSetEntry(Move.STICKY_WEB,25),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,31),
                        new MoveLearnSetEntry(Move.SPITE,34),
                        new MoveLearnSetEntry(Move.DIG,38),
                        new MoveLearnSetEntry(Move.ELECTROWEB,41),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,45),
                        new MoveLearnSetEntry(Move.SILK_TRAP,50),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,55),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.ROTOTILLER,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Speyeder");

    }


}
