package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Galextrial extends drai.dev.data.pokemon.Pokemon {
    public Galextrial() {
        super("Galextrial",
                Type.STEEL, Type.NORMAL,
                new Stats(70,
                        113,
                        83,
                        60,
                        90,
                        114),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 165,
                new Stats(0,2,0,0,0,1), 30,
                0.5,
                239, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METEOR_MASH,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,8),
                        new MoveLearnSetEntry(Move.STEEL_WING,16),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,26),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58),
                        new MoveLearnSetEntry(Move.EXPLOSION,68),
                        new MoveLearnSetEntry(Move.METEOR_MASH,78),
                        new MoveLearnSetEntry(Move.DOOM_DESIRE,88),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,98)           ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
