package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nursa extends Pokemon {
    public Nursa() {
        super("Nursa",
                Type.NORMAL, Type.ELECTRIC,
                new Stats(104,
                        55,
                        111,
                        55,
                        75,
                        50),
                List.of(Ability.DEFIBRILLATOR), Ability.DEFIBRILLATOR,
                14, 500,
                new Stats(1,0,1,0,0,0), 45,
                0.5,
                264, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The mild shocks it delivers through its paw pads have a healing effect. It can use slightly stronger shocks to revive fainted Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.CHARM,6),
                        new MoveLearnSetEntry(Move.ENDURE,9),
                        new MoveLearnSetEntry(Move.FLAIL,13),
                        new MoveLearnSetEntry(Move.FORCE_PALM,16),
                        new MoveLearnSetEntry(Move.HEAL_BELL,20),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,23),
                        new MoveLearnSetEntry(Move.ENCORE,27),
                        new MoveLearnSetEntry(Move.CHARGE,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,34),
                        new MoveLearnSetEntry(Move.RECOVER,37),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,44),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,48),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,51),
                        new MoveLearnSetEntry(Move.HEALING_WISH,55),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRIFY,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
