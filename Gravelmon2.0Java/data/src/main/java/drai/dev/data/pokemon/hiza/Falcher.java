package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Falcher extends drai.dev.data.pokemon.Pokemon {
    public Falcher() {
        super("Falcher",
                Type.BUG, Type.FAIRY,
                new Stats(85,
                        130,
                        80,
                        55,
                        85,
                        65),
                List.of(Ability.DAZZLING,Ability.RIVALRY,Ability.DANCER), Ability.DANCER,
                18, 165,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When enraged it will swiftly spin with its sharp blade arms, becoming completely unapproachable."),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,12),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,24),
                        new MoveLearnSetEntry(Move.COVET,30),
                        new MoveLearnSetEntry(Move.SWITCHEROO,36),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,54)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Falcher");

    }


}
