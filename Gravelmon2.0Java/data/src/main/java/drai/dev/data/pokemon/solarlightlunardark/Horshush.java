package drai.dev.data.pokemon.solarlightlunardark;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Horshush extends drai.dev.data.pokemon.Pokemon {
    public Horshush() {
        super("Horshush",
                Type.GRASS,
                new Stats(100,
                        90,
                        70,
                        118,
                        60,
                        70),
                List.of(Ability.NATURAL_CURE,Ability.RUN_AWAY), Ability.REGENERATOR,
                22, 2650,
                new Stats(1,0,0,1,0,0), 60,
                0.0,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In the past, Horshush was the primary form of transportation in the Rikoto region. Since then, farmers raise them for their ability to rejuvenate tired soil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.ENCORE,24),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,40),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.UTURN,28),
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.HEALING_WISH,60),
                        new MoveLearnSetEntry(Move.LEAFAGE,4),
                        new MoveLearnSetEntry(Move.WISH,52),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,48),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,36),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,8),
                        new MoveLearnSetEntry(Move.SYNTHESIS,44),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,55),
                        new MoveLearnSetEntry(Move.TROP_KICK,32),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.LIFE_DEW,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_DARTS,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.DUSTY_DASH,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm")),
                List.of(Label.SOLARLIGHTLUNARDARK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Horshush");

    }


}
