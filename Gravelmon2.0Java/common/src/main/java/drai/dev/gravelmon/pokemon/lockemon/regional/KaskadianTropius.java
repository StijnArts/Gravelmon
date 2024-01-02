package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class KaskadianTropius extends Pokemon {
    public KaskadianTropius(int dexNo) {
        super(dexNo,"KaskadianTropius",
                Type.GRASS, Type.GROUND,
                new Stats(110, 75, 110, 55, 90, 20),
                List.of(Ability.ROOT_CONTROL, Ability.ARENA_TRAP), Ability.HARVEST,
                40, 1600,
                new Stats(2,0,0,0,0,0), 200,
                0.5,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.GRASS, EggGroup.MONSTER),
                List.of("Tropius thrives in Kaskade's ever-changing weather because the ground in which it roots is rich in nutrients. They are quiet pokemon, but when furious, their roots transform into powerful weapons that can swiftly overwhelm enemies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.LEAF_STORM,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,6),
                        new MoveLearnSetEntry(Move.STOMP,10),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,30),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.OUTRAGE,46),
                        new MoveLearnSetEntry(Move.SYNTHESIS,50),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,56),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.SLAM,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.LOCKEMON, Label.GEN3),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OLD_GROWTH_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Tropius");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
