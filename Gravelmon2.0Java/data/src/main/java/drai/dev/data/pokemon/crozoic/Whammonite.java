package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whammonite extends drai.dev.data.pokemon.Pokemon {
    public Whammonite(Stats stats) {
        super("Whammonite",
                Type.FIGHTING, Type.WATER,
                stats,
                List.of(Ability.SHELL_ARMOR,Ability.SUCTION_CUPS), Ability.ANGER_SHELL,
                10, 172,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Whammonite constantly spar to further toughen their prized, rock-hard shells. If it realizes it's losing, it will squirt ink at its opponent's eyes to turn the tables."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.OCTAZOOKA,1),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,1),
                        new MoveLearnSetEntry(Move.OCTOLOCK,1),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,1),
                        new MoveLearnSetEntry(Move.JET_PUNCH,1)
                ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Whammonite");

    }


}
