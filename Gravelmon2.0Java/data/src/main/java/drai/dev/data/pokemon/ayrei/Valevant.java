package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Valevant extends drai.dev.data.pokemon.Pokemon {
    public Valevant() {
        super("Valevant",
                Type.PSYCHIC,Type.NORMAL,
                new Stats(80,
                        65,
                        65,
                        95,
                        115,
                        105),
                List.of(Ability.MINDTUNING,Ability.SYNCHRONIZE), null,
                17, 780,
                new Stats(0,0,0,0,2,0), 30,
                1.0,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Extremely loyal, it has been the companion of kings alongside Infernadeer. Its sheer strength made it a faithful guardian to its masters."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENCORE,5),
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.CALM_MIND,40),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.AFTER_YOU,25),
                        new MoveLearnSetEntry(Move.SERENEWAVE,50),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.PSYCHIC,35),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,60),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.LAST_RESORT,55),
                        new MoveLearnSetEntry(Move.PSYCHICNOISE,0),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,45),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("indeedee", new EvolutionEntry("valevant", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=male")),List.of(),"cobblemon:room_service"));
           setLangFileName("Valevant");

    }


}
