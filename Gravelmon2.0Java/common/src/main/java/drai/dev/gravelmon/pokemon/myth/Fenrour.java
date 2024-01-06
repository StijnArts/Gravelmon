package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Fenrour extends Pokemon {
    public Fenrour() {
        super("Fenrour",
                Type.GROUND, Type.GHOST,
                new Stats(115,125,80,115,110,125),
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                12, 1133,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Ancient Mythan tells of a tale of three wolves, and Fenrour is seen as the leader of the pack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH, 1),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, 1),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 45),
                        new MoveLearnSetEntry(Move.ICE_FANG, 46),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 46),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 46),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 51),
                        new MoveLearnSetEntry(Move.DRILL_RUN, 54),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH, 57),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 59),
                        new MoveLearnSetEntry(Move.FISSURE, 63),
                        new MoveLearnSetEntry(Move.OVERHEAT, 67),
                        new MoveLearnSetEntry(Move.DARK_VOID, 71),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE, 75)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
