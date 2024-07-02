package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Amblush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amblush() {
        super("Amblush",
                Type.FIRE, Type.FAIRY,
                new Stats(75,
                        97,
                        67,
                        81,
                        67,
                        107),
                List.of(Ability.TANGLED_FEET,Ability.DANCER,Ability.LIMBER), Ability.LIMBER,
                8, 165,
                new Stats(0,0,0,0,0,1), 45,
                1.0,
                77, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("- Flame PounceSTAB Fire - Charm Fairy - Encore Normal 2 Happy SlapSTAB Fairy 4 Play Nice Normal 7 Quick Attack Normal 12 Sweet Kiss Fairy 15 Fake Out Normal 20 Warm EmbraceSTAB Fire 24 Swagger Normal 28 Dizzy Punch Normal 32 Draining KissSTAB Fairy 36 Teeter Dance Normal 40 Blaze KickSTAB Fire 42 Lovely Kiss Normal 48 Play RoughSTAB Fairy 55 Shadow Dance Ghost 65 Fiery DanceSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,2),
                        new MoveLearnSetEntry(Move.PLAY_NICE,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.SWEET_KISS,12),
                        new MoveLearnSetEntry(Move.FAKE_OUT,15),
                        new MoveLearnSetEntry(Move.WARMEMBRACE,20),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,28),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,32),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,36),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,40),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,48),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,55),
                        new MoveLearnSetEntry(Move.FIERY_DANCE,65),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amblush");

    }


}
