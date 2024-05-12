package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fountide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fountide() {
        super("Fountide",
                Type.WATER, Type.ROCK,
                new Stats(52,
                        70,
                        118,
                        90,
                        92,
                        22),
                List.of(Ability.SUCTION_CUPS,Ability.RAIN_DISH,Ability.DRIZZLE), Ability.DRIZZLE,
                11, 165,
                new Stats(0,0,1,0,1,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MINERAL),
                List.of("It absorbs the humidity in the air, which exits its body through its tail. After it has attached itself to a surface using its suction cup, it's impossible to remove it by force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_RING,1),
                        new MoveLearnSetEntry(Move.HARDEN,3),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.ROCK_THROW,13),
                        new MoveLearnSetEntry(Move.SOAK,15),
                        new MoveLearnSetEntry(Move.REFRESH,18),
                        new MoveLearnSetEntry(Move.MIST,22),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,25),
                        new MoveLearnSetEntry(Move.BARRIER,29),
                        new MoveLearnSetEntry(Move.BLOCK,33),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,38),
                        new MoveLearnSetEntry(Move.CALM_MIND,51),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,59),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.METEORSHOWER,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 33, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Fountide");

    }


}
