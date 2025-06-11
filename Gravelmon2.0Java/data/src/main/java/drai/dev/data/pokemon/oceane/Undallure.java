package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Undallure extends drai.dev.data.pokemon.Pokemon {
    public Undallure() {
        super("Undallure",
                Type.FIGHTING,
                new Stats(82,
                        72,
                        69,
                        92,
                        84,
                        90),
                List.of(Ability.HYDRATION), Ability.REGENERATOR,
                13, 165,
                new Stats(0,0,0,2,0,0), 55,
                0.0,
                171, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Undallure are springy and love to cheer on their teammates while they battle. Their head has tendrils that can hold Pokemon in place using sticky goo they excrete, and can even extend to whip them at others."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CELEBRATE,1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,16),
                        new MoveLearnSetEntry(Move.ACROBATICS,20),
                        new MoveLearnSetEntry(Move.ENCORE,23),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,27),
                        new MoveLearnSetEntry(Move.UTURN,32),
                        new MoveLearnSetEntry(Move.JUMP_KICK,36),
                        new MoveLearnSetEntry(Move.AQUA_RING,39),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,42),
                        new MoveLearnSetEntry(Move.WARDANCE,46),
                        new MoveLearnSetEntry(Move.INSTRUCT,50),
                        new MoveLearnSetEntry(Move.POWER_WHIP,55),
                        new MoveLearnSetEntry(Move.ME_FIRST,60),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
