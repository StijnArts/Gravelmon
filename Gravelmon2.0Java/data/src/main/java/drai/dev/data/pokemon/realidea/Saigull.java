package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Saigull extends Pokemon {
    public Saigull() {
        super("Saigull",
                Type.WATER,
                new Stats(70,75,75,60,65,75),
                List.of(Ability.TORRENT), Ability.DEFIANT,
                14, 330,
                new Stats(0,1,1,0,0,0), 45,
                0.875,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("seaghoul", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.GROWL, 3),
                        new MoveLearnSetEntry(Move.BUBBLE, 5),
                        new MoveLearnSetEntry(Move.PECK, 7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 10),
                        new MoveLearnSetEntry(Move.AQUA_JET, 13),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 16),
                        new MoveLearnSetEntry(Move.AQUA_RING, 19),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 22),
                        new MoveLearnSetEntry(Move.ROOST, 25),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, 28),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 31),
                        new MoveLearnSetEntry(Move.DRILL_PECK, 31),
                        new MoveLearnSetEntry(Move.LIQUIDATION, 34),
                        new MoveLearnSetEntry(Move.BRINE, 34),
                        new MoveLearnSetEntry(Move.ANCHOR_SHOT, 37),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 43),
                        new MoveLearnSetEntry(Move.HURRICANE, 46),
                        new MoveLearnSetEntry(Move.AQUA_JET, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER, "egg"),
                        new MoveLearnSetEntry(Move.REFRESH, "egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        setCanSwim(true);
    }
}
