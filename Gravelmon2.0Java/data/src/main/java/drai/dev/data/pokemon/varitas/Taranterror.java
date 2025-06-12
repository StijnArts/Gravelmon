package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Taranterror extends drai.dev.data.pokemon.Pokemon {
    public Taranterror() {
        super("Taranterror",
                Type.BUG, Type.DARK,
                new Stats(85,
                        95,
                        65,
                        40,
                        55,
                        110),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It's always in a state of agitation, quick to deliver an extremely painful bite. The prickly hair covering its body stands on end to make it look more intimidating and can also be fired off as an attack"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,9),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,21),
                        new MoveLearnSetEntry(Move.SCARY_FACE,23),
                        new MoveLearnSetEntry(Move.POISON_FANG,25),
                        new MoveLearnSetEntry(Move.PURSUIT,31),
                        new MoveLearnSetEntry(Move.SPIKES,33),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.DIG,40),
                        new MoveLearnSetEntry(Move.LUNGE,44),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,48),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,51),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,57)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Taranterror");

    }


}
