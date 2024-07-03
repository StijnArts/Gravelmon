package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Camofirma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Camofirma() {
        super("Camofirma",
                Type.GROUND, Type.DRAGON,
                new Stats(93,
                        71,
                        122,
                        89,
                        87,
                        53),
                List.of(Ability.BATTLE_ARMOR,Ability.OVERCOAT,Ability.STAMINA), Ability.STAMINA,
                20, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Camofirma's large body is sturdy and tough, able to withstand many blows while in the midst of battle. Be it during a terrible blizzard or a blistering sandstorm, the hut on Camofirma's back provides the utmost comfort."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,2),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,15),
                        new MoveLearnSetEntry(Move.BESTOW,19),
                        new MoveLearnSetEntry(Move.MUD_BOMB,23),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,28),
                        new MoveLearnSetEntry(Move.SLAM,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,34),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,43),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,47),
                        new MoveLearnSetEntry(Move.BULK_UP,52),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.OUTRAGE,62)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Camofirma");

    }


}
