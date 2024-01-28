package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Inbex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inbex() {
        super("Inbex",
                Type.STEEL,
                new Stats(46,
                        43,
                        31,
                        24,
                        34,
                        42),
                List.of(Ability.LIMBER), Ability.RECKLESS,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Tackle Normal 7 Headbutt Normal 13 Iron Defense Steel 38 Take Down Normal 43 Iron HeadSTAB Steel 56 Double-Edge Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,7),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inbex");

    }


}