package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sputya extends Pokemon {
    public Sputya() {
        super("Sputya",
                Type.FLYING, Type.PSYCHIC,
                new Stats(44,
                        36,
                        69,
                        60,
                        50,
                        41),
                List.of(Ability.SATELLITE, Ability.SOLAR_POWER), Ability.STEELWORKER,
                9, 5,
                new Stats(0,0,1,0,0,0), 200,
                -1,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It was created to assist in space exploration. Instead of rocket fuel, it converts sunlight into psychic energy for propulsion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,7),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,11),
                        new MoveLearnSetEntry(Move.ACROBATICS,15),
                        new MoveLearnSetEntry(Move.MORNING_SUN,19),
                        new MoveLearnSetEntry(Move.PSYBEAM,23),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,27),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,31),
                        new MoveLearnSetEntry(Move.LOCKON,39),
                        new MoveLearnSetEntry(Move.FLY,43),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,47),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,51),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,55)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SKY)
    .aboveY(200)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
