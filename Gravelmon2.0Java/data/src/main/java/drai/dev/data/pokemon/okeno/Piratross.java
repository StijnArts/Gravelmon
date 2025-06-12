package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Piratross extends drai.dev.data.pokemon.Pokemon {
    public Piratross() {
        super("Piratross",
                Type.DARK, Type.FLYING,
                new Stats(62,
                        79,
                        50,
                        60,
                        45,
                        80),
                List.of(Ability.SUPER_LUCK,Ability.SNIPER,Ability.PICKPOCKET), Ability.PICKPOCKET,
                7, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                128, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Although menacing, Piratross cannot hunt for themselves. Instead, they steal food caught by other Pokemon, trying to scare them with screeches and then battling if necessary."),
                List.of(new EvolutionEntry("albagross", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.HAZE,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.SCREECH,15),
                        new MoveLearnSetEntry(Move.PLUCK,18),
                        new MoveLearnSetEntry(Move.PURSUIT,23),
                        new MoveLearnSetEntry(Move.SWAGGER,27),
                        new MoveLearnSetEntry(Move.BRINE,32),
                        new MoveLearnSetEntry(Move.TORMENT,36),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,41),
                        new MoveLearnSetEntry(Move.SNATCH,46),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,50),
                        new MoveLearnSetEntry(Move.SWITCHEROO,55),
                        new MoveLearnSetEntry(Move.DRILL_PECK,60),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
        setCanFly(true);

    }


}
