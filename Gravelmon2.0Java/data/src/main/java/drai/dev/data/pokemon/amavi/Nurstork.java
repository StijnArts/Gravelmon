package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nurstork extends drai.dev.data.pokemon.Pokemon {
    public Nurstork() {
        super("Nurstork",
                Type.FLYING, Type.FAIRY,
                new Stats(120,
                        50,
                        80,
                        75,
                        85,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.FLASH,5),
                        new MoveLearnSetEntry(Move.DEFOG,9),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,14),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,24),
                        new MoveLearnSetEntry(Move.AIR_SLASH,29),
                        new MoveLearnSetEntry(Move.MOONLIGHT,33),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,38),
                        new MoveLearnSetEntry(Move.DETECT,42),
                        new MoveLearnSetEntry(Move.MOONBLAST,47),
                        new MoveLearnSetEntry(Move.MIND_READER,54)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Nurstork");

    }


}
