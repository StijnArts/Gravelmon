package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Baneep extends drai.dev.data.pokemon.Pokemon {
    public Baneep() {
        super("Baneep",
                Type.GRASS,
                new Stats(45,
                        50,
                        43,
                        55,
                        52,
                        65),
                List.of(Ability.OVERGROW), Ability.HARVEST,
                4, 165,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of("Baneep prefer to live in thick canopies, protected from wind. They are a very affectionate species, doting and caring for one another."),
                List.of(new EvolutionEntry("bannawk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHIRP,5),
                        new MoveLearnSetEntry(Move.SEEDSHOT,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,19),
                        new MoveLearnSetEntry(Move.WING_ATTACK,22),
                        new MoveLearnSetEntry(Move.BANANARANG,25),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,34),
                        new MoveLearnSetEntry(Move.CHARM,37),
                        new MoveLearnSetEntry(Move.SEED_BOMB,41),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,45),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,49),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,53),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Baneep");
setCanFly(true);
    }


}
