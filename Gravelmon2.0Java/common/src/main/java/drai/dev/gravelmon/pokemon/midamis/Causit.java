package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Causit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Causit() {
        super("Causit",
                Type.WATER,Type.FLYING,
                new Stats(40,
                        50,
                        40,
                        45,
                        45,
                        50),
                List.of(Ability.SWIFT_SWIM), Ability.OVERCOAT,
                5, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("Not the most mobile of Pokemon, Causit is just a nuisance both on water andon land. Its not the most useful Pokemon either, but when it evolves, this changes."),
                List.of(new EvolutionEntry("cassidite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,33),
                        new MoveLearnSetEntry(Move.GLARE,37),
                        new MoveLearnSetEntry(Move.CRUNCH,42),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

        setCanFly(true);

    }


}
