package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Suripitto extends Pokemon {
    public Suripitto() {
        super( "Suripitto",
                Type.PSYCHIC,
                new Stats(90	,103	,70	,73	,135,	72),
                List.of(Ability.INSOMNIA), Ability.INNER_FOCUS,
                19, 879,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                197, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCRUSH,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.SOMNISMOG,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DISABLE,5),
                        new MoveLearnSetEntry(Move.CONFUSION,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,13),
                        new MoveLearnSetEntry(Move.POISON_GAS,17),
                        new MoveLearnSetEntry(Move.MEDITATE,21),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,29),
                        new MoveLearnSetEntry(Move.PSYCH_UP,33),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,37),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,41),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.PSYCHIC,49),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,53),
                        new MoveLearnSetEntry(Move.YOGA_SMASH,57),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,61),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DIZZY_WHIRL,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.ASSIST,"tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"tutor"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.BARRIER,"egg"),
                new MoveLearnSetEntry(Move.BEATDOWN,"egg"),
                new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                new MoveLearnSetEntry(Move.HAUNT,"egg"),
                new MoveLearnSetEntry(Move.PROBE_PUNCH,"egg"),
                new MoveLearnSetEntry(Move.ROLE_PLAY,"egg"),
                new MoveLearnSetEntry(Move.SOULSHOCK,"egg"),
                new MoveLearnSetEntry(Move.STRETCH,"egg"),
                new MoveLearnSetEntry(Move.TRICK_ROOM,"egg"),
                new MoveLearnSetEntry(Move.WISH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA, Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        addAdditionalEvolution("hypno", new EvolutionEntry("suripitto", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.PSYSTRIKE.getName())))	);
    }
}
