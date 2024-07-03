package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Queendra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Queendra(Stats stats) {
        super("Queendra",
                Type.DRAGON,
                stats,
                List.of(Ability.SWIFT_SWIM,Ability.SNIPER,Ability.OUTBURST), Ability.OUTBURST,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,15),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,33),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,39),
                        new MoveLearnSetEntry(Move.SAFEGUARD,46),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,53),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,60),
                        new MoveLearnSetEntry(Move.OUTRAGE,67),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,74)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 45, 58, .18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Queendra");
        setCanSwim(true);
        setAvoidsLand(true);
        setCanBreathUnderwater(true);

    }


}
