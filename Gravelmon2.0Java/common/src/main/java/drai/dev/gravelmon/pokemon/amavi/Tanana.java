package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tanana extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tanana() {
        super("Tanana",
                Type.BUG, Type.POISON,
                new Stats(88,
                        130,
                        87,
                        65,
                        65,
                        54),
                List.of(Ability.HARVEST,Ability.GLUTTONY), Ability.UNBURDEN,
                9, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.PESTER,3),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.SILVER_WIND,14),
                        new MoveLearnSetEntry(Move.HARDEN,19),
                        new MoveLearnSetEntry(Move.SLUDGE,22),
                        new MoveLearnSetEntry(Move.AMNESIA,26),
                        new MoveLearnSetEntry(Move.WING_ATTACK,29),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.POISON_TAIL,36),
                        new MoveLearnSetEntry(Move.FELL_STINGER,41),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,45),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,56)                 ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 28, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tanana");

    }


}
