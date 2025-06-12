package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Camelt extends drai.dev.data.pokemon.Pokemon {
    public Camelt() {
        super("Camelt",
                Type.FIRE,
                new Stats(50,
                        40,
                        75,
                        40,
                        60,
                        45),
                List.of(Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                14, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its hump is full of water, which is constantly boiling from its body heat. Contracting its hump allows it to erupt boiling water everywhere."),
                List.of(new EvolutionEntry("thermedary", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SINGE,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,7),
                        new MoveLearnSetEntry(Move.MUD_SHOT,12),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,17),
                        new MoveLearnSetEntry(Move.STOMP,22),
                        new MoveLearnSetEntry(Move.MAGNITUDE,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,35),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,38),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,44),
                        new MoveLearnSetEntry(Move.LIFE_DEW,52),
                        new MoveLearnSetEntry(Move.BURN_UP,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Camelt");

    }


}
