package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Irise extends drai.dev.gravelmon.pokemon.Pokemon {
    public Irise() {
        super("Irise",
                Type.ICE, Type.FIRE,
                new Stats(45,
                        50,
                        45,
                        65,
                        55,
                        65),
                List.of(Ability.SOUNDPROOF,Ability.CONTRARY,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                7, 165,
                new Stats(0,0,0,1,0,1), 130,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These Pokemon are deaf but are excellent lip readers. Irise and their Trainers have a true bond because of the level of trust both must have in the heat of battle."),
                List.of(new EvolutionEntry("yeraze", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,1),
                        new MoveLearnSetEntry(Move.HAZE,5),
                        new MoveLearnSetEntry(Move.FIRE_FANG,8),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,14),
                        new MoveLearnSetEntry(Move.FROST_BREATH,17),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,23),
                        new MoveLearnSetEntry(Move.BARRIER,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.ICE_BEAM,41),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,51),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 26, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Irise");

    }


}
