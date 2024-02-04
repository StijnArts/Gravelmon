package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tadpunk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tadpunk() {
        super("Tadpunk",
                Type.GROUND,Type.DARK,
                new Stats(50,
                        65,
                        35,
                        40,
                        30,
                        60),
                List.of(Ability.UNDERLING), Ability.SCRAPPY,
                8, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It will always follow the lead of the strongest fighter. It's flaky too, being quite likely to ditch a former ally if the tables start to turn."),
                List.of(new EvolutionEntry("flatriarch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=female\"")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,4),
                        new MoveLearnSetEntry(Move.AQUASLAP,9),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,12),
                        new MoveLearnSetEntry(Move.BEAT_UP,17),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,21),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,24),
                        new MoveLearnSetEntry(Move.LANDSLIDE,27),
                        new MoveLearnSetEntry(Move.SWAGGER,31),
                        new MoveLearnSetEntry(Move.ASSURANCE,35),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,39),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,43),
                        new MoveLearnSetEntry(Move.PUNISHMENT,46),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,49),
                        new MoveLearnSetEntry(Move.FISSURE,53),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
