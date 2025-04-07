package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Thistance extends drai.dev.data.pokemon.Pokemon {
    public Thistance() {
        super("Thistance",
                Type.GRASS, Type.POISON,
                new Stats(73,
                        98,
                        90,
                        71,
                        80,
                        87),
                List.of(Ability.POISON_POINT), Ability.OWN_TEMPO,
                14, 312,
                new Stats(0,2,0,0,0,0), 60,
                0.0,
                156, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("- Scratch Normal - Poison StingSTAB Poison - Growth Normal - Needle ArmSTAB Grass - Pin Missile Bug - Fake Tears Dark 3 Leech Seed Grass 6 Razor LeafSTAB Grass 11 Acupressure Normal 16 Cross PoisonSTAB Poison 19 Slash Normal 23 Toxic Poison 28 Night Slash Dark 32 Leaf BladeSTAB Grass 36 Toxic Spikes Poison 41 Swords Dance Normal 44 Poison JabSTAB Poison 47 Power WhipSTAB Grass 50 Spiky Shield Grass 54 Facade Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,3),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,6),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,11),
                        new MoveLearnSetEntry(Move.CROSS_POISON,16),
                        new MoveLearnSetEntry(Move.SLASH,19),
                        new MoveLearnSetEntry(Move.TOXIC,23),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,28),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,32),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,41),
                        new MoveLearnSetEntry(Move.POISON_JAB,44),
                        new MoveLearnSetEntry(Move.POWER_WHIP,47),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,50),
                        new MoveLearnSetEntry(Move.FACADE,54),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Thistance");

    }


}
