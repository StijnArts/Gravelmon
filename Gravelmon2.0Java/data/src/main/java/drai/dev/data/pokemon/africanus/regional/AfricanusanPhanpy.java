package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanPhanpy extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanPhanpy(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanPhanpy",
                Type.GROUND,Type.ROCK,
                new Stats(90,
                        60,
                        60,
                        40,
                        40,
                        40),
                List.of(Ability.STURDY), null,
                5, 335,
                new Stats(1,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Las enormes orejas que tiene Phanpy le sirven para abanicarse. Cuando tiene calor, las usa para refrescarse. Ya desde pequeño es entrenado para que tenga mucha fuerza y la use en beneficio del ejército cartaginés."),
                List.of(new EvolutionEntry("donphan africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.DRILL_RUN,28),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,12),
                        new MoveLearnSetEntry(Move.ACCELEROCK,10),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,15),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,42),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,33),
                        new MoveLearnSetEntry(Move.LAST_RESORT,37),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FISSURE,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Phanpy");

    }


}
