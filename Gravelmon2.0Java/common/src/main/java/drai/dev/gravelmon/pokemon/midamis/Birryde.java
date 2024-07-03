package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Birryde extends drai.dev.gravelmon.pokemon.Pokemon {
    public Birryde() {
        super("Birryde",
                Type.FLYING,
                new Stats(85,
                        80,
                        90,
                        60,
                        75,
                        120),
                List.of(Ability.KEEN_EYE,Ability.NOCTURNAL,Ability.INFILTRATOR), Ability.INFILTRATOR,
                14, 165,
                new Stats(0,0,1,0,0,2), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Birryde match the speeds of fighter jet planes and these Pokemon are often used by such people to practice with. They are extremely loyal and people compare this to a Pidgeot. Alas, they still have a nack for 'picking up' loose objects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.MOONLIGHT,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,38),
                        new MoveLearnSetEntry(Move.TAILWIND,43),
                        new MoveLearnSetEntry(Move.BLOCK,49),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,56),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,60),
                        new MoveLearnSetEntry(Move.MOONBLAST,65),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.PECK,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 53, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
