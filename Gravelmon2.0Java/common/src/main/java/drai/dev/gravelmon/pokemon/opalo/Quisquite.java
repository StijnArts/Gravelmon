package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Quisquite extends Pokemon {
    public Quisquite() {
        super("Quisquite",
                Type.WATER, Type.BUG,
                new Stats(53,51,60,40,63,50),
                List.of(Ability.TORRENT), Ability.SHELL_ARMOR,
                4, 100,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("gambarrel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 4),
                        new MoveLearnSetEntry(Move.BUBBLE, 8),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 11),
                        new MoveLearnSetEntry(Move.WITHDRAW, 15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM, 18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 22),
                        new MoveLearnSetEntry(Move.VICE_GRIP, 25),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 29),
                        new MoveLearnSetEntry(Move.PROTECT, 32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 36),
                        new MoveLearnSetEntry(Move.DARK_PULSE, 39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 43),
                        new MoveLearnSetEntry(Move.AGILITY, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT, "egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.SNORE, "egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
