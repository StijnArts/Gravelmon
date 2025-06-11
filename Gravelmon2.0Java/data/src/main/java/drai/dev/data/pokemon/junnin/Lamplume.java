package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lamplume extends drai.dev.data.pokemon.Pokemon {
    public Lamplume() {
        super("Lamplume",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(84,
                        59,
                        65,
                        105,
                        122,
                        65),
                List.of(Ability.AROMA_VEIL,Ability.FOREWARN,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                17, 165,
                new Stats(0,0,0,2,1,0), 60,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IMPRISON,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,18),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,20),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,26),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,29),
                        new MoveLearnSetEntry(Move.WISH,32),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,39),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,45),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,49),
                        new MoveLearnSetEntry(Move.HEALING_WISH,54),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,62),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SMOG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_GAS,"tm"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SMOKEBOMB,"tm"),
                        new MoveLearnSetEntry(Move.WITHDRAW,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Lamplume");

    }


}
