package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Eveon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eveon() {
        super("Eveon",
                Type.NORMAL,
                new Stats(130,
                        60,
                        110,
                        95,
                        65,
                        65),
                List.of(Ability.SERENE_GRACE), Ability.NATURAL_CURE,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.0,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal - Tail Whip Normal - Helping Hand Normal 5 Sand Attack Ground 9 Heal Pulse Psychic 13 Quick AttackSTAB Normal 17 RoundSTAB Normal 20 Wish Normal 25 Attract Normal 29 Captivate Normal 33 Calm Mind Psychic 37 Hyper VoiceSTAB Normal 41 Last ResortSTAB Normal 45 Healing Wish Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.ROUND,17),
                        new MoveLearnSetEntry(Move.WISH,20),
                        new MoveLearnSetEntry(Move.ATTRACT,25),
                        new MoveLearnSetEntry(Move.CAPTIVATE,29),
                        new MoveLearnSetEntry(Move.CALM_MIND,33),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,41),
                        new MoveLearnSetEntry(Move.HEALING_WISH,45),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eveon");

    }


}
