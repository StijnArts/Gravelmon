package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ginkorale extends drai.dev.data.pokemon.Pokemon {
    public Ginkorale(Stats stats) {
        super("Ginkorale",
                Type.GRASS,Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 685,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Based on: Ginkgo sarcotestae"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.CALM_MIND,1),
                        new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,1),
                        new MoveLearnSetEntry(Move.LOVELARIAT,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.HEAL_BELL,1),
                        new MoveLearnSetEntry(Move.CHEERFULSHOUT,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ginkorale");

    }


}
