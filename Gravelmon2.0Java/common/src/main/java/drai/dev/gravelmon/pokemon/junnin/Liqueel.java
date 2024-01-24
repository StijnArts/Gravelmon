package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Liqueel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Liqueel() {
        super("Liqueel",
                Type.WATER,
                new Stats(58,
                        49,
                        49,
                        56,
                        58,
                        40),
                List.of(Ability.TORRENT), Ability.VOLT_ABSORB,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
                List.of("Liqueel's long tail whips through the water as it swims, making it very fast. Some Liqueel use their tails to fight while trying to protect others."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.WRAP,10),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,22),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,29),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,34),
                        new MoveLearnSetEntry(Move.COIL,37),
                        new MoveLearnSetEntry(Move.WRING_OUT,42),
                        new MoveLearnSetEntry(Move.ENDEAVOR,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,51),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Liqueel");

    }


}
