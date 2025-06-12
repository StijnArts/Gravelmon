package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cocarid extends drai.dev.data.pokemon.Pokemon {
    public Cocarid() {
        super("Cocarid",
                Type.WATER,
                new Stats(78,
                        67,
                        67,
                        67,
                        67,
                        31),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Inside its body, another Zuupie grows. Its internal organs are replaced by its 'offspring', slowly turning it into a living cocoon. Its method of reproduction is unseen in any other Pokemon."),
                List.of(new EvolutionEntry("skelacian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(              new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.ABYSSAL_LURE,37),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46)          ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Cocarid");

    }


}
