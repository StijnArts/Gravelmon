package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Piglitt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Piglitt() {
        super("Piglitt",
                Type.GROUND,
                new Stats(60,
                        60,
                        55,
                        35,
                        30,
                        40),
                List.of(Ability.SUNSCREEN,Ability.THICK_FAT,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They play in mud pits during hot days. By doing so, their skin becomes thicker and more resistant to attacks. Children love to chase Piglitt, because they get easily startled."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,6),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,12),
                        new MoveLearnSetEntry(Move.ROLLOUT,18),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.ROTOTILLER,28),
                        new MoveLearnSetEntry(Move.MUD_BOMB,31),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56),
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
           setLangFileName("Piglitt");

    }


}
