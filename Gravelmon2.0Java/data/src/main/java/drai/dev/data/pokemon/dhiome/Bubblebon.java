package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bubblebon extends drai.dev.data.pokemon.Pokemon {
    public Bubblebon() {
        super("Bubblebon",
                Type.WATER,
                new Stats(55,
                        60,
                        45,
                        50,
                        55,
                        45),
                List.of(Ability.TORRENT), Ability.IRON_FIST,
                5, 59,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Groups of these Pokemon tend to gather around ponds happily splashing water to each other. When enraged it defends itself with Bubbles."),
                List.of(new EvolutionEntry("scufflebon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,16),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,19),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,27),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,30),
                        new MoveLearnSetEntry(Move.SUBMISSION,33),
                        new MoveLearnSetEntry(Move.IRON_HEAD,36),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,40),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,44),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,50),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,61)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Bubblebon");

    }


}
