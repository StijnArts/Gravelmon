package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kitling extends drai.dev.data.pokemon.Pokemon {
    public Kitling() {
        super("Kitling",
                Type.GRASS,
                new Stats(49,
                        42,
                        53,
                        63,
                        44,
                        63),
                List.of(Ability.OVERGROW), Ability.TELEPATHY,
                4, 36,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Known for the ability to read people and pokemon's thoughts. Kitling sunbathe in order to store energy, becoming lethargic on days where the sun isn't shining."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,11),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.CALM_MIND,19),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,23),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,27),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,30),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,34),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,39),
                        new MoveLearnSetEntry(Move.SYNTHESIS,43),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,46),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kitling");

    }


}
