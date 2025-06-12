package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Inbex extends drai.dev.data.pokemon.Pokemon {
    public Inbex() {
        super("Inbex",
                Type.STEEL,
                new Stats(46,
                        43,
                        31,
                        24,
                        34,
                        42),
                List.of(Ability.LIMBER), Ability.RECKLESS,
                6, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("titanbex", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,7),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Inbex");

    }


}
