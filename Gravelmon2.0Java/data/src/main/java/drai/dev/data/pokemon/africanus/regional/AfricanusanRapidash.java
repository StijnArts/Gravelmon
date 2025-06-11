package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanRapidash extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanRapidash(String name, Aspect aspect) {
        super(name, aspect, "Rapidash",
                Type.FLYING,Type.STEEL,
                new Stats(85,
                        110,
                        70,
                        105,
                        100,
                        85),
                List.of(Ability.RUN_AWAY,Ability.FLASH_FIRE), null,
                17, 950,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Cuando los Ponyta de Occidentis ganan fuerza en las piernas para saltar y sus pequeñas alas pueden planear, evoluciona en Rapidash, siendo capaces de volar a sitios muy lejanos. La primera de especie de Rapidash Occidentis en ser capturada fue Bucéfalo,el Rapidash de Alejandro Magno."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STEEL_WING,25),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.STOMP,17),
                        new MoveLearnSetEntry(Move.BOUNCE,45),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.PLUCK,21),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,41),
                        new MoveLearnSetEntry(Move.METAL_CLAW,15),
                        new MoveLearnSetEntry(Move.IRON_TAIL,47),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.MAGNO,42),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.AEROBLAST,33),
                        new MoveLearnSetEntry(Move.ACROBATICS,35),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,34),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,49)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(49)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rapidash");
           setCanFly(true);

    }


}
