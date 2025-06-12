package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochVanillite extends drai.dev.data.pokemon.Pokemon {
    public EpochVanillite(String name, Aspect aspect) {
        super(name, aspect, "EpochVanillite",
                Type.POISON,
                new Stats(56,
                        35,
                        70,
                        39,
                        45,
                        60),
                List.of(Ability.EARTH_EATER,Ability.TOXIC_DEBRIS), Ability.STICKY_HOLD,
                4, 57,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Whether this Pokemon was created from raw toxic waste found in dumping grounds or was already there is a mystery."),
                List.of(new EvolutionEntry("epochvanillish", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.DISABLE,20),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ACID,8),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52),
                        new MoveLearnSetEntry(Move.LICK,4),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.BELCH,48),
                        new MoveLearnSetEntry(Move.TOXIC,60),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,32),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,36),
                        new MoveLearnSetEntry(Move.MINIMIZE,28),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,56),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,44),
                        new MoveLearnSetEntry(Move.POISONSPIT,1),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CONCOCTION,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRICK,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"egg"),
                        new MoveLearnSetEntry(Move.RECYCLE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Vanillite");

    }


}
