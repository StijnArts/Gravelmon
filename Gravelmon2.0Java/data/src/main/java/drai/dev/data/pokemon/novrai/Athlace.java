package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Athlace extends drai.dev.data.pokemon.Pokemon {
    public Athlace() {
        super("Athlace",
                Type.FIGHTING, Type.GROUND,
                new Stats(41,
                        67,
                        55,
                        25,
                        37,
                        62),
                List.of(Ability.QUICK_FEET,Ability.MOXIE,Ability.RECEIVER), Ability.RECEIVER,
                2, 165,
                new Stats(0,1,0,0,0,0), 230,
                0.75,
                58, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It bashes its head against rocks and boulders to toughen itself up. To relax, it splashes around in mud puddles with others of its kind."),
                List.of(new EvolutionEntry("athcleat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"190")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,11),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,15),
                        new MoveLearnSetEntry(Move.MUD_BOMB,17),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,21),
                        new MoveLearnSetEntry(Move.STOMP,25),
                        new MoveLearnSetEntry(Move.COACHING,27),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,31),
                        new MoveLearnSetEntry(Move.SOLIDKICK,35),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.JUMP_KICK,41),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,45),
                        new MoveLearnSetEntry(Move.MEGA_KICK,47),
                        new MoveLearnSetEntry(Move.COUNTER,51),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,55),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_THROW,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Athlace");

    }


}
