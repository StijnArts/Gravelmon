package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shockitt extends drai.dev.data.pokemon.Pokemon {
    public Shockitt() {
        super("Shockitt",
                Type.DARK, Type.ELECTRIC,
                new Stats(40,
                        50,
                        45,
                        70,
                        30,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 61,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("felightning", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.HELPING_HAND,11),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,14),
                        new MoveLearnSetEntry(Move.HYPER_FANG,18),
                        new MoveLearnSetEntry(Move.THIEF,21),
                        new MoveLearnSetEntry(Move.SUPER_FANG,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.TAUNT,34),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,39),
                        new MoveLearnSetEntry(Move.SWITCHEROO,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,48),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,53),
                        new MoveLearnSetEntry(Move.THUNDER,59)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shockitt");

    }


}
