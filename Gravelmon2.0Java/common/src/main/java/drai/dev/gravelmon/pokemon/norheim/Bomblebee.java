package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bomblebee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bomblebee() {
        super("Bomblebee",
                Type.STEEL, Type.BUG,
                new Stats(58,
                        78,
                        92,
                        78,
                        65,
                        46),
                List.of(Ability.SHIELD_DUST,Ability.AFTERMATH,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                6, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With a body that's both big and heavy in relation to its wing size, Bomblebee is forced to primarily use the power of magnetism in order to stay afloat. This bug Pokemon will not hestitate to blow any intruder up."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.POWDER,4),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,8),
                        new MoveLearnSetEntry(Move.SUPERSONIC,14),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,19),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,24),
                        new MoveLearnSetEntry(Move.METAL_SOUND,30),
                        new MoveLearnSetEntry(Move.HONEYBOMB,34),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,39),
                        new MoveLearnSetEntry(Move.LOCKON,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,55),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,60),
                        new MoveLearnSetEntry(Move.EXPLOSION,67),
                        new MoveLearnSetEntry(Move.EGG_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
