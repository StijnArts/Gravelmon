package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bunite extends drai.dev.data.pokemon.Pokemon {
    public Bunite() {
        super("Bunite",
                Type.ELECTRIC,
                new Stats(32,
                        46,
                        43,
                        48,
                        41,
                        55),
                List.of(Ability.ILLUMINATE,Ability.STATIC), Ability.CUTE_CHARM,
                5, 27,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Bunite's cheeks and belly have the ability to flash harsh light, blinding foes long enough to escape. Its small size and friendly disposition make it a popular children's companion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.NUZZLE,16),
                        new MoveLearnSetEntry(Move.CHARGE,18),
                        new MoveLearnSetEntry(Move.CHARM,21),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,25),
                        new MoveLearnSetEntry(Move.ENCORE,29),
                        new MoveLearnSetEntry(Move.STUNJAB,33),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,37),
                        new MoveLearnSetEntry(Move.BOUNCE,41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.JUMP_KICK,54),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,58)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bunite");

    }


}
