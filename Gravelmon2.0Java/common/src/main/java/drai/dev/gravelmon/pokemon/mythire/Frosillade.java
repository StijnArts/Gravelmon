package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Frosillade extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frosillade() {
        super("Frosillade",
                Type.ICE, Type.STEEL,
                new Stats(70,
                        85,
                        130,
                        65,
                        85,
                        75),
                List.of(Ability.BOMBARDIER,Ability.BATTLE_ARMOR,Ability.AFTERMATH), Ability.AFTERMATH,
                13, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                179, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It launches snowballs that are loaded with small chunks of metal, which bolsters the strength of the impact. Only other Frosillade can hope to compete in their snowball fights."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.BOLT_IN,1),
                        new MoveLearnSetEntry(Move.ICY_CHARGE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.COURT_CHANGE,1),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,1),
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.SNOWGRENADE,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REBOUNDSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frosillade");

    }


}
