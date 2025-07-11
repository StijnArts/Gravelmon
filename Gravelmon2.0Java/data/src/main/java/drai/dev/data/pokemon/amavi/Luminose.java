package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Luminose extends drai.dev.data.pokemon.Pokemon {
    public Luminose() {
        super("Luminose",
                Type.NORMAL, Type.PSYCHIC,
                new Stats(80,
                        55,
                        85,
                        85,
                        105,
                        75),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                11, 358,
                new Stats(0,0,0,0,2,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Early-Route Normal Rodent Pokemon ------'Luminose strains during evolution from Molit. Its exposed skull and star-nose finally enable it to use its psychic powers when evolved.'"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,7),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,17),
                        new MoveLearnSetEntry(Move.ASSIST,23),
                        new MoveLearnSetEntry(Move.PSYBEAM,26),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,29),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,32),
                        new MoveLearnSetEntry(Move.PSIBULLET,36),
                        new MoveLearnSetEntry(Move.CAPTIVATE,39),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,43),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,47),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,53)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Luminose");

    }


}
