package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Aurinel extends drai.dev.data.pokemon.Pokemon {
    public Aurinel() {
        super("Aurinel",
                Type.NORMAL,
                new Stats(55,
                        75,
                        60,
                        90,
                        85,
                        90),
                List.of(Ability.UNBURDEN), Ability.SUPER_LUCK,
                10, 165,
                new Stats(0,0,0,1,0,1), 127,
                0.5,
                147, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Aurinel were kept by kings as pets in the past. Despite disliking loud noises, they grew accustomed living close to people."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.COVET,12),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,15),
                        new MoveLearnSetEntry(Move.ROUND,17),
                        new MoveLearnSetEntry(Move.SING,22),
                        new MoveLearnSetEntry(Move.SWIFT,25),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,34),
                        new MoveLearnSetEntry(Move.WISH,38),
                        new MoveLearnSetEntry(Move.BATON_PASS,44),
                        new MoveLearnSetEntry(Move.LAST_RESORT,50)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(19)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Aurinel");

    }


}
