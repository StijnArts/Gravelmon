package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Folifarig extends Pokemon {
    public Folifarig() {
        super( "Folifarig",
                Type.NORMAL, Type.PSYCHIC,
                new Stats(80,
                        85,
                        75,
                        130,
                        85,
                        95),
                List.of(Ability.INNER_FOCUS), Ability.EARLY_BIRD,
                17, 512,
                new Stats(0,0,0,3,0,0), 30,
                0.5,
                205, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIGHT_PULSE,1),
                        new MoveLearnSetEntry(Move.POWER_SWAP,1),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,5),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,10),
                        new MoveLearnSetEntry(Move.STOMP,14),
                        new MoveLearnSetEntry(Move.PSYBEAM,19),
                        new MoveLearnSetEntry(Move.AGILITY,23),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,28),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,30),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,33),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.BATON_PASS,44),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.TAI_CHI,55),
                        new MoveLearnSetEntry(Move.PSYCHIC,61),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tutor"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tutor"),
                        new MoveLearnSetEntry(Move.WISH,"tutor"),
                        new MoveLearnSetEntry(Move.TREATMENT,"tutor"),
                        new MoveLearnSetEntry(Move.ASTROLOGY,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYBURN,"tutor"),
                        new MoveLearnSetEntry(Move.ECTOBLAST,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.MIMIC,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.PSYBURN,"egg"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"egg"),
                        new MoveLearnSetEntry(Move.PYROKINESIS,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"egg"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.TRICK,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .setAntiBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setPreEvolution("girafarig");
        addAdditionalEvolution("girafarig", new EvolutionEntry("folifarig", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"))));
    }
}
