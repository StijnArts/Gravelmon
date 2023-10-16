package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gilla extends Pokemon {
    public Gilla() {
        super("Gilla",
                Type.POISON,
                new Stats(60, 65, 70, 45, 45, 30),
                List.of(Ability.HUSTLE, Ability.CONDITIONING), Ability.ROUGH_SKIN,
                6, 91,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                62, List.of(EggGroup.MONSTER),
                List.of("From the moment it hatches, Gilla must fend for itself. It hunts on its own, even in its infancy, using poison glands filled with toxic venom."),
                List.of(new EvolutionEntry("hornizard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POISON_STING,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,17),
                        new MoveLearnSetEntry(Move.MUD_BOMB,20),
                        new MoveLearnSetEntry(Move.POISON_FANG,23),
                        new MoveLearnSetEntry(Move.DIG,27),
                        new MoveLearnSetEntry(Move.CHARM,30),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,33),
                        new MoveLearnSetEntry(Move.BRACE,37),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.TOXIC,43),
                        new MoveLearnSetEntry(Move.VENOSHOCK,47),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.CURSE,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,57),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 28, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
