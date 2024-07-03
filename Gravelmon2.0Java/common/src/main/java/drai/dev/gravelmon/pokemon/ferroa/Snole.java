package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Snole extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snole() {
        super("Snole",
                Type.ICE, Type.GROUND,
                new Stats(55,
                        58,
                        48,
                        50,
                        48,
                        46),
                List.of(Ability.SLUSH_RUSH,Ability.TOUGH_CLAWS,Ability.THICK_FAT), Ability.THICK_FAT,
                5, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Tunneling through snow as if it were liquid, it hunts for Sleetle hibernating deep in the soil. Its nose is always covered in frost from constantly pushing against the snow it digs through."),
                List.of(new EvolutionEntry("digloo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ENDURE,5),
                        new MoveLearnSetEntry(Move.ICE_SHARD,9),
                        new MoveLearnSetEntry(Move.MAGNITUDE,12),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,15),
                        new MoveLearnSetEntry(Move.ICE_FANG,19),
                        new MoveLearnSetEntry(Move.AVALANCHE,24),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,27),
                        new MoveLearnSetEntry(Move.DIG,31),
                        new MoveLearnSetEntry(Move.AMNESIA,34),
                        new MoveLearnSetEntry(Move.DRILL_RUN,37),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,42),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROTOTILLER,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 27, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snole");

    }


}
