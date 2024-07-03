package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Lanidos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lanidos() {
        super("Lanidos",
                Type.BUG, Type.FAIRY,
                new Stats(70,
                        40,
                        70,
                        60,
                        70,
                        90),
                List.of(Ability.SWARM,Ability.CUTE_CHARM,Ability.FUR_COAT), Ability.FUR_COAT,
                14, 165,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                147, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("An advantage of Lanidos' slim body is being able to swiftly catch prey without having to restrain it with threads. The thick fur covering its body absorbs hard-hitting blows."),
                List.of(),
                List.of(
                new MoveLearnSetEntry(Move.ABSORB,1),
                new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                new MoveLearnSetEntry(Move.STUN_SPORE,6),
                new MoveLearnSetEntry(Move.SWEET_SCENT,12),
                new MoveLearnSetEntry(Move.DRAINING_KISS,18),
                new MoveLearnSetEntry(Move.STRUGGLE_BUG,24),
                new MoveLearnSetEntry(Move.COVET,30),
                new MoveLearnSetEntry(Move.SWITCHEROO,36),
                new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                new MoveLearnSetEntry(Move.QUIVER_DANCE,54),
                new MoveLearnSetEntry(Move.AROMATIC_MIST,"egg"),
                new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                new MoveLearnSetEntry(Move.STICKY_WEB,"egg"),
                new MoveLearnSetEntry(Move.CHARM,"tm"),
                new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                new MoveLearnSetEntry(Move.THIEF,"tm"),
                new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                new MoveLearnSetEntry(Move.POUNCE,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.SWIFT,"tm"),
                new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                new MoveLearnSetEntry(Move.ENDURE,"tm"),
                new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                new MoveLearnSetEntry(Move.UTURN,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.REFLECT,"tm"),
                new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                new MoveLearnSetEntry(Move.TRICK,"tm"),
                new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                new MoveLearnSetEntry(Move.BUG_BITE,"tm")
        ),
                List.of(Label.ARISTOS),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 44, 1, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                new SpawnCondition(SpawnConditionType.IS_RAINING,"false")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lanidos");

    }


}
