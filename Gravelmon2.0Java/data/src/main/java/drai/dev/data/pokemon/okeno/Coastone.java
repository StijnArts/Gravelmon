package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coastone extends drai.dev.data.pokemon.Pokemon {
    public Coastone() {
        super("Coastone",
                Type.GROUND, Type.WATER,
                new Stats(55,
                        56,
                        100,
                        46,
                        51,
                        25),
                List.of(Ability.FILTER,Ability.SAND_VEIL,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                10, 165,
                new Stats(0,0,1,0,0,0), 125,
                0.5,
                66, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("Coastone dig small caves, which end up serving as home for fish Pokemon. Although they seem to be covered in sand, they just have a rough spongy skin."),
                List.of(new EvolutionEntry("sandieval", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"80")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,2),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,8),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.SAND_TOMB,22),
                        new MoveLearnSetEntry(Move.BRINE,27),
                        new MoveLearnSetEntry(Move.BLOCK,32),
                        new MoveLearnSetEntry(Move.BEACHTIDE,37),
                        new MoveLearnSetEntry(Move.SANDSHOT,43),
                        new MoveLearnSetEntry(Move.FISSURE,50),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.REEFBARRIER,"tm"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Coastone");

    }


}
