package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kraklam extends drai.dev.data.pokemon.Pokemon {
    public Kraklam() {
        super("Kraklam",
                Type.WATER,
                new Stats(64,
                        53,
                        83,
                        35,
                        70,
                        20),
                List.of(Ability.SHELL_ARMOR,Ability.POISON_POINT,Ability.STORM_DRAIN), Ability.STORM_DRAIN,
                5, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MONSTER),
                List.of("Due to this invasive species, Shellder have declined on the islands. They seem to also have a taste for Slowpoke tails. Kraklam hide in the reef or near shores, waiting for prey. In a blink of an eye, their tentacle-like tongues grasp their prey and attack with their horn, releasing a paralyzing toxin."),
                List.of(new EvolutionEntry("krakshen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.WRING_OUT.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.CLAMP,16),
                        new MoveLearnSetEntry(Move.TICKLE,20),
                        new MoveLearnSetEntry(Move.BOMBSHELL,26),
                        new MoveLearnSetEntry(Move.TAUNT,30),
                        new MoveLearnSetEntry(Move.FLAIL,34),
                        new MoveLearnSetEntry(Move.ENSNARE,40),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,43),
                        new MoveLearnSetEntry(Move.WRING_OUT,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,50),
                        new MoveLearnSetEntry(Move.POWER_WHIP,56),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
