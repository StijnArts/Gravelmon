package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class KaskadianGastly extends Pokemon {
    public KaskadianGastly(int dexNo) {
        super(dexNo,"KaskadianGastly",
                Type.GHOST, Type.WATER,
                new Stats(30, 35, 40, 80, 25, 100),
                List.of(Ability.LEVITATE, Ability.CONDENSATION), Ability.CARBON_CAPTURE,
                13, 1,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.AMORPHOUS),
                List.of("After migrating to Kaskade, Gastly were cleansed of their deadly poisons by the fresh air. Their bodies then latched on to water vapor to give them physical forms."),
                List.of(new EvolutionEntry("kaskadianhaunter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,4),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,8),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.SPITE,16),
                        new MoveLearnSetEntry(Move.CURSE,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,28),
                        new MoveLearnSetEntry(Move.WATER_PULSE,32),
                        new MoveLearnSetEntry(Move.DARK_PULSE,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.DREAM_EATER,48),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,"egg"),
                        new MoveLearnSetEntry(Move.SMOG,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.IS_RAINING, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Gastly");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
