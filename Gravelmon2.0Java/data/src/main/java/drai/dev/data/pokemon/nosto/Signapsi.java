package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Signapsi extends drai.dev.data.pokemon.Pokemon {
    public Signapsi() {
        super("Signapsi",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(49,
                        31,
                        48,
                        73,
                        60,
                        39),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Signal Beam Bug Magnet Rise Electric Rising VoltageSTAB Electric Shock WaveSTAB Electric Pain Split Normal Snore Normal Expanding ForceSTAB Psychic Gravity Psychic Magic Coat Psychic Telekinesis Psychic Wonder Room Psychic U-turn Bug Dark Pulse Dark Embargo Dark Nasty Plot Dark Taunt Dark Charge BeamSTAB Electric Electric Terrain Electric ElectrocuteSTAB Electric ThunderSTAB Electric ThunderboltSTAB Electric Thunder Wave Electric Volt SwitchSTAB Electric Flame Charge Fire Flamethrower Fire Sunny Day Fire Will-O-Wisp Fire Energy Ball Grass Attract Normal Confide Normal Double Team Normal Echoed Voice Normal Facade Normal Flash Normal Frustration Normal Heartfelt Pulse Normal Hidden Power Normal Protect Normal Psych Up Normal Return Normal Round Normal Safeguard Normal Sleep Talk Normal Strength Normal Substitute Normal Swagger Normal Sludge Bomb Poison Sludge Wave Poison Toxic Poison Venoshock Poison Calm Mind Psychic Dream EaterSTAB Psychic Light Screen Psychic PsychicSTAB Psychic Psychic Terrain Psychic PsyshockSTAB Psychic Reflect Psychic Rest Psychic Trick Room Psychic Gyro Ball Steel"),
                List.of(new EvolutionEntry("reneuron", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,4),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,11),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,23),
                        new MoveLearnSetEntry(Move.ELECTRIFY,28),
                        new MoveLearnSetEntry(Move.PSYCHIC,33),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm")                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Signapsi");

    }


}
