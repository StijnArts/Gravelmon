package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ookawatt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ookawatt() {
        super("Ookawatt",
                Type.ELECTRIC, Type.WATER,
                new Stats(54,
                        86,
                        55,
                        75,
                        64,
                        104),
                List.of(Ability.SWIFT_SWIM,Ability.HUSTLE,Ability.SURGE_SURFER), Ability.SURGE_SURFER,
                10, 165,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                105, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Ookawatt's swimming capabilities are unmatched. It chases prey restlessly and finishes them off with electric attacks that are extremely dangerous underwater."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.CHARGE,4),
                        new MoveLearnSetEntry(Move.SPARK,9),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,18),
                        new MoveLearnSetEntry(Move.NUZZLE,20),
                        new MoveLearnSetEntry(Move.SWIFT,24),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,28),
                        new MoveLearnSetEntry(Move.TORPEDODASH,31),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,42),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,47),
                        new MoveLearnSetEntry(Move.LAST_RESORT,51),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,57),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,64),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, .67, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
