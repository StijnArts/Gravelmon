package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Burnmigi extends drai.dev.data.pokemon.Pokemon {
    public Burnmigi(Stats stats) {
        super("Burnmigi",
                Type.POISON, Type.FIRE,
                stats,
                List.of(Ability.ILLUSION), Ability.CONTAMINATE,
                13, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Burnmigi boils and contaminates drinking water, usually in wells. Half its body is drenched in filthy poison. On occasion it may shift its form into something else."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.ENDEAVOR,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.FIRE_LASH,10),
                        new MoveLearnSetEntry(Move.POISON_FANG,15),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,20),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,25),
                        new MoveLearnSetEntry(Move.INCINERATE,30),
                        new MoveLearnSetEntry(Move.VENOSHOCK,37),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,44),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,51),
                        new MoveLearnSetEntry(Move.TOXIC,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Burnmigi");

    }


}
