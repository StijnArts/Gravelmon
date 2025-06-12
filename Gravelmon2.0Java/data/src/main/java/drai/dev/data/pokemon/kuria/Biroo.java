package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Biroo extends drai.dev.data.pokemon.Pokemon {
    public Biroo() {
        super("Biroo",
                Type.NORMAL,
                new Stats(60,
                        56,
                        50,
                        40,
                        50,
                        69),
                List.of(Ability.RUN_AWAY,Ability.WIMP_OUT), Ability.SHADOW_TAG,
                4, 34,
                new Stats(1,0,0,0,0,1), 200,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It runs away from its own shadow most of the day, fearing something that we don't know. Some believe that the shadow is alive."),
                List.of(new EvolutionEntry("noctoa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "night")))),
                List.of(            new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.COVET,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,15),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,18),
                        new MoveLearnSetEntry(Move.REST,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.FLING,33),
                        new MoveLearnSetEntry(Move.FLAIL,38),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Biroo");

    }


}
