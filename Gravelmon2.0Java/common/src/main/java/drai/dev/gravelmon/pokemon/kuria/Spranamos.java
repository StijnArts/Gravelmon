package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Spranamos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spranamos() {
        super("Spranamos",
                Type.POISON, Type.FIGHTING,
                new Stats(100,
                        120,
                        94,
                        100,
                        84,
                        72),
                List.of(Ability.INTIMIDATE,Ability.SPICETANK), Ability.RECKLESS,
                19, 1013,
                new Stats(1,2,0,0,0,0), 45,
                0.5,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Spranamos has a growth on its back that is used to mix spices into a concoction of potent poison. It's very spicy, so it's easy to get burned. Some people like the taste."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.POISON_STING,8),
                        new MoveLearnSetEntry(Move.TAUNT,10),
                        new MoveLearnSetEntry(Move.PURSUIT,15),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.REVENGE,22),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,29),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,31),
                        new MoveLearnSetEntry(Move.VENOSHOCK,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,38),
                        new MoveLearnSetEntry(Move.POISON_JAB,43),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,45),
                        new MoveLearnSetEntry(Move.BELCH,47),
                        new MoveLearnSetEntry(Move.FLATTER,50)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 43, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_TROPICAL_ISLAND, Biome.IS_TROPICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spranamos");

    }


}
