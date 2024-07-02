package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Eameiru extends Pokemon {
    public Eameiru() {
        super( "Eameiru",
                Type.STEEL, Type.FLYING,
                new Stats(70	,
                        100	,
                        160	,
                        40	,
                        85	,
                        100),
                List.of(Ability.STURDY), Ability.KEEN_EYE,
                24, 1655,
                new Stats(0,0,3,0,1,1), 20,
                0.5,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.QUICK_TURN,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.METAL_CLAW,9),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,12),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,17),
                        new MoveLearnSetEntry(Move.FEINT,20),
                        new MoveLearnSetEntry(Move.SWIFT,23),
                        new MoveLearnSetEntry(Move.SPIKES,28),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.STEEL_WING,34),
                        new MoveLearnSetEntry(Move.DRILL_RUN,39),
                        new MoveLearnSetEntry(Move.METAL_SOUND,42),
                        new MoveLearnSetEntry(Move.JET_STRIKE,45),
                        new MoveLearnSetEntry(Move.HAIRPIN_TURN,50),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,53),
                        new MoveLearnSetEntry(Move.METAL_BLAST,56),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.GLORY_WING,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.GUST,"tutor"),
                        new MoveLearnSetEntry(Move.SCREECH,"tutor"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tutor"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"tutor"),
                        new MoveLearnSetEntry(Move.ROCKET_DRIVE,"tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 58, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY, Biome.IS_SKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
        addAdditionalEvolution("skarmory", new EvolutionEntry("eameiru", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160"))));
        addAdditionalItemDrop("skarmory", "gravelmon:silver_scale", null);
    }
}
