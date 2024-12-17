package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Unirin extends drai.dev.data.pokemon.Pokemon {
    public Unirin() {
        super("Unirin",
                Type.FAIRY,Type.DRAGON,
                new Stats(90,
                        131,
                        70,
                        124,
                        80,
                        105),
                List.of(Ability.FOREWARN), Ability.WONDER_SKIN,
                15, 552,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                243, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Unirin bring peace and prosperity wherever they go. Legends say it can only be tamed by those of pure heart and virtue."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,7),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.AGILITY,16),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,26),
                        new MoveLearnSetEntry(Move.BOUNCE,32),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,37),
                        new MoveLearnSetEntry(Move.MOONBLAST,44),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,52),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,61),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Unirin");

    }


}
