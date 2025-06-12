package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Charitot extends drai.dev.data.pokemon.Pokemon {
    public Charitot() {
        super("Charitot",
                Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Charitot are unconditionally kind from the moment they hatch. Regardless of their trainer's intentions, it will support them. When it reaches evolution, it'll try to steer its trainer towards a more charitable path, usually with success."),
                List.of(new EvolutionEntry("Agapray", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,5),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,9),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,13),
                        new MoveLearnSetEntry(Move.ATTRACT,17),
                        new MoveLearnSetEntry(Move.SING,25),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,29),
                        new MoveLearnSetEntry(Move.FLING,33),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,37),
                        new MoveLearnSetEntry(Move.AFTER_YOU,41),
                        new MoveLearnSetEntry(Move.HEALING_WISH,45),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,53),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,57),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.HEART_STAMP,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Charitot");

    }


}
