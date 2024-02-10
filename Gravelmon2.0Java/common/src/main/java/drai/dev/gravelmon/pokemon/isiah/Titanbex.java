package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Titanbex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Titanbex() {
        super("Titanbex",
                Type.STEEL,
                new Stats(85,
                        87,
                        73,
                        62,
                        76,
                        82),
                List.of(Ability.LIMBER), Ability.RECKLESS,
                14, 165,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                163, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Snore Normal Iron HeadSTAB Steel Charge Beam Electric Electro Ball Electric Thunder Wave Electric Wild Charge Electric Body Press Fighting Solid Kick Fighting Bulldoze Ground Earthquake Ground Landslide Ground Attract Normal Body Slam Normal Confide Normal Facade Normal Frustration Normal Giga Impact Normal Headbutt Normal Hidden Power Normal Hyper Beam Normal Protect Normal Return Normal Sleep Talk Normal Substitute Normal Work Up Normal Toxic Poison Rest Psychic Zen Headbutt Psychic Sandstorm Rock Bolt InSTAB Steel Heavy SlamSTAB Steel Iron TailSTAB Steel"),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,7),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56),
        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.SOLIDKICK,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Titanbex");

    }


}
