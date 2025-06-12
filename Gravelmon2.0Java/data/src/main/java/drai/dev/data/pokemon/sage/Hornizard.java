package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hornizard extends Pokemon {
    public Hornizard() {
        super("Hornizard",
                Type.POISON,
                new Stats(80, 85, 90, 55, 55, 40),
                List.of(Ability.POISON_POINT, Ability.CONDITIONING), Ability.ROUGH_SKIN,
                11, 573,
                new Stats(0,1,1,0,0,0), 60,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                62, List.of(EggGroup.MONSTER),
                List.of("Hornizard’s spines contain a potent venom, while its skin secretes an acidic compound. Due to these defenses, it has almost no natural predators."),
                List.of(new EvolutionEntry("ankillosore", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.ANCIENT_POWER.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POISON_STING,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,17),
                        new MoveLearnSetEntry(Move.MUD_BOMB,20),
                        new MoveLearnSetEntry(Move.POISON_TAIL,23),
                        new MoveLearnSetEntry(Move.BULLDOZE,27),
                        new MoveLearnSetEntry(Move.SCARY_FACE,31),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,35),
                        new MoveLearnSetEntry(Move.BRACE,40),
                        new MoveLearnSetEntry(Move.BODY_SLAM,44),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,48),
                        new MoveLearnSetEntry(Move.POISON_JAB,53),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.CURSE,61),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,66),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",90, 1,2)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        
    }
}
