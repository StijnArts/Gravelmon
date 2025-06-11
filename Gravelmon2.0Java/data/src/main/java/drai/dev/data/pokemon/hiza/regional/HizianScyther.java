package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianScyther extends drai.dev.data.pokemon.Pokemon {
    public HizianScyther(String name, Aspect aspect) {
        super(name, aspect, "Scyther",
                Type.BUG, Type.FAIRY,
                new Stats(70,
                        110,
                        80,
                        55,
                        80,
                        105),
                List.of(Ability.DAZZLING,Ability.RIVALRY,Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                15, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its eyes can see quick movements in slow motion. It is capable of seeing and slicing an arrow in half."),
                List.of(new EvolutionEntry("falcher", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(               new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,12),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,24),
                        new MoveLearnSetEntry(Move.COVET,30),
                        new MoveLearnSetEntry(Move.SWITCHEROO,36),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,54)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Scyther");

    }


}
