package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Encyst extends drai.dev.gravelmon.pokemon.Pokemon {
    public Encyst() {
        super("Encyst",
                Type.BUG,Type.GHOST,
                new Stats(25,
                        30,
                        20,
                        75,
                        75,
                        60),
                List.of(Ability.UNNERVE,Ability.LEVITATE,Ability.POWERLEECH), Ability.POWERLEECH,
                8, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.BUG),
                List.of("It can't survive long without a host, so seeing one in the wild is rare. Their eggs are laid under the skin of Probee and goomyroast."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,16),
                        new MoveLearnSetEntry(Move.INGRAIN,20),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,24),
                        new MoveLearnSetEntry(Move.INFESTATION,28),
                        new MoveLearnSetEntry(Move.PROTECT,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,44),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Encyst");

    }


}
