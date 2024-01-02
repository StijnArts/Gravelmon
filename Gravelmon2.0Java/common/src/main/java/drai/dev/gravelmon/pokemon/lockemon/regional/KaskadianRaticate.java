package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class KaskadianRaticate extends Pokemon {
    public KaskadianRaticate(int dexNo) {
        super(dexNo,"KaskadianRaticate",
                Type.NORMAL, Type.ICE,
                new Stats(55, 50, 70, 81, 70, 87),
                List.of(Ability.ICE_BODY, Ability.SLUSH_RUSH), Ability.SHEER_FORCE,
                7, 401,
                new Stats(0,0,1,0,0,0), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("Known for invading towns, ice type moves were once used against them to scare them away. Over the generations it has adapted to these icy conditions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,10),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,16),
                        new MoveLearnSetEntry(Move.ASSURANCE,19),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,24),
                        new MoveLearnSetEntry(Move.FREEZEDRY,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,34),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,39),
                        new MoveLearnSetEntry(Move.ENDEAVOR,44),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"egg"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,"egg"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN1),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 20, 41, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING, Biome.IS_SNOWY))
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Raticate");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
