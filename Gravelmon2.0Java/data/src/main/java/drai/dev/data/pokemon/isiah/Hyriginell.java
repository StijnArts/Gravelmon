package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hyriginell extends drai.dev.data.pokemon.Pokemon {
    public Hyriginell() {
        super("Hyriginell",
                Type.NORMAL,
                new Stats(140,
                        30,
                        20,
                        80,
                        110,
                        50),
                List.of(Ability.CLEAR_BODY,Ability.DAMP,Ability.REGENERATOR), Ability.REGENERATOR,
                3, 165,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                151, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.CONVERSION,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,15),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.CONVERSION_2,25),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.RECOVER,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,45),
                        new MoveLearnSetEntry(Move.LOCKON,50),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,55),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60)),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hyriginell");

    }


}
