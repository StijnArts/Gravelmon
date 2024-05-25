package drai.dev.gravelmon.pokemon.spion;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Doznore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Doznore() {
        super("Doznore",
                Type.BUG,
                new Stats(65,
                        20,
                        30,
                        56,
                        49,
                        20),
                List.of(Ability.INSOMNIA), Ability.INSOMNIA,
                5, 50,
                new Stats(1,0,0,0,0,0), 235,
                0.5,
                43, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They will bite people and Pokemon that are sleeping. This makes them either dream or have a nightmare."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,3),
                        new MoveLearnSetEntry(Move.POISON_GAS,6),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,11),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,16),
                        new MoveLearnSetEntry(Move.SLACK_OFF,18),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.DREAM_EATER,23),
                        new MoveLearnSetEntry(Move.HYPNOSIS,26),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,28),
                        new MoveLearnSetEntry(Move.MOONLIGHT,31),
                        new MoveLearnSetEntry(Move.SING,33),
                        new MoveLearnSetEntry(Move.MOONBLAST,36),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,38),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,41),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm")                        ),
                List.of(Label.SPION),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Doznore");

    }


}
