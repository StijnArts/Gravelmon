package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class KaskadianMarill extends Pokemon {
    public KaskadianMarill(String name, Aspect aspect) {
        super(name, aspect,"KaskadianMarill",
                Type.WATER, Type.GRASS,
                new Stats(70, 20, 50, 20, 50, 40),
                List.of(Ability.HYDRATION, Ability.STICKY_HOLD), Ability.VEGETATE,
                7, 150,
                new Stats(2,0,0,0,0,0), 190,
                0.25,
                88, ExperienceGroup.FAST,
                70,
                26, List.of(EggGroup.WATER_1, EggGroup.FAIRY),
                List.of("Unlike its Johto counterpart, Kaskadian Marill live underwater and use their algae like hair to absorb sunlight for energy. They are kind and gentle creatures."),
                List.of(new EvolutionEntry("kaskadianazumarill", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.BOUNCE,15),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,19),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,21),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,27),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,30),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,33),
                        new MoveLearnSetEntry(Move.POWER_WHIP,36),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.COPYCAT,"egg"),
                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                        new MoveLearnSetEntry(Move.PRESENT,"egg"),
                        new MoveLearnSetEntry(Move.SING,"egg"),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN2),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Marill");

    }
}
