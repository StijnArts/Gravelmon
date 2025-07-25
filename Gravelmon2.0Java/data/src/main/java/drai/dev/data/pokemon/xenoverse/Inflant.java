package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Inflant extends Pokemon {
    public Inflant() {
        super("Inflant",
                Type.WATER,
                new Stats(50, 60, 65, 43, 52, 44),
                List.of(Ability.TORRENT), Ability.MOXIE,
                4, 80,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                52, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of("It floats because of its large ears. Really competitive, it always looks for an opponent to challenge in swimming."),
                List.of(new EvolutionEntry("floatusk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.BULK_UP,18),
                        new MoveLearnSetEntry(Move.STRENGTH,20),
                        new MoveLearnSetEntry(Move.SWAGGER,21),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.SUBMISSION,27),
                        new MoveLearnSetEntry(Move.SUPERPOWER,32),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,36),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"egg"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
    }
}
