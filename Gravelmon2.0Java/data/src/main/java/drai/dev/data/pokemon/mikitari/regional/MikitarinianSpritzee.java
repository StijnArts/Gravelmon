package drai.dev.data.pokemon.mikitari.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MikitarinianSpritzee extends drai.dev.data.pokemon.Pokemon {
    public MikitarinianSpritzee(String name, Aspect aspect) {
        super(name, aspect, "MikitarinianSpritzee",
                Type.FAIRY,Type.DARK,
                new Stats(60,
                        23,
                        52,
                        78,
                        65,
                        63),
                List.of(Ability.VERSATILEBODY), Ability.NATURAL_CURE,
                2, 5,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("It emits a scent that confuses those who smell it. There are rumors that Spritzees leads confused victims to Traumatisse's lairs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,3),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,6),
                        new MoveLearnSetEntry(Move.SNARL,9),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,12),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,15),
                        new MoveLearnSetEntry(Move.ATTRACT,18),
                        new MoveLearnSetEntry(Move.FLAIL,21),
                        new MoveLearnSetEntry(Move.SINISTERTERRAIN,24),
                        new MoveLearnSetEntry(Move.PSYCHIC,27),
                        new MoveLearnSetEntry(Move.CHARM,30),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,33),
                        new MoveLearnSetEntry(Move.MOONBLAST,36),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,39),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SINISTERTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm")                        ),
                List.of(Label.MIKITARI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Spritzee");

    }


}
