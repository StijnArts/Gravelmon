package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bagarrough extends drai.dev.data.pokemon.Pokemon {
    public Bagarrough() {
        super("Bagarrough",
                Type.FIGHTING, Type.GROUND,
                new Stats(100,
                        125,
                        100,
                        55,
                        80,
                        80),
                List.of(Ability.DESERTBODY,Ability.OPPORTUNIST), Ability.MOXIE,
                20, 1051,
                new Stats(1,2,0,0,0,0), 45,
                0.5,
                247, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("After evolving, they spend most of their time teaching weak Pokémon new moves. Their headbands grow back, so when their body is torn after a fight, they use it to patch themselves up."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,7),
                        new MoveLearnSetEntry(Move.TAUNT,14),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,28),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,35),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,49),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,63),
                        new MoveLearnSetEntry(Move.ENDEAVOR,70),
                        new MoveLearnSetEntry(Move.MEGAHORN,77),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,84),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,91)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 47, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Bagarrough");

    }


}
