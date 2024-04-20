package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lillama extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lillama() {
        super("Lillama",
                Type.NORMAL, Type.ICE,
                new Stats(51,
                        57,
                        46,
                        40,
                        50,
                        61),
                List.of(Ability.FUR_COAT), Ability.MOUNTAINEER,
                8, 165,
                new Stats(0,0,0,0,0,1), 235,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal 2 Growl Normal 5 Powder SnowSTAB Ice 7 Double Kick Fighting 11 Icy WindSTAB Ice 15 Cotton Spore Grass 19 Ice ShardSTAB Ice 23 StompSTAB Normal 27 Rock Slide Rock 32 AvalancheSTAB Ice 36 Cotton Guard Grass 41 Rock ClimbSTAB Normal 44 Bounce Flying 49 Sheer ColdSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,2),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,7),
                        new MoveLearnSetEntry(Move.ICY_WIND,11),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,15),
                        new MoveLearnSetEntry(Move.ICE_SHARD,19),
                        new MoveLearnSetEntry(Move.STOMP,23),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,27),
                        new MoveLearnSetEntry(Move.AVALANCHE,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,41),
                        new MoveLearnSetEntry(Move.BOUNCE,44),
                        new MoveLearnSetEntry(Move.SHEER_COLD,49),
                        new MoveLearnSetEntry(Move.JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MILK_DRINK,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lillama");

    }


}
