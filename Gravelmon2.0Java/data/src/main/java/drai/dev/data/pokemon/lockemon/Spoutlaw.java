package drai.dev.data.pokemon.lockemon;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Spoutlaw extends Pokemon {
    public Spoutlaw() {
        super("Spoutlaw",
                Type.WATER, Type.BUG,
                new Stats(55,
                        85,
                        60,
                        85,
                        50,
                        85),
                List.of(Ability.TORRENT), Ability.BUBBLE_HELM,
                11, 109,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG, EggGroup.WATER_3),
                List.of("When in battle, Spoutlaw will motionlessly stare down their opponent, hands hovering over the water pouches on their hips. At the slightest noise, Spoutlaw will lash out and shoot water from its pouches at blinding speeds."),
                List.of(new EvolutionEntry("Vaquamael", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.AQUA_RING,16),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.SOAK,28),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,32),
                        new MoveLearnSetEntry(Move.LUNGE,36),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,40),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,44),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,48),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
