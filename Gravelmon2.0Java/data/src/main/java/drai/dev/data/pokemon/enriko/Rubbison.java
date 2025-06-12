package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rubbison extends drai.dev.data.pokemon.Pokemon {
    public Rubbison() {
        super("Rubbison",
                Type.GRASS, Type.NORMAL,
                new Stats(210,
                        75,
                        90,
                        30,
                        90,
                        5),
                List.of(Ability.STURDY,Ability.MAGIC_BOUNCE,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                17, 165,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                154, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("It's rubbery hide is impenetrable; bullets fired at it will bounce right off. If set on fire, however, it will be reduced to ash in seconds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.SWALLOW,13),
                        new MoveLearnSetEntry(Move.WORK_UP,16),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.ROLLOUT,28),
                        new MoveLearnSetEntry(Move.REST,32),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,36),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,44),
                        new MoveLearnSetEntry(Move.STORED_POWER,48),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA, Biome.IS_TUNDRA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rubbison");

    }


}
