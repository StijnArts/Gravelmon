package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Craura extends drai.dev.gravelmon.pokemon.Pokemon {
    public Craura() {
        super("Craura",
                Type.DARK,Type.FAIRY,
                new Stats(65,
                        70,
                        65,
                        70,
                        65,
                        70),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                12, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Craura are odd among Dark-types, becoming active during the day. They are reflexive Pokemon, using their opponent’s power against them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,36),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.MOONLIGHT,44),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,48),
                        new MoveLearnSetEntry(Move.CRUNCH,54),
                        new MoveLearnSetEntry(Move.IMPRISON,60)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 17, 36, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Craura");

    }


}
