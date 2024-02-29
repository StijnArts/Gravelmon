package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Beanstork extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beanstork() {
        super("Beanstork",
                Type.GRASS,Type.FLYING,
                new Stats(65,
                        100,
                        50,
                        95,
                        75,
                        99),
                List.of(Ability.SKILL_LINK,Ability.SNIPER,Ability.BIG_PECKS), Ability.BIG_PECKS,
                8, 165,
                new Stats(0,0,0,0,0,1), 60,
                0.5,
                162, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Stores many seeds on its swollen-looking necks. When Pokemon approach it thinking it bears a red fruit on its neck, it will shoot the seeds to defend itself and get this prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.PECK,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,9),
                        new MoveLearnSetEntry(Move.SEEDSHOT,14),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,19),
                        new MoveLearnSetEntry(Move.BULLET_SEED,23),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.FLURRYPECK,30),
                        new MoveLearnSetEntry(Move.ROOST,33),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,36),
                        new MoveLearnSetEntry(Move.DRILL_PECK,40),
                        new MoveLearnSetEntry(Move.SQUALL,45),
                        new MoveLearnSetEntry(Move.SEED_BOMB,50),
                        new MoveLearnSetEntry(Move.SOAK,56),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,62),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WATERARROW,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beanstork");

    }


}
