package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Snoosect extends drai.dev.data.pokemon.Pokemon {
    public Snoosect() {
        super("Snoosect",
                Type.BUG,
                new Stats(80,
                        45,
                        60,
                        45,
                        45,
                        25),
                List.of(Ability.SWARM,Ability.OBLIVIOUS,Ability.TINTED_LENS), Ability.TINTED_LENS,
                6, 165,
                new Stats(1,0,0,0,0,0), 90,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Snoosect spend most of their time asleep. Even when in a deep slumber, their antennae can sense incoming danger."),
                List.of(new EvolutionEntry("lumibuzz", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.REST,7),
                        new MoveLearnSetEntry(Move.SNORE,12),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,16),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,24),
                        new MoveLearnSetEntry(Move.AMNESIA,29),
                        new MoveLearnSetEntry(Move.SLACK_OFF,33),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,38),
                        new MoveLearnSetEntry(Move.YAWN,44),
                        new MoveLearnSetEntry(Move.ENDEAVOR,50),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SLASH,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm")                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snoosect");

    }


}
