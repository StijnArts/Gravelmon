package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Esoterra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Esoterra() {
        super("Esoterra",
                Type.GROUND, Type.PSYCHIC,
                new Stats(120,
                        60,
                        140,
                        200,
                        140,
                        20),
                List.of(Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                45, 10000,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                288, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Esoterra can link itself to the planet and draw energy from its surroundings by drilling itself into the floor. This energy can be used as an attacking mechanism, firing lasers from the jewel on its head."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,7),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,10),
                        new MoveLearnSetEntry(Move.TACKLE,13),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,16),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.PSYCHIC,25),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,31),
                        new MoveLearnSetEntry(Move.METEOR_MASH,34),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,37),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,40),
                        new MoveLearnSetEntry(Move.EARTH_POWER,43),
                        new MoveLearnSetEntry(Move.FISSURE,46),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,49)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Esoterra");

    }


}
