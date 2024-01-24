package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Vauxee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vauxee() {
        super("Vauxee",
                Type.GROUND,Type.ELECTRIC,
                new Stats(50,
                        40,
                        40,
                        45,
                        35,
                        55),
                List.of(Ability.CUTE_CHARM), Ability.SAND_RUSH,
                8, 165,
                new Stats(0,0,0,0,0,1), 0,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Cute and lazy Pokemon, who are very unaware of the power they posses. They often flurry around and scoot up sand, looking for treasure and such. Vauxee are very adventurous and love having fun."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,6),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.DIG,14),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,18),
                        new MoveLearnSetEntry(Move.SWIFT,23),
                        new MoveLearnSetEntry(Move.SAND_TOMB,27),
                        new MoveLearnSetEntry(Move.ATTRACT,32),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,35),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,40),
                        new MoveLearnSetEntry(Move.TICKLE,44),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vauxee");

    }


}
