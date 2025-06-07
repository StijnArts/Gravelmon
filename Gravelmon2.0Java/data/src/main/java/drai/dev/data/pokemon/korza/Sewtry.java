package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sewtry extends drai.dev.data.pokemon.Pokemon {
    public Sewtry() {
        super("Sewtry",
                Type.STEEL,Type.FLYING,
                new Stats(89,
                        93,
                        70,
                        50,
                        70,
                        91),
                List.of(Ability.LIGHT_METAL,Ability.PICKUP), Ability.RIVALRY,
                10, 104,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Upon evolution, Sewtry moves to more open areas and becomes solitary. Its tail feathers are made of sharp metal, used to keep its territory trimmed and clear."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,7),
                        new MoveLearnSetEntry(Move.SCREECH,13),
                        new MoveLearnSetEntry(Move.STEEL_WING,18),
                        new MoveLearnSetEntry(Move.METAL_SOUND,23),
                        new MoveLearnSetEntry(Move.ACROBATICS,27),
                        new MoveLearnSetEntry(Move.TAILWIND,33),
                        new MoveLearnSetEntry(Move.IRON_TAIL,38),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,42),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,47),
                        new MoveLearnSetEntry(Move.BOLTIN,53),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,60),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sewtry");

    }


}
