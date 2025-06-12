package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Yellifish extends drai.dev.data.pokemon.Pokemon {
    public Yellifish() {
        super("Yellifish",
                Type.GHOST, Type.PSYCHIC,
                new Stats(65,
                        30,
                        53,
                        90,
                        90,
                        60),
                List.of(Ability.CLEAR_BODY), Ability.WATER_ABSORB,
                7, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("phantocean", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.BARRIER,7),
                        new MoveLearnSetEntry(Move.AQUA_RING,14),
                        new MoveLearnSetEntry(Move.CONFUSION,18),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,22),
                        new MoveLearnSetEntry(Move.PSYWAVE,26),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,37),
                        new MoveLearnSetEntry(Move.SCREECH,40),
                        new MoveLearnSetEntry(Move.PSYSHOCK,44),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Yellifish");

    }


}
