package drai.dev.data.pokemon.chaosinvestia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nidoranfe extends drai.dev.data.pokemon.Pokemon {
    public Nidoranfe() {
        super("Nidoranfe",
                Type.POISON,
                new Stats(55,
                        47,
                        52,
                        41,
                        40,
                        40),
                List.of(Ability.POISON_POINT,Ability.RIVALRY), null,
                4, 70,
                new Stats(1,0,0,0,0,0), 235,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Es mag keine Kämpfe. Ein einziger Tropfen des Gifts aus seinen Widerhaken hat eine fatale Wirkung."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.HELPING_HAND,25),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,19),
                        new MoveLearnSetEntry(Move.CAPTIVATE,43),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,7),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FLATTER,33),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,31),
                        new MoveLearnSetEntry(Move.POISON_FANG,45),
                        new MoveLearnSetEntry(Move.POISON_STING,13),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nidoranfe");

    }


}
