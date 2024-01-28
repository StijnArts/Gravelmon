package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Porklay extends drai.dev.gravelmon.pokemon.Pokemon {
    public Porklay() {
        super("Porklay",
                Type.GROUND,Type.FIGHTING,
                new Stats(80,
                        83,
                        85,
                        54,
                        54,
                        46),
                List.of(Ability.SUNSCREEN,Ability.THICK_FAT,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Knock BackSTAB Fighting - Tackle Normal - Mud-SlapSTAB Ground 6 Mud Sport Ground 12 Defense Curl Normal 18 Rollout Rock 24 Take Down Normal 29 Rototiller Ground 32 Mud BombSTAB Ground 38 Bulk Up Fighting 40 SubmissionSTAB Fighting 44 Body Slam Normal 52 EarthquakeSTAB Ground 60 Double-Edge Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,6),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,12),
                        new MoveLearnSetEntry(Move.ROLLOUT,18),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.ROTOTILLER,29),
                        new MoveLearnSetEntry(Move.MUD_BOMB,32),
                        new MoveLearnSetEntry(Move.BULK_UP,38),
                        new MoveLearnSetEntry(Move.SUBMISSION,40),
                        new MoveLearnSetEntry(Move.BODY_SLAM,44),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,60),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Porklay");

    }


}