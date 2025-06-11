package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Decapasite extends drai.dev.data.pokemon.Pokemon {
    public Decapasite() {
        super("Decapasite",
                Type.BUG, Type.GHOST,
                new Stats(90,
                        50,
                        110,
                        80,
                        90,
                        80),
                List.of(Ability.UNNERVE,Ability.LEVITATE), Ability.POWERLEECH,
                14, 165,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                160, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.BUG),
                List.of("Decapasite's venom is sterile, which prevents the head it lives in from rotting. They lure in prey with odd signals before injecting eggs into them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.INFESTATION,28),
                        new MoveLearnSetEntry(Move.PROTECT,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,44),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
