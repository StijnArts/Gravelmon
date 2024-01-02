package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Drosabell extends Pokemon {
    public Drosabell() {
        super("Drosabell",
                Type.GRASS,
                new Stats(85, 80, 70, 100, 80, 35),
                List.of(Ability.FLYTRAP, Ability.TRIAGE), Ability.EFFECT_SPORE,
                10, 64,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Kaskadian Bellsprout who study on Spectoul Mountain awaken their true psychic abilities, evolving into Drosabell. They can force their presence into any creatures mind, normally using this ability to eat any weak pokemon around."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.WRAP,11),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,13),
                        new MoveLearnSetEntry(Move.POISON_POWDER,15),
                        new MoveLearnSetEntry(Move.STUN_SPORE,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,23),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,27),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,29),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,35),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,39),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,41),
                        new MoveLearnSetEntry(Move.SLAM,47),
                        new MoveLearnSetEntry(Move.POWER_WHIP,52),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.INGRAIN,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 50, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_ARID, Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
