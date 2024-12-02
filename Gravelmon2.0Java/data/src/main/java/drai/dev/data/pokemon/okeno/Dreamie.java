package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dreamie extends drai.dev.data.pokemon.Pokemon {
    public Dreamie() {
        super("Dreamie",
                Type.FAIRY, Type.GROUND,
                new Stats(56,
                        70,
                        92,
                        107,
                        70,
                        75),
                List.of(Ability.DREAMER), Ability.MAGIC_BOUNCE,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("This Pokemon moves as if it is leaping through the air, leading herds of Dormie. It also lulls people into sleep with the trail of magic dust it leaves behind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOLLOW_ME,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,4),
                        new MoveLearnSetEntry(Move.SAND_TOMB,8),
                        new MoveLearnSetEntry(Move.PIXIEDUST,11),
                        new MoveLearnSetEntry(Move.SWIFT,15),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,18),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,24),
                        new MoveLearnSetEntry(Move.BOUNCE,28),
                        new MoveLearnSetEntry(Move.SANDSHOT,33),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,37),
                        new MoveLearnSetEntry(Move.STARSTREAM,41),
                        new MoveLearnSetEntry(Move.DUSTTORNADO,46),
                        new MoveLearnSetEntry(Move.MOONBLAST,51),
                        new MoveLearnSetEntry(Move.WISH,58),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dreamie");

    }


}
