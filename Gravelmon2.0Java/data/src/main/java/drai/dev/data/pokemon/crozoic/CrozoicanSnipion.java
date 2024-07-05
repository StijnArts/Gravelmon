package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class CrozoicanSnipion extends drai.dev.data.pokemon.Pokemon {
    public CrozoicanSnipion(String name, Aspect aspect) {
        super(name, aspect, "Snipion",
                Type.WATER, Type.STEEL,
                new Stats(50,
                        80,
                        75,
                        40,
                        55,
                        45),
                List.of(Ability.HYPER_CUTTER), Ability.STORM_DRAIN,
                9, 165,
                new Stats(0,1,0,0,0,0), 140,
                0.875,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("After hiding itself in mud or seaweed, it remains perfectly still, waiting for something to swim close. Then, it grabs its prey and repeatedly jabs it with its sharp tail."),
                List.of(new EvolutionEntry("chainscraw crozoican", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.GUILLOTINE,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.XSCISSOR,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,1),
                        new MoveLearnSetEntry(Move.PINCH,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1)
                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 8, 29, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
            setCanSwim(true);
            setCanBreathUnderwater(true);
            setAvoidsLand(true);
        setLangFileName("Snipion");
    }


}
