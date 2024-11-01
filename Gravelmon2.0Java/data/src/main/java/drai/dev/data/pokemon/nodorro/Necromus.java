package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Necromus extends drai.dev.data.pokemon.Pokemon {
    public Necromus() {
        super("Necromus",
                Type.FIRE, Type.FAIRY,
                new Stats(75,
                        70,
                        70,
                        132,
                        103,
                        90),
                List.of(Ability.BLAZE), Ability.LIMBER,
                18, 696,
                new Stats(0,0,0,3,0,0), 30,
                0.5,
                240, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Wondrous FlameSTAB Fire - Tail Whip Normal - Scratch Normal - Wondrous FlameSTAB Fire - EmberSTAB Fire - Charm Fairy - FlamethrowerSTAB Fire 5 Disarming VoiceSTAB Fairy 9 Baby-Doll Eyes Fairy 13 Fire SpinSTAB Fire 18 Encore Normal 22 Draining KissSTAB Fairy 26 Lucky Chant Normal 30 Firewall Fire 34 FlamethrowerSTAB Fire 38 FlamethrowerSTAB Fire 42 Dazzling GleamSTAB Fairy 48 Fire BlastSTAB Fire 55 MoonblastSTAB Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WONDROUSFLAME,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,9),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,13),
                        new MoveLearnSetEntry(Move.ENCORE,18),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,26),
                        new MoveLearnSetEntry(Move.FIREWALL,30),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,38),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,55),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FIREWALL,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Necromus");

    }


}
