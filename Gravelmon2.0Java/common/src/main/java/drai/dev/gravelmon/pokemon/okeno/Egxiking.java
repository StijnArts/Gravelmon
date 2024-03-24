package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Egxiking extends drai.dev.gravelmon.pokemon.Pokemon {
    public Egxiking() {
        super("Egxiking",
                Type.NORMAL,Type.FIRE,
                new Stats(111,
                        50,
                        90,
                        90,
                        105,
                        64),
                List.of(Ability.FIERYSPIRIT,Ability.JUMPIN,Ability.HUGE_POWER), Ability.HUGE_POWER,
                15, 165,
                new Stats(2,0,0,0,1,0), 60,
                0.5,
                230, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("This Pokemon rules over Egcite and Egxel. When approaching its burrow, you may feel the temperature become slightly warmer. It tries to create the perfect environment for its eggs to hatch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WARMEMBRACE,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,5),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.ENCORE,12),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,14),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,16),
                        new MoveLearnSetEntry(Move.REFRESH,20),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,22),
                        new MoveLearnSetEntry(Move.EGG_BOMB,24),
                        new MoveLearnSetEntry(Move.BOUNCE,29),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,32),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.SUPERPOWER,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,58),
                        new MoveLearnSetEntry(Move.OVERHEAT,65),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"tm"),
                        new MoveLearnSetEntry(Move.WARMEMBRACE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 39, 56, .03, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Egxiking");

    }


}
