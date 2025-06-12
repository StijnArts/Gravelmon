package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mantaqua extends drai.dev.data.pokemon.Pokemon {
    public Mantaqua() {
        super("Mantaqua",
                Type.WATER,
                new Stats(89,
                        49,
                        69,
                        59,
                        79,
                        99),
                List.of(Ability.HYDRATION), Ability.WATER_VEIL,
                14, 165,
                new Stats(1,0,0,0,0,1), 150,
                0.5,
                155, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,5),
                        new MoveLearnSetEntry(Move.AQUASLAP,9),
                        new MoveLearnSetEntry(Move.SUPERSONIC,11),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,19),
                        new MoveLearnSetEntry(Move.MIST,21),
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.WATER_PULSE,29),
                        new MoveLearnSetEntry(Move.SOAK,31),
                        new MoveLearnSetEntry(Move.CALM_MIND,34),
                        new MoveLearnSetEntry(Move.LIFE_DEW,37),
                        new MoveLearnSetEntry(Move.UTURN,39),
                        new MoveLearnSetEntry(Move.BOUNCE,41),
                        new MoveLearnSetEntry(Move.LIQUIDATION,45),
                        new MoveLearnSetEntry(Move.SAFEGUARD,49),
                        new MoveLearnSetEntry(Move.RECOVER,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,54),
                        new MoveLearnSetEntry(Move.BEACHTIDE,57),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,59),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,61),
                        new MoveLearnSetEntry(Move.STARSTREAM,65),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,69),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,71),
                        new MoveLearnSetEntry(Move.HEALING_WISH,74)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
