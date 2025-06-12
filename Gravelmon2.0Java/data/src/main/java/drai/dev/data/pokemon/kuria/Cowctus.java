package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cowctus extends drai.dev.data.pokemon.Pokemon {
    public Cowctus() {
        super("Cowctus",
                Type.GRASS, Type.STEEL,
                new Stats(80,
                        105,
                        105,
                        40,
                        100,
                        70),
                List.of(Ability.IRON_BARBS,Ability.SAP_SIPPER), Ability.DESERTBODY,
                13, 1011,
                new Stats(0,0,2,0,0,0), 90,
                0.875,
                176, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Cowctus stores large amounts of liquid inside its body so it can last a very long time in the hot desert. Drinking this liquid will cause anyone else to hallucinate."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,20),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.CURSE,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,45),
                        new MoveLearnSetEntry(Move.EXPLOSION,50)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cowctus");

    }


}
