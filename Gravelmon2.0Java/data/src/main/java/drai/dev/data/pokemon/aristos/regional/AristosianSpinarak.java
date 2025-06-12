package drai.dev.data.pokemon.aristos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class AristosianSpinarak extends drai.dev.data.pokemon.Pokemon {
    public AristosianSpinarak(String name, Aspect aspect) {
        super(name, aspect,"AristosianSpinarak",
                Type.BUG, Type.FAIRY,
                new Stats(40,
                        30,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.SWARM,Ability.CUTE_CHARM,Ability.FUR_COAT), Ability.FUR_COAT,
                4, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its body is covered with thick white fur. Spinarak hides inside it, only leaving its sparkling eyes out to attract prey close."),
                List.of(new EvolutionEntry("lanidos", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .isNotRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Spinarak");

    }


}
