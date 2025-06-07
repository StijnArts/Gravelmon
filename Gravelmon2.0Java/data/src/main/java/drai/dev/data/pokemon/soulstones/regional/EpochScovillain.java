package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochScovillain extends drai.dev.data.pokemon.Pokemon {
    public EpochScovillain(String name, Aspect aspect) {
        super(name, aspect, "EpochScovillain",
                Type.POISON,Type.ELECTRIC,
                new Stats(65,
                        98,
                        85,
                        95,
                        58,
                        85),
                List.of(Ability.RIPEN,Ability.CHLOROPHYLL), Ability.CORROSION,
                9, 150,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Scovillain's heads work in tandem when hunting, with the lemon head paralyzing prey with shocks while the Lime head douses them in acid."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.STATICSHOCK,1),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,16),
                        new MoveLearnSetEntry(Move.POISON_JAB,31),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,13),
                        new MoveLearnSetEntry(Move.ARCINGBLOW,25),
                        new MoveLearnSetEntry(Move.ENERGYSURGE,44),
                        new MoveLearnSetEntry(Move.ZING_ZAP,34),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,40),
                        new MoveLearnSetEntry(Move.SPIT_UP,22),
                        new MoveLearnSetEntry(Move.NUZZLE,4),
                        new MoveLearnSetEntry(Move.STOCKPILE,22),
                        new MoveLearnSetEntry(Move.FLYTRAP,28),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.CONCOCTION,52),
                        new MoveLearnSetEntry(Move.POWER_WHIP,56),
                        new MoveLearnSetEntry(Move.GROWTH,10),
                        new MoveLearnSetEntry(Move.SWALLOW,22),
                        new MoveLearnSetEntry(Move.PEPPERBURST,37),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,48),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.POISONSPIT,1),
                        new MoveLearnSetEntry(Move.ALKALINEBOMB,7),
                        new MoveLearnSetEntry(Move.BOLT_STRIKE,60),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONCOCTION,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.CRUELWHIP,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
           setLangFileName("Scovillain");

    }


}
