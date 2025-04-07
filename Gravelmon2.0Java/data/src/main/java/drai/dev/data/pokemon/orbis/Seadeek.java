package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Seadeek extends drai.dev.data.pokemon.Pokemon {
    public Seadeek() {
        super("Seadeek",
                Type.FLYING, Type.WATER,
                new Stats(60,
                        75,
                        50,
                        65,
                        60,
                        85),
                List.of(Ability.GALE_WINGS,Ability.TANGLED_FEET), Ability.WATER_ABSORB,
                8, 161,
                new Stats(0,1,0,0,0,1), 100,
                0.5,
                118, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They are often known to be annoying to tourists as they eat beach comers' food and steal their possessions. They have a loud screeching cry that they bellow across the shores. They always obey the orders of a Cappatross, and will bring all the food they acquire to their leader before eating it themselves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.SQUALL,15),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,24),
                        new MoveLearnSetEntry(Move.DRILL_PECK,27),
                        new MoveLearnSetEntry(Move.WATER_PULSE,30),
                        new MoveLearnSetEntry(Move.THIEF,33),
                        new MoveLearnSetEntry(Move.DEFOG,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,41),
                        new MoveLearnSetEntry(Move.ROOST,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,48)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Seadeek");

    }


}
