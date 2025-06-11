package drai.dev.data.pokemon.qamor.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class QamoranKoffing extends drai.dev.data.pokemon.Pokemon {
    public QamoranKoffing(String name, Aspect aspect) {
        super(name, aspect, "Koffing",
                Type.POISON, Type.FIRE,
                new Stats(40,
                        35,
                        55,
                        80,
                        95,
                        35),
                List.of(Ability.LEVITATE), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When introduced to Qamor Koffing migrated to deep ocean trenches were they now feast off of hydrothermal vents."),
                List.of(new EvolutionEntry("QamoranWeezing", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.GLARE,"tm") ,
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SMOG,5),
                        new MoveLearnSetEntry(Move.EMBER,10),
                        new MoveLearnSetEntry(Move.POISON_FANG,15),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,20),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,25),
                        new MoveLearnSetEntry(Move.INCINERATE,30),
                        new MoveLearnSetEntry(Move.VENOSHOCK,35),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,45),
                        new MoveLearnSetEntry(Move.TOXIC,50),
                        new MoveLearnSetEntry(Move.ENDEAVOR,55)
                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(9)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_MAGMA, SpawnPreset.UNDERWATER)
    .build(), List.of());
	
           setLangFileName("Koffing");
setCanBreathUnderwater(true);
setCanSwim(true);

    }


}
