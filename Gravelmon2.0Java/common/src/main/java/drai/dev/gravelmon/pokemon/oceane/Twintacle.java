package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Twintacle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twintacle() {
        super("Twintacle",
                Type.FIGHTING,
                new Stats(45,
                        36,
                        56,
                        45,
                        62,
                        46),
                List.of(Ability.HYDRATION), Ability.REGENERATOR,
                3, 165,
                new Stats(0,0,0,1,0,1), 100,
                0.0,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Due to their lack of limbs, Twintacle use their powerful twin-tails in battle. Whipping them around, they can knock out opponents either with the twin-tails themselves or using its body as a flail."),
                List.of(new EvolutionEntry("undallure", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
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
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm")                         ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
