package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tintap extends drai.dev.data.pokemon.Pokemon {
    public Tintap() {
        super("Tintap",
                Type.PSYCHIC,
                new Stats(75,
                        33,
                        53,
                        58,
                        60,
                        36),
                List.of(Ability.ILLUMINATE,Ability.TRACE,Ability.SYNCHRONIZE), Ability.SYNCHRONIZE,
                5, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These Pokemon's markings shine dimly in the darkness of caves. Different patterns have been documented already, although extremely rare."),
                List.of(new EvolutionEntry("taprint", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,7),
                        new MoveLearnSetEntry(Move.BIDE,10),
                        new MoveLearnSetEntry(Move.ASTONISH,13),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,28),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,32),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.GRAVITY,40),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,44),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.PSYCHIC,50),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,53),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tintap");

    }


}
