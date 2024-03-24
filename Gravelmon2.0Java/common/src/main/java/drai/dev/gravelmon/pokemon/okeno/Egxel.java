package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Egxel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Egxel() {
        super("Egxel",
                Type.NORMAL,
                new Stats(83,
                        40,
                        80,
                        70,
                        96,
                        93),
                List.of(Ability.QUICK_FEET,Ability.JUMPIN,Ability.HUGE_POWER), Ability.HUGE_POWER,
                9, 165,
                new Stats(1,0,0,0,0,1), 120,
                0.5,
                162, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Using their powerful feet, these Pokemon are capable of jumping over a whole two-story house! In a popular fairy tale, Egxel leapt over the sun to have its trainer's wish granted."),
                List.of(new EvolutionEntry("egxiking", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,5),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.ENCORE,12),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,16),
                        new MoveLearnSetEntry(Move.REFRESH,20),
                        new MoveLearnSetEntry(Move.EGG_BOMB,24),
                        new MoveLearnSetEntry(Move.BOUNCE,29),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"tm"),
                        new MoveLearnSetEntry(Move.WARMEMBRACE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 24, 41, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Egxel");

    }


}
