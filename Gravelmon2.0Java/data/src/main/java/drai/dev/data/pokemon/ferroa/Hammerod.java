package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hammerod extends drai.dev.data.pokemon.Pokemon {
    public Hammerod() {
        super("Hammerod",
                Type.STEEL, Type.DARK,
                new Stats(60,
                        70,
                        100,
                        60,
                        100,
                        110),
                List.of(Ability.HUSTLE,Ability.SHEER_FORCE,Ability.UNBURDEN), Ability.UNBURDEN,
                13, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It delights in showing off on busy roads, causing havoc. The side pods can separate from the main body and move on their own to scope out the surrounding territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,1),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,1),
                        new MoveLearnSetEntry(Move.SPIN_OUT,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,1),

                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Hammerod");

    }


}
