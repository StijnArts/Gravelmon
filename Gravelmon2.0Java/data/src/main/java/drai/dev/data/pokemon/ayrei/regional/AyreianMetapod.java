package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianMetapod extends Pokemon {
    public AyreianMetapod(String name, Aspect aspect) {
        super(name, aspect,"AyreianMetapod",
                Type.BUG, Type.ELECTRIC,
                new Stats(78,40,55,30,55,25),
                List.of(Ability.SHED_SKIN), Ability.COMPOUND_EYES,
                7, 99,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is waiting for the moment to evolve. At this stage, it can only harden, so it remains motionless to avoid attack."),
                List.of(new EvolutionEntry("ayreianbutterfree", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 5),
                        new MoveLearnSetEntry(Move.ELECTROWEB, 8),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 13),
                        new MoveLearnSetEntry(Move.PROTECT, 17),

                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Metapod");
    }
}
