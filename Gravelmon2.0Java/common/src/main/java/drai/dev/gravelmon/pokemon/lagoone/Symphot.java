package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Symphot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Symphot() {
        super("Symphot",
                Type.NORMAL, Type.FLYING,
                new Stats(79,
                        69,
                        77,
                        121,
                        71,
                        111),
                List.of(Ability.CACOPHONY), Ability.CACOPHONY,
                6, 22,
                new Stats(0,0,0,3,0,0), 30,
                0.5,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When alone, it sings beautiful melodies capable of calming down a beast. However when in flocks, the noise that comes out of them is unbearable."),
                List.of(),
                List.of(                new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,5),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.CHATTER,11),
                        new MoveLearnSetEntry(Move.SING,14),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,17),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,26),
                        new MoveLearnSetEntry(Move.ME_FIRST,31),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.TAUNT,39),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,43),
                        new MoveLearnSetEntry(Move.DEFOG,48),
                        new MoveLearnSetEntry(Move.HURRICANE,54)        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 41, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Symphot");

    }


}
