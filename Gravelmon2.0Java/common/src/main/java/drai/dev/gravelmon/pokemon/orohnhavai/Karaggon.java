package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Karaggon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Karaggon() {
        super("Karaggon",
                Type.DRAGON, Type.STEEL,
                new Stats(73,
                        90,
                        93,
                        65,
                        65,
                        44),
                List.of(Ability.RIVALRY,Ability.BATTLE_ARMOR,Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,1,1,0,0,0), 60,
                0.667,
                151, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("With its powerful limbs it developed upon evolving, it launches itself like a cannon ball at their foes. Very little can get past their sturdy shells."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,6),
                        new MoveLearnSetEntry(Move.METAL_SOUND,10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,14),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.ROAR,23),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,28),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,33),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,43),
                        new MoveLearnSetEntry(Move.CRUNCH,48),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,53),
                        new MoveLearnSetEntry(Move.OUTRAGE,58),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Karaggon");

    }


}
