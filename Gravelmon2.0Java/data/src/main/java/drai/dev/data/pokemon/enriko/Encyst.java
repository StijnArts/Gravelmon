package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Encyst extends drai.dev.data.pokemon.Pokemon {
    public Encyst() {
        super("Encyst",
                Type.BUG, Type.GHOST,
                new Stats(25,
                        30,
                        20,
                        75,
                        75,
                        60),
                List.of(Ability.UNNERVE,Ability.LEVITATE,Ability.POWERLEECH), Ability.POWERLEECH,
                6, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.BUG),
                List.of("It can't survive long without a host, so seeing one in the wild is rare. Their eggs are laid under the skin of Probee and goomyroast."),
                List.of(new EvolutionEntry("decapasite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,16),
                        new MoveLearnSetEntry(Move.INGRAIN,20),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.INFESTATION,28),
                        new MoveLearnSetEntry(Move.PROTECT,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,44),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
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
