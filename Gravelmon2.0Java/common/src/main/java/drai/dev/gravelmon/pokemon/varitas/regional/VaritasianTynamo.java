package drai.dev.gravelmon.pokemon.varitas.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class VaritasianTynamo extends drai.dev.gravelmon.pokemon.Pokemon {
    public VaritasianTynamo(String name, Aspect aspect) {
        super(name, aspect,"Tynamo",
                Type.GROUND, Type.WATER,
                new Stats(35,
                        55,
                        40,
                        45,
                        40,
                        60),
                List.of(Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                2, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                55, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Generations of living in muddy water neutralized its electrical charge. It instead began to focus more on swimming and burrowing through swampy terrain."),
                List.of(new EvolutionEntry("VaritasianEelektrik", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm")                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 5, 42, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Tynamo");
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
