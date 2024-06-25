package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Meekat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meekat() {
        super("Meekat",
                Type.ELECTRIC,
                new Stats(37,
                        43,
                        37,
                        53,
                        33,
                        87),
                List.of(Ability.ANTICIPATION,Ability.LIGHTNING_ROD), Ability.ELECTRIC_SURGE,
                7, 0,
                new Stats(0,0,0,0,0,1), 220,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Theorized to have migrated from a faraway region, Meekats will usually keep the tallest of the mob outside the den for lookout. This Pokémon produces weak electric currents, but when many of them are together they can deliver a big shock."),
                List.of(new EvolutionEntry("kilokatta", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,10),
                        new MoveLearnSetEntry(Move.NUZZLE,14),
                        new MoveLearnSetEntry(Move.SWIFT,19),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,24),
                        new MoveLearnSetEntry(Move.DETECT,28),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,30),
                        new MoveLearnSetEntry(Move.TEAMUP,32),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,40),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,45),
                        new MoveLearnSetEntry(Move.SANDSHOT,49),
                        new MoveLearnSetEntry(Move.THUNDER,52),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.ASSIST,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,"tm"),
                        new MoveLearnSetEntry(Move.ZING_ZAP,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meekat");

    }


}
