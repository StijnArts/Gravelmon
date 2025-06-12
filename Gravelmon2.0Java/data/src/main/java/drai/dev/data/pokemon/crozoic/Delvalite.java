package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Delvalite extends drai.dev.data.pokemon.Pokemon {
    public Delvalite(Stats stats) {
        super("Delvalite",
                Type.ROCK,Type.BUG,
                stats,
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                11, 380,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("Forceful swings of its head are enough to mine through solid rock. If the cave ceiling should collapse, it will simply burrow its way out of the rubble, protected by its armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LURINGANTENNA,1),
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,1),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,1),
                        new MoveLearnSetEntry(Move.STONE_AXE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.LIGHTUP,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Delvalite");

    }


}
