package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sarcospike extends drai.dev.data.pokemon.Pokemon {
    public Sarcospike() {
        super("Sarcospike",
                Type.STEEL, Type.FIRE,
                new Stats(80,
                        97,
                        125,
                        80,
                        125,
                        38),
                List.of(Ability.FLASH_FIRE,Ability.CURSED_BODY), Ability.AFTERMATH,
                23, 1745,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                200, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Sarcospike stand in one place all day seemingly lifeless, but as soon as something comes close, they pierce it with their spikes and store it in their body to burn it alive. They let out a faint, sad laugh while burning their victim."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.EMBER,3),
                        new MoveLearnSetEntry(Move.SMOG,6),
                        new MoveLearnSetEntry(Move.BOLTIN,10),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,15),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,26),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,30),
                        new MoveLearnSetEntry(Move.BURN_UP,34),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,39),
                        new MoveLearnSetEntry(Move.FLAME_BURST,42),
                        new MoveLearnSetEntry(Move.IRON_TAIL,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,55)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Sarcospike");

    }


}
