package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Vortexol extends drai.dev.data.pokemon.Pokemon {
    public Vortexol() {
        super("Vortexol",
                Type.WATER,
                new Stats(60,
                        70,
                        65,
                        80,
                        125,
                        100),
                List.of(Ability.ADAPTABILITY), Ability.HYDRATION,
                11, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It propels at extreme speeds by rotating the blades on its tail. It creates whirlpools to trap its foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,5),
                        new MoveLearnSetEntry(Move.WATER_SPORT,9),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,13),
                        new MoveLearnSetEntry(Move.MIST,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.SCALD,25),
                        new MoveLearnSetEntry(Move.PSYSHOCK,29),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,33),
                        new MoveLearnSetEntry(Move.PSYCHIC,37),
                        new MoveLearnSetEntry(Move.CALM_MIND,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
