package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Salpackin extends drai.dev.data.pokemon.Pokemon {
    public Salpackin(Stats stats) {
        super("Salpackin",
                Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Apart from using it as jet propulsion to provide movement, Salpackin in the Ammo Formation will continue to store water causing their tough bodies to stiffen via high turgor pressure. These pokemon always occur in swarms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SELFREPAIR,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.CONVERSION,1)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.OCEAN_MONUMENT)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Salpackin");

    }


}
