package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Candore extends drai.dev.data.pokemon.Pokemon {
    public Candore() {
        super("Candore",
                Type.ROCK, Type.FAIRY,
                new Stats(30,
                        50,
                        100,
                        20,
                        90,
                        20),
                List.of(Ability.WEAK_ARMOR,Ability.SWEET_VEIL,Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                10, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.0,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It loves to gnaw on rocks—it considers precious gems a sweet treat. To keep its body clean, it will wander into wave-battered sea caves and be smoothed down by erosion."),
                List.of(new EvolutionEntry("sucrostone", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.SWEET_DECAY,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,1)
                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Candore");

    }


}
