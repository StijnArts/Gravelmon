package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Explodent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Explodent() {
        super("Explodent",
                Type.FIRE, Type.STEEL,
                new Stats(96,
                        118,
                        105,
                        67,
                        84,
                        65),
                List.of(Ability.BLAZE), Ability.AFTERMATH,
                16, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its thick claws are as sharp as thick metal. It can fire blazing eruptions of heat from its mouth, hot enough to melt rock."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,10),
                        new MoveLearnSetEntry(Move.YAWN,14),
                        new MoveLearnSetEntry(Move.INCINERATE,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.SNORE,28),
                        new MoveLearnSetEntry(Move.METAL_CLAW,31),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,39),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,47),
                        new MoveLearnSetEntry(Move.BODY_PRESS,53),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_CRIMSON))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Explodent");

    }


}
