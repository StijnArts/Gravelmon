package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Shrumin extends drai.dev.data.pokemon.Pokemon {
    public Shrumin() {
        super("Shrumin",
                Type.FAIRY,
                new Stats(105,
                        30,
                        60,
                        85,
                        90,
                        75),
                List.of(Ability.ADAPTABILITY), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Shrumin are elusive and whimsical creatures. They hide deep within magical forests. They may occasionly camouflage themselves with leaves."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,16),
                        new MoveLearnSetEntry(Move.MOONLIGHT,20),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,27),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,38),
                        new MoveLearnSetEntry(Move.SPORE,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.DREAM_EATER,56)),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shrumin");

    }


}
