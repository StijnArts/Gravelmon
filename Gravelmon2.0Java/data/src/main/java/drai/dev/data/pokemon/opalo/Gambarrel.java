package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Gambarrel extends Pokemon {
    public Gambarrel() {
        super("Gambarrel",
                Type.WATER, Type.BUG,
                new Stats(75,65,85,50,77,65),
                List.of(Ability.TORRENT), Ability.SHELL_ARMOR,
                8, 190,
                new Stats(1,0,0,0,1,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("bogaleon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 4),
                        new MoveLearnSetEntry(Move.BUBBLE, 8),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 11),
                        new MoveLearnSetEntry(Move.WITHDRAW, 15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM, 18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 22),
                        new MoveLearnSetEntry(Move.BOUNCE, 25),
                        new MoveLearnSetEntry(Move.BRINE, 29),
                        new MoveLearnSetEntry(Move.PROTECT, 32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 36),
                        new MoveLearnSetEntry(Move.DARK_PULSE, 39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 45),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 52),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
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
