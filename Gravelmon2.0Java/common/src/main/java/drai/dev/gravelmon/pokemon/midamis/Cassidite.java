package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cassidite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cassidite() {
        super("Cassidite",
                Type.WATER,Type.FLYING,
                new Stats(60,
                        70,
                        60,
                        60,
                        60,
                        65),
                List.of(Ability.SWIFT_SWIM), Ability.OVERCOAT,
                13, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("The family of Cassidite is the only bird-like Pokemon capable of battling underwater. Although it is a good battler on land, it prefers the water as its streamlined appearance gives it a good advantage against Pokemon such as Mantine."),
                List.of(new EvolutionEntry("cascassidine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.AIR_SLASH,24),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,30),
                        new MoveLearnSetEntry(Move.SLASH,35),
                        new MoveLearnSetEntry(Move.BRINE,41),
                        new MoveLearnSetEntry(Move.CRUNCH,46),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 18, 37, 1, List.of(
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
