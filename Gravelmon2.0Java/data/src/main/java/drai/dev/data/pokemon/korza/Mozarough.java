package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mozarough extends drai.dev.data.pokemon.Pokemon {
    public Mozarough() {
        super("Mozarough",
                Type.ROCK,
                new Stats(70,
                        100,
                        120,
                        60,
                        90,
                        60),
                List.of(Ability.STURDY), Ability.ROUGH_SKIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                100, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Because of Mozarough's unique mineral content, precious rock collectors travel from across the globe to find and admire them. A weak magnetic field envelops it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,10),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.MAGNITUDE,15),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,20),
                        new MoveLearnSetEntry(Move.PROTECT,25),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,32),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,40),
                        new MoveLearnSetEntry(Move.ENDEAVOR,45),
                        new MoveLearnSetEntry(Move.BLOCK,50),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,60),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mozarough");

    }


}
