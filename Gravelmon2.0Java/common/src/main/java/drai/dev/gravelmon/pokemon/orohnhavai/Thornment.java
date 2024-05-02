package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Thornment extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thornment() {
        super("Thornment",
                Type.GRASS,
                new Stats(60,
                        100,
                        65,
                        80,
                        70,
                        125),
                List.of(Ability.ADAPTABILITY), Ability.IRON_BARBS,
                12, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It conceals itself within foliage. Its thorny tail is used to wrap around any prey that comes into touch with it, hurting it and dragging it around until it loses consciousness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,9),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,17),
                        new MoveLearnSetEntry(Move.SLASH,21),
                        new MoveLearnSetEntry(Move.SEED_BOMB,25),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,29),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,33),
                        new MoveLearnSetEntry(Move.XSCISSOR,37),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,41),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 28, 45, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thornment");

    }


}
