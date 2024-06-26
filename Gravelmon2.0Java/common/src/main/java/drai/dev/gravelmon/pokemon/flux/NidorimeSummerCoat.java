package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class NidorimeSummerCoat extends Pokemon {
    public NidorimeSummerCoat(String name, Aspect aspect) {
        super(name, aspect,"NidorimeSummerCoat",
                        Type.GROUND,
                        new Stats(56, 67,52,65,50,75),
                        List.of(Ability.SAND_VEIL, Ability.SAND_RUSH), Ability.ADAPTABILITY,
                        5, 90,
                        new Stats(1,0,0,0,0,1), 120,
                        0.5,
                        128, ExperienceGroup.SLOW,
                        70,
                        32, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                        List.of("From its usual arid habitat, it traverses long distances to temperate regions in order to find a more hospitable environment to evolve."),
                        List.of(new EvolutionEntry("nidoregus", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(), List.of(), "cobblemon:ice_stone")),
                        List.of(
                                new MoveLearnSetEntry(Move.ICY_WIND,1),
                                new MoveLearnSetEntry(Move.LEER,1),
                                new MoveLearnSetEntry(Move.TACKLE,1),
                                new MoveLearnSetEntry(Move.DUST_KICK,1),
                                new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                                new MoveLearnSetEntry(Move.MUD_SHOT,15),
                                new MoveLearnSetEntry(Move.SANDSTORM,22),
                                new MoveLearnSetEntry(Move.BULLDOZE,29),
                                new MoveLearnSetEntry(Move.DRILL_RUN,36),
                                new MoveLearnSetEntry(Move.QUASH,43),
                                new MoveLearnSetEntry(Move.SPIKES,50),
                                new MoveLearnSetEntry(Move.SWAGGER,57),
                                new MoveLearnSetEntry(Move.EARTH_POWER,64),
                                new MoveLearnSetEntry(Move.FISSURE,71),
                                new MoveLearnSetEntry(Move.COUNTER,"egg"),
                                new MoveLearnSetEntry(Move.DISABLE,"egg"),
                                new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                                new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                        ),
                        List.of(Label.FLUX),
                        0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 36, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        0.3, 0.3,
                List.of()
                );
        this.setPortraitXYZ(0,1.8,0);
        setLangFileName("Nidorime");
    }
}
