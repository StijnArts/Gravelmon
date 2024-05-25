package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranWeezing extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranWeezing(int dex) {
        super(dex, "Weezing",
                Type.POISON, Type.FIRE,
                new Stats(65,
                        65,
                        80,
                        100,
                        120,
                        60),
                List.of(Ability.LEVITATE), Ability.DRY_SKIN,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Weezing formed a symbiotic relationship with deep-sea worm Pokemon that help it filter toxins and hazards out of its bloodstream, as well as offering protection by weaponizing Weezing's toxic clouds in a more efficient manner."),
                List.of(),
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
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 9, 34, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Weezing");
        setCanFly(true);
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
