package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kiell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kiell() {
        super("Kiell",
                Type.STEEL,Type.DRAGON,
                new Stats(50,
                        65,
                        50,
                        45,
                        40,
                        50),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                5, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("kiriliel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(       new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.SHARPEN,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,30),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,36),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,62),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,66)                   ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 1, 19, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kiell");

    }


}
