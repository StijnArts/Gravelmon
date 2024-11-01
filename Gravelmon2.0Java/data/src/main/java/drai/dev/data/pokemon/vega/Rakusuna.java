package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rakusuna extends Pokemon {
    public Rakusuna() {
        super( "Rakusuna",
                Type.GROUND,
                new Stats(60	,40	,50	,60	,55	,45),
                List.of(Ability.SAND_STREAM), Ability.SAND_STREAM,
                14, 1278,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                124, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("sunankusu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.PALEOBREATH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.PALEOBREATH,10),
                        new MoveLearnSetEntry(Move.SAFEGUARD,13),
                        new MoveLearnSetEntry(Move.BULLDOZE,19),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.YAWN,25),
                        new MoveLearnSetEntry(Move.STOMP,31),
                        new MoveLearnSetEntry(Move.BURROW,34),
                        new MoveLearnSetEntry(Move.GRAVITY_WAVE,36),
                        new MoveLearnSetEntry(Move.POWER_GEM,38),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,45),
                        new MoveLearnSetEntry(Move.SANDBLAST,49),
                        new MoveLearnSetEntry(Move.CALM_MIND,53),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,64),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BURROW,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tutor"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.ASTROFORCE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tutor"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tutor"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tutor"),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,"tutor"),
                        new MoveLearnSetEntry(Move.SONIC_SAND,"tutor"),
                        new MoveLearnSetEntry(Move.TERRAHEDRON,"tutor"),
                        new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                        new MoveLearnSetEntry(Move.TERRAHEDRON,"egg"),
                        new MoveLearnSetEntry(Move.GRAVELBREATH,"egg"),
                        new MoveLearnSetEntry(Move.CHROME_BALL,"egg"),
                        new MoveLearnSetEntry(Move.VITAL_SURGE,"egg"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRICK,"egg"),
                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.MARVEL_TRICK,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 25, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
