package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sectalamp extends drai.dev.data.pokemon.Pokemon {
    public Sectalamp() {
        super("Sectalamp",
                Type.BUG, Type.ELECTRIC,
                new Stats(105,
                        55,
                        60,
                        93,
                        90,
                        52),
                List.of(Ability.ILLUMINATE), Ability.SWARM,
                21, 0,
                new Stats(2,0,0,1,0,0), 60,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Iron Defense Steel - Eerie Impulse Electric - Struggle BugSTAB Bug - Signal BeamSTAB Bug - Protect Normal - Flash Normal - Light Screen Psychic 3 Thunder ShockSTAB Electric 20 LungeSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,3),
                        new MoveLearnSetEntry(Move.LUNGE,20)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sectalamp");

    }


}
