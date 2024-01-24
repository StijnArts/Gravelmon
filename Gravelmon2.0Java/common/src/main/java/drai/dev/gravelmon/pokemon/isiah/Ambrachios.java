package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ambrachios extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ambrachios() {
        super("Ambrachios",
                Type.ROCK,Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STATIC), Ability.STATIC,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("- Tackle Normal - Tail Whip Normal - Thunder Wave Electric - Charge BeamSTAB Electric 7 Thunder Wave Electric 13 Charge BeamSTAB Electric 19 Rock ThrowSTAB Rock 25 Endure Normal 31 Ancient PowerSTAB Rock 37 Take Down Normal 40 Stomp Normal 46 Roar Normal 55 Power GemSTAB Rock 67 Screech Normal 73 Double-Edge Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,19),
                        new MoveLearnSetEntry(Move.ENDURE,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.STOMP,40),
                        new MoveLearnSetEntry(Move.ROAR,46),
                        new MoveLearnSetEntry(Move.POWER_GEM,55),
                        new MoveLearnSetEntry(Move.SCREECH,67),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,73)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ambrachios");

    }


}
