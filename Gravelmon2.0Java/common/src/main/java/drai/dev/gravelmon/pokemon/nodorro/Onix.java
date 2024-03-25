package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Onix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Onix() {
        super("Onix",
                Type.ROCK,Type.ELECTRIC,
                new Stats(35,
                        30,
                        120,
                        75,
                        75,
                        50),
                List.of(Ability.STURDY,Ability.VOLT_ABSORB), Ability.MAGNET_PULL,
                90, 2990,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Bind Normal - Harden Normal - Tackle Normal 4 Thunder ShockSTAB Electric 9 Rock ThrowSTAB Rock 11 SparkSTAB Electric 14 Rock Polish Rock 17 Thunder FangSTAB Electric 24 Rock SlideSTAB Rock 27 Iron Tail Steel 30 Stealth Rock Rock 36 DischargeSTAB Electric 43 Earthquake Ground 55 Rock WreckerSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,9),
                        new MoveLearnSetEntry(Move.SPARK,11),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,14),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,17),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.IRON_TAIL,27),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,36),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,55)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Onix");

    }


}
