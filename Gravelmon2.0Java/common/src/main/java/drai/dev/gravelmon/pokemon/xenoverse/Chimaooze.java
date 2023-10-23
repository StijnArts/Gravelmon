package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Chimaooze extends Pokemon {
    public Chimaooze() {
        super("Chimaooze",
                Type.POISON, Type.GROUND,
                new Stats(45, 20, 30, 25, 35, 20),
                List.of(Ability.DIRTY_POOL), Ability.DIRTY_POOL,
                3, 1,
                new Stats(1,0,0,0,0,0), 60,
                0.5,
                63, ExperienceGroup.FAST,
                70,
                32, List.of(EggGroup.AMORPHOUS, EggGroup.WATER_3),
                List.of("The most polluted areas of cities are infested by Chimaooze. When they senses danger, they team up together to eliminate the threat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.HELPING_HAND,10),
                        new MoveLearnSetEntry(Move.SLUDGE,14),
                        new MoveLearnSetEntry(Move.MUD_SHOT,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,25),
                        new MoveLearnSetEntry(Move.STOCKPILE,29),
                        new MoveLearnSetEntry(Move.SWALLOW,29),
                        new MoveLearnSetEntry(Move.SPIT_UP,29),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,33),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.RECOVER,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"egg"),
                        new MoveLearnSetEntry(Move.MINIMIZE,"egg"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 18, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
