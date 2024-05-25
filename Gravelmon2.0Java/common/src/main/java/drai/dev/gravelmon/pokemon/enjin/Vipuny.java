package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Vipuny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vipuny() {
        super("Vipuny",
                Type.WATER, Type.DRAGON,
                new Stats(55,
                        30,
                        48,
                        39,
                        48,
                        40),
                List.of(Ability.SWIFT_SWIM,Ability.CUTE_CHARM), Ability.RATTLED,
                6, 0,
                new Stats(1,0,0,0,0,0), 160,
                0.5,
                52, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It is hatched from 1 out of exactly 100 eggs laid by within a thick carpet of sea foam, which covers the young Vipuny for protection and buoyancy. Their natural defense is to wail loudly in hopes that it scares off its attacker."),
                List.of(new EvolutionEntry("vipentide", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"210")))),
                List.of(
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,3),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,8),
                        new MoveLearnSetEntry(Move.BOUNCE,12),
                        new MoveLearnSetEntry(Move.HELPING_HAND,16),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.JAW_LOCK,"tm"),
                        new MoveLearnSetEntry(Move.SMOKEBOMB,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ABSORB,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SHEER_COLD,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_GAS,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 9, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
