package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Rattletack extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rattletack() {
        super("Rattletack",
                Type.POISON,
                new Stats(55,
                        70,
                        70,
                        70,
                        70,
                        55),
                List.of(Ability.SHED_SKIN,Ability.UNNERVE,Ability.SAND_VEIL), Ability.SAND_VEIL,
                11, 165,
                new Stats(0,0,1,1,0,0), 120,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("It shakes its rattle tail to warn predators that its poisonous and dangerous. Its rattle grows bigger, harder and louder as it sheds, it can eventually become as hard as a diamond."),
                List.of(new EvolutionEntry("najaconda", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42"))),
                        new EvolutionEntry("diamamba", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))

                ),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,7),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.GLARE,14),
                        new MoveLearnSetEntry(Move.POISON_TAIL,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,28),
                        new MoveLearnSetEntry(Move.POISON_FANG,31),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,38),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.COIL,49),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,57)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 27, 44, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rattletack");

    }


}
