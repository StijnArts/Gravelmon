package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stinttle extends drai.dev.data.pokemon.Pokemon {
    public Stinttle() {
        super("Stinttle",
                Type.GRASS, Type.ELECTRIC,
                new Stats(55,
                        92,
                        50,
                        60,
                        73,
                        62),
                List.of(Ability.STATIC), Ability.STATIC,
                9, 45,
                new Stats(0,1,0,0,1,0), 120,
                0.5,
                112, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Stinttle thrive in soils that are highly acidic. This is why they live so close to urban areas due to the phosphate-rich waste that gets expelled into grasslands. They contain tiny needles that are incredibly irritant to touch, causing large rashes that can take months to heal."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,20),
                        new MoveLearnSetEntry(Move.SPARK,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.SPIKES,33),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,35),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,38),
                        new MoveLearnSetEntry(Move.VENOSHOCK,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,45),
                        new MoveLearnSetEntry(Move.FELL_STINGER,48),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,51)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stinttle");

    }


}
