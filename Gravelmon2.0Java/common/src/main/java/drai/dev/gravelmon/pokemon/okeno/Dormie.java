package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Dormie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dormie() {
        super("Dormie",
                Type.FAIRY, Type.GROUND,
                new Stats(33,
                        36,
                        66,
                        70,
                        50,
                        37),
                List.of(Ability.DREAMER), Ability.MAGIC_BOUNCE,
                5, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Sand or dust that comes in contact with Dormie gain wondrous proprieties known for making people fall asleep. Doctors recommend it for treating insomnia."),
                List.of(new EvolutionEntry("dreamie", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,4),
                        new MoveLearnSetEntry(Move.SAND_TOMB,8),
                        new MoveLearnSetEntry(Move.PIXIEDUST,11),
                        new MoveLearnSetEntry(Move.SWIFT,15),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,18),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,23),
                        new MoveLearnSetEntry(Move.BOUNCE,26),
                        new MoveLearnSetEntry(Move.SANDSHOT,30),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,34),
                        new MoveLearnSetEntry(Move.STARSTREAM,39),
                        new MoveLearnSetEntry(Move.DUSTTORNADO,44),
                        new MoveLearnSetEntry(Move.MOONBLAST,48),
                        new MoveLearnSetEntry(Move.WISH,51),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dormie");

    }


}
