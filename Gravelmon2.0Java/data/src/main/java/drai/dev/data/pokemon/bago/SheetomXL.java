package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class SheetomXL extends drai.dev.data.pokemon.Pokemon {
    public SheetomXL() {
        super("SheetomXL",
                Type.GHOST,
                new Stats(79,
                        42,
                        68,
                        116,
                        75,
                        68),
                List.of(), null,
                UnitConverter.feetToMeters(5, 9), 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Sheetom XL");

    }


}
