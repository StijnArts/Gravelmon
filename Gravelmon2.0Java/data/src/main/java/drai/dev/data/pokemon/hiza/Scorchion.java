package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scorchion extends drai.dev.data.pokemon.Pokemon {
    public Scorchion() {
        super("Scorchion",
                Type.FIRE, Type.STEEL,
                new Stats(81,
                        122,
                        80,
                        72,
                        60,
                        77),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                12, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its claws and tail heat up as it uses them in combat, getting stronger and eventually being able to cut through anything."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,5),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,30),
                        new MoveLearnSetEntry(Move.BURN_UP,34),
                        new MoveLearnSetEntry(Move.SLASH,39),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,46),
                        new MoveLearnSetEntry(Move.GUILLOTINE,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_FOREST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Scorchion");

    }


}
