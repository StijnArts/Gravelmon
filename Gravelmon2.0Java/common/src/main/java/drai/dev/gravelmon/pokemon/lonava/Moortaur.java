package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Moortaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moortaur() {
        super("Moortaur",
                Type.NORMAL,Type.GROUND,
                new Stats(95,
                        110,
                        125,
                        35,
                        100,
                        35),
                List.of(Ability.INTIMIDATE), Ability.TRUANT,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These cumbersome and strong Pokémon roam the moors of Lonava. Their stubborn disposition has made their species impossible to domesticate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.STOMP,7),
                        new MoveLearnSetEntry(Move.SWAGGER,11),
                        new MoveLearnSetEntry(Move.MUD_BOMB,15),
                        new MoveLearnSetEntry(Move.FRUSTRATION,19),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.SLACK_OFF,27),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.SNARL,35),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,45),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moortaur");

    }


}
