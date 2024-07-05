package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Pawahon extends Pokemon {
    public Pawahon() {
        super("Pawahon",
                Type.FIGHTING,
                new Stats(110	,55	,65	,120	,85	,85),
                List.of(Ability.MOLD_BREAKER), Ability.SAND_RUSH,
                29, 6800,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                205, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.SCARY_FACE,8),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,13),
                        new MoveLearnSetEntry(Move.LOW_KICK,16),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,30),
                        new MoveLearnSetEntry(Move.ROAR,34),
                        new MoveLearnSetEntry(Move.EARTH_POWER,39),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,42),
                        new MoveLearnSetEntry(Move.WORK_UP,46),
                        new MoveLearnSetEntry(Move.BATTLE_CRY,51),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,54),
                        new MoveLearnSetEntry(Move.DETECT,58),
                        new MoveLearnSetEntry(Move.VITAL_SURGE,63),
                        new MoveLearnSetEntry(Move.HORN_DRILL,66),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"tutor"),
                        new MoveLearnSetEntry(Move.SNARL,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.SONIC_SAND,"tutor"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tutor"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tutor"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tutor"),
                        new MoveLearnSetEntry(Move.TITANIC_HORN,"tutor")
                        ),
                List.of(Label.DENEB),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 33, 54, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        this.setPreEvolution("lumineon");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
