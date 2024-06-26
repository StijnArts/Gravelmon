package drai.dev.gravelmon.pokemon.insurgence.delta;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class DeltaCombee extends Pokemon {
    public DeltaCombee(String name, Aspect aspect) {
        super(name, aspect,"DeltaCombee",
                Type.STEEL, Type.FIRE,
                new Stats(30, 30, 42, 30, 42, 70),
                List.of(Ability.LEVITATE), Ability.SPEED_BOOST,
                3, 110,
                new Stats(0,0,0,0,0,1), 120,
                0,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by LunarDusk. The middle body hosts a reactor; it uses this to power up its Fire-type moves."),
                List.of(new EvolutionEntry("deltavespiquen", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "\"gender=female\""),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "21")))),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,13),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,29),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.GEN4,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 43, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Combee");
        this.setPortraitXYZ(0,1.8,0);
    }
}
