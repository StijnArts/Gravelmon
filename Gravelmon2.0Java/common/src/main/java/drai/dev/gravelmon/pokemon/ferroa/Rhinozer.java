package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rhinozer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rhinozer() {
        super("Rhinozer",
                Type.GROUND,
                new Stats(60,
                        65,
                        40,
                        35,
                        35,
                        65),
                List.of(Ability.SAND_RUSH,Ability.OBLIVIOUS,Ability.TRAMPLE), Ability.TRAMPLE,
                8, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Rhinozer travel in herds, and as they move along they create visible dirt paths. Other Pokémon learn to cross these paths with caution as they may get trampled by an oncoming herd if they aren't careful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.RAGE,9),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,12),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,15),
                        new MoveLearnSetEntry(Move.DETECT,18),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,25),
                        new MoveLearnSetEntry(Move.IRON_HEAD,29),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,38),
                        new MoveLearnSetEntry(Move.ROTOTILLER,42),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,45),
                        new MoveLearnSetEntry(Move.MEGAHORN,49),
                        new MoveLearnSetEntry(Move.HORN_DRILL,53),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rhinozer");

    }


}
