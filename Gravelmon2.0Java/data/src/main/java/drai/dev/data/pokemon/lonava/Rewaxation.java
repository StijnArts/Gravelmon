package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rewaxation extends drai.dev.data.pokemon.Pokemon {
    public Rewaxation() {
        super("Rewaxation",
                Type.FIRE,
                new Stats(85,
                        70,
                        70,
                        110,
                        105,
                        65),
                List.of(Ability.FLASH_FIRE), Ability.FLAME_BODY,
                16, 165,
                new Stats(0,0,0,2,0,0), 65,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("The smell of a Rewaxation is usually the first thing any tourist will experience when they first step into Lonava. They have a good-natured disposition, but aren't afraid to defend themselves should any mons attracted by their scent get a bit too close."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,9),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,12),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,15),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,18),
                        new MoveLearnSetEntry(Move.INCINERATE,21),
                        new MoveLearnSetEntry(Move.WILLOWISP,24),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,32),
                        new MoveLearnSetEntry(Move.FIERY_DANCE,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,48),
                        new MoveLearnSetEntry(Move.OVERHEAT,54)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Rewaxation");

    }


}
