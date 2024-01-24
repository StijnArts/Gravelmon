package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Seel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seel() {
        super("Seel",
                Type.WATER,Type.GRASS,
                new Stats(65,
                        45,
                        70,
                        45,
                        55,
                        45),
                List.of(Ability.WATER_BUBBLE), Ability.WATER_BUBBLE,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("In the Qamor Region, Seel have adapted to living in the warm, humid wetlands to the east. Their diet now mostly composes of sea grass, and they are such slow swimmers that they often get themselves covered in moss and algae."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,11),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,17),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.LIFE_DEW,23),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.AQUA_JET,31),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.DIVE,41),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,43),
                        new MoveLearnSetEntry(Move.SOAK,47),
                        new MoveLearnSetEntry(Move.SAFEGUARD,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,53),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Seel");

    }


}
