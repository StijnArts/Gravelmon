package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Mylili extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mylili(Stats stats) {
        super("Mylili",
                Type.GHOST, Type.DARK,
                stats,
                List.of(Ability.CURSED_BODY), Ability.SHADOW_TAG,
                9, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The ghost of an abandoned child in the forest. Mylili's eerie wailing keeps humans and Pokemon alike out of the woods. Its stare gives the creeps. None knows what it is thinking."),
                List.of(),
                List.of(               new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,1),
                        new MoveLearnSetEntry(Move.PURSUIT,5),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,9),
                        new MoveLearnSetEntry(Move.CURSE,15),
                        new MoveLearnSetEntry(Move.SOUL_BREAK,19),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,23),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,29),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,33),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.CORNER,38),
                        new MoveLearnSetEntry(Move.VENGEANCE,45),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,55),
                        new MoveLearnSetEntry(Move.POSSESS,62)         ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mylili");

    }


}
