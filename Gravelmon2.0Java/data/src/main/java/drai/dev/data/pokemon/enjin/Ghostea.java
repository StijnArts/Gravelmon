package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ghostea extends drai.dev.data.pokemon.Pokemon {
    public Ghostea() {
        super("Ghostea",
                Type.GHOST,
                new Stats(20,
                        25,
                        25,
                        54,
                        44,
                        40),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                3, 0,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                42, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("sinistea", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,5),
                        new MoveLearnSetEntry(Move.ABSORB,11),
                        new MoveLearnSetEntry(Move.SPLASH,17),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,29),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,35),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,41),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,47),
                        new MoveLearnSetEntry(Move.MEMENTO,53),
                        new MoveLearnSetEntry(Move.CAFFEINESIP,59),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Ghostea");

    }


}
