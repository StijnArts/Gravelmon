package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Agapray extends drai.dev.gravelmon.pokemon.Pokemon {
    public Agapray() {
        super("Agapray",
                Type.FAIRY,
                new Stats(105,
                        50,
                        85,
                        70,
                        85,
                        60),
                List.of(Ability.HEALER), Ability.NATURAL_CURE,
                8, 165,
                new Stats(2,0,0,0,0,0), 140,
                0.0,
                390, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("This loving Pokémon is often found working in hospitals, assisting medics in the field, or running clinics out of caves or trees to help injured wild Pokémon. Their acts of kindness come without expectation, and many respect Agapray for this reason."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Agapray");

    }


}
