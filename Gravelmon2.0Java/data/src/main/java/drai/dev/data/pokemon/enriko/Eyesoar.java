package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eyesoar extends drai.dev.data.pokemon.Pokemon {
    public Eyesoar() {
        super("Eyesoar",
                Type.POISON, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their single eye grants them impressive night vision, but they lack depth perception. They gorge themselves on blood at night."),
                List.of(new EvolutionEntry("Pteroculus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(     new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,19),
                        new MoveLearnSetEntry(Move.POISON_JAB,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,33),
                        new MoveLearnSetEntry(Move.DEFOG,36),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.OUTRAGE,47)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(9)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Eyesoar");

    }


}
