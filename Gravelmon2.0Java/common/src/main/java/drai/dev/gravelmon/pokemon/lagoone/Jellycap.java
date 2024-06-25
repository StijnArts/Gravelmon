package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Jellycap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellycap() {
        super("Jellycap",
                Type.POISON,
                new Stats(65,
                        32,
                        60,
                        48,
                        60,
                        25),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.UNAWARE,
                6, 82,
                new Stats(1,0,0,0,0,0), 225,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The bouncy jelly-like substance on its head is poisonous and protect its face, what looks like antennae poking out of its head are actually its eyes."),
                List.of(new EvolutionEntry("jellohat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,26),
                        new MoveLearnSetEntry(Move.SPORE,29),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,31),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.WRING_OUT,41),
                        new MoveLearnSetEntry(Move.COIL,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_TAIGA, Biome.IS_OLD_GROWTH_TAIGA, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellycap");

    }


}
