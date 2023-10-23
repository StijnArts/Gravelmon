package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hercurcules extends Pokemon {
    public Hercurcules() {
        super("Hercurcules",
                Type.BUG, Type.FIGHTING,
                new Stats(106, 140, 90, 60, 65, 34),
                List.of(Ability.SWARM, Ability.BATTLE_ARMOR), Ability.GUTS,
                18, 3280,
                new Stats(0,2,1,0,0,1), 45,
                0.5,
                260, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.BUG),
                List.of("It overcomes opponents with its huge body. It categorically refuses to battle against a Pokémon it doesn't deem worthy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.STORM_THROW,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,5),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.ARM_THRUST,16),
                        new MoveLearnSetEntry(Move.PROTECT,18),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,28),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.COUNTER,40),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,46),
                        new MoveLearnSetEntry(Move.MEGAHORN,52),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,58),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,64),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"egg"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"egg"),
                        new MoveLearnSetEntry(Move.STORM_THROW,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 54, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
