package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanSlowking extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanSlowking(String name, Aspect aspect) {
        super(name, aspect, "Slowking",
                Type.WATER,Type.DARK,
                new Stats(90,
                        100,
                        90,
                        45,
                        120,
                        110),
                List.of(Ability.DRY_SKIN), null,
                20, 795,
                new Stats(0,0,0,0,0,3), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Slowking es el resultado del reconocimiento por parte de los esclavistas a Slowbro, dándole una evolución más inteligente capaz de manejar a varios Slowking, quedándose por encima suya en la cadena de mando."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,28),
                        new MoveLearnSetEntry(Move.DARK_PULSE,40),
                        new MoveLearnSetEntry(Move.DISABLE,19),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.BITE,23),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,14),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,37),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,9),
                        new MoveLearnSetEntry(Move.SLOWKING,54),
                        new MoveLearnSetEntry(Move.PURSUIT,49),
                        new MoveLearnSetEntry(Move.SNARL,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.GROWL,5),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,26),
                        new MoveLearnSetEntry(Move.ASSURANCE,32),
                        new MoveLearnSetEntry(Move.SWAGGER,41)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slowking");

    }


}
