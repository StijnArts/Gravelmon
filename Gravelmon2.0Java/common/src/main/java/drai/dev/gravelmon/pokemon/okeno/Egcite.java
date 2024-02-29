package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Egcite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Egcite() {
        super("Egcite",
                Type.NORMAL,
                new Stats(72,
                        30,
                        50,
                        40,
                        54,
                        72),
                List.of(Ability.QUICK_FEET,Ability.JUMPIN,Ability.HUGE_POWER), Ability.HUGE_POWER,
                8, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Children find them extremely cute, but Egcite are timid—if anyone approaches, they will run away immediately. People say if you were to able to look at the sun, you'd see this Pokemon."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Egcite");

    }


}
