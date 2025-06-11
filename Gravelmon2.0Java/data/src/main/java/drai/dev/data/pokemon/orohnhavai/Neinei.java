package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Neinei extends drai.dev.data.pokemon.Pokemon {
    public Neinei() {
        super("Neinei",
                Type.FLYING, Type.WATER,
                new Stats(90,
                        50,
                        60,
                        95,
                        85,
                        60),
                List.of(Ability.FRIEND_GUARD,Ability.SIMPLE,Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                10, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("For nesting purposes, Neinei migrate from Orohn-Havai to Avoris in the fall. They return to Orohn-Havai in the spring after raising their hatchlings. Given their maternal nature, they may care for any lost hatchling."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.MIST,8),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.WING_ATTACK,16),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,23),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,28),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,41),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,46),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55),
                        new MoveLearnSetEntry(Move.ROOST,59),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setCanFly(true);

    }


}
