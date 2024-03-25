package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Germite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Germite() {
        super("Germite",
                Type.POISON,
                new Stats(60,
                        20,
                        50,
                        85,
                        60,
                        75),
                List.of(Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                4, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Germite are believed to be a particular type of germ that eventually evolved into a pokemon. They can fire off the growths on their body, coating whatever they hit in gooey slime that causes mild sickness if touched."),
                List.of(new EvolutionEntry("gastropox", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.INFESTATION,5),
                        new MoveLearnSetEntry(Move.SLUDGE,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,10),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,14),
                        new MoveLearnSetEntry(Move.TOXIC,20),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,33),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,38),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,45),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,47)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 25, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Germite");

    }


}
