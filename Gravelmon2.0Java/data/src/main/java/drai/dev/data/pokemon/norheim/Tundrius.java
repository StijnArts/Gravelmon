package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tundrius extends drai.dev.data.pokemon.Pokemon {
    public Tundrius(Stats stats) {
        super("Tundrius",
                Type.ICE, Type.DRAGON,
                stats,
                List.of(Ability.SNOW_WARNING,Ability.OUTBURST,Ability.HARVEST), Ability.HARVEST,
                28, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A close relative to Tropius. Tundrius use their lock necks and corner teeth to crack pinecones and to bite through pine tree needle. They are solitary and remain peaceful unless threatened."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.SING,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.LIFE_DEW,15),
                        new MoveLearnSetEntry(Move.ICE_SHARD,20),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,30),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,35),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.ICE_BEAM,45),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,50),
                        new MoveLearnSetEntry(Move.OUTRAGE,55),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,60),
                        new MoveLearnSetEntry(Move.SHEER_COLD,65)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tundrius");

    }


}
