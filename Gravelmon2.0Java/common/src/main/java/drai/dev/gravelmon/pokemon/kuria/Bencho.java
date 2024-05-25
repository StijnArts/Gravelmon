package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bencho extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bencho() {
        super("Bencho",
                Type.WATER, Type.FIGHTING,
                new Stats(77,
                        116,
                        95,
                        68,
                        72,
                        92),
                List.of(Ability.BULLY,Ability.ILLINTENT), Ability.MOXIE,
                10, 131,
                new Stats(0,2,0,0,0,0), 45,
                1.0,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,6),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.AQUA_JET,14),
                        new MoveLearnSetEntry(Move.SLAM,19),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,29),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,33),
                        new MoveLearnSetEntry(Move.SWAGGER,37),
                        new MoveLearnSetEntry(Move.SUBMISSION,41),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,45),
                        new MoveLearnSetEntry(Move.SUPERPOWER,50),
                        new MoveLearnSetEntry(Move.TITLEMATCH,55),
                        new MoveLearnSetEntry(Move.REVERSAL,61),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,67)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 46, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Bencho");

    }


}
