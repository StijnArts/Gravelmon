package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nemerder extends drai.dev.data.pokemon.Pokemon {
    public Nemerder() {
        super("Nemerder",
                Type.DARK,Type.ICE,
                new Stats(66,
                        103,
                        63,
                        87,
                        65,
                        101),
                List.of(Ability.PICKPOCKET,Ability.PICKUP), Ability.SKILL_LINK,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Often at odds with Mahoyon and Crusadyon. Nemerder will take from humans and pokemon alike, using their Crowfer underlings for their dirty work. It covers its wings in a layer of ice, rendering them useless for flight, but deadly in battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.TAUNT,11),
                        new MoveLearnSetEntry(Move.THIEF,16),
                        new MoveLearnSetEntry(Move.SNATCH,20),
                        new MoveLearnSetEntry(Move.ICE_SHARD,24),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,29),
                        new MoveLearnSetEntry(Move.DRILL_PECK,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,38),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,41),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,46),
                        new MoveLearnSetEntry(Move.CLONEATTACK,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,56)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nemerder");

    }


}
