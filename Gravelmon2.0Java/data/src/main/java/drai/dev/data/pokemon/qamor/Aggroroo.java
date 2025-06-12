package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Aggroroo extends drai.dev.data.pokemon.Pokemon {
    public Aggroroo() {
        super("Aggroroo",
                Type.GROUND, Type.FIGHTING,
                new Stats(98,
                        90,
                        68,
                        40,
                        44,
                        100),
                List.of(Ability.GUTS), Ability.JUMPIN,
                15, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The Kick of an Aggroroo can result in multiple fractures and broken bones, and the knockback alone can send you flying off several meters. It's best to avoid these Pokemon in general, as they are very aggressive and petty Pokemon that attack those that annoy them even slightly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.STOMP,9),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,15),
                        new MoveLearnSetEntry(Move.BLOCK,17),
                        new MoveLearnSetEntry(Move.HYPER_FANG,20),
                        new MoveLearnSetEntry(Move.WORK_UP,24),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,26),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,33),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,37),
                        new MoveLearnSetEntry(Move.MEGA_KICK,46),
                        new MoveLearnSetEntry(Move.JUMP_KICK,50),
                        new MoveLearnSetEntry(Move.BOUNCE,55),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT, Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Aggroroo");

    }


}
