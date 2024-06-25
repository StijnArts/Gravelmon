package drai.dev.gravelmon.pokemon.lagoone.regional;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class LagoonanSableye extends drai.dev.gravelmon.pokemon.Pokemon {
    public LagoonanSableye(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Sableye",
                Type.DARK, Type.STEEL,
                new Stats(50,
                        75,
                        95,
                        65,
                        55,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 600,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Its claws have turned into solid gold after touching cursed treasure. Even at the risk of turning itself into a statue, this greedy Pokémon will not stop eating gold."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.SUPERPOWER,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.PURSUIT,10),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,16),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,23),
                        new MoveLearnSetEntry(Move.METAL_CLAW,25),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,28),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,33),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,38),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,43),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,49),
                        new MoveLearnSetEntry(Move.IRON_TAIL,55),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,61)               ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 13, 37, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.MINESHAFT),
                0.28, 0.3,
                List.of());
           setLangFileName("Sableye");

    }


}
