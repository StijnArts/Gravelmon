package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pixiechu extends drai.dev.data.pokemon.Pokemon {
    public Pixiechu() {
        super("Pixiechu",
                Type.ELECTRIC, Type.FAIRY,
                new Stats(65,
                        75,
                        50,
                        95,
                        85,
                        115),
                List.of(Ability.CUTE_CHARM), Ability.PIXILATE,
                8, 165,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                214, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Known for its radiant appearance, Pixiechu releases its stored electricity and shows off a wonderful display of sparks. At night, their fur glitters and twinkles like the stars."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.NUZZLE,18),
                        new MoveLearnSetEntry(Move.ATTRACT,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,26),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,29),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,34),
                        new MoveLearnSetEntry(Move.SWEET_KISS,37),
                        new MoveLearnSetEntry(Move.DISCHARGE,42),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,45),
                        new MoveLearnSetEntry(Move.MOONBLAST,50)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pixiechu");

    }


}
