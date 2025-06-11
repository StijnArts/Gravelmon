package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Swolphin extends Pokemon {
    public Swolphin() {
        super("Swolphin",
                Type.WATER,
                new Stats(60,65,50,45,50,55),
                List.of(Ability.TORRENT), Ability.GUTS,
                4, 52,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("norspear", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.WATER_GUN, 7),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 10),
                        new MoveLearnSetEntry(Move.HORN_ATTACK, 12),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL, 15),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 17),
                        new MoveLearnSetEntry(Move.FURY_CUTTER, 22),
                        new MoveLearnSetEntry(Move.ICE_SHARD, 25),
                        new MoveLearnSetEntry(Move.HAZE, 29),
                        new MoveLearnSetEntry(Move.AQUA_JET, 32),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 36),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 39),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 43),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "egg"),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "egg"),
                        new MoveLearnSetEntry(Move.BULK_UP, "egg"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR, "egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.SWAGGER, "egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
