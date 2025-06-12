package drai.dev.data.pokemon.avalos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvalossianWeepinbell extends drai.dev.data.pokemon.Pokemon {
    public AvalossianWeepinbell(String name, Aspect aspect) {
        super(name, aspect, "Paras",
                Type.GRASS, Type.DARK,
                new Stats(55,
                        85,
                        60,
                        90,
                        55,
                        65),
                List.of(Ability.CORROSION), Ability.SCAVENGE,
                7, 0,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("victreebel Avalossian", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,16),
                        new MoveLearnSetEntry(Move.POWER_TRIP,19),
                        new MoveLearnSetEntry(Move.INGRAIN,22),
                        new MoveLearnSetEntry(Move.PAYBACK,26),
                        new MoveLearnSetEntry(Move.SPIKES,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,34),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,42),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,46),
                        new MoveLearnSetEntry(Move.SANDSTORM,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,54)
                ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 36, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Paras");

    }
}
