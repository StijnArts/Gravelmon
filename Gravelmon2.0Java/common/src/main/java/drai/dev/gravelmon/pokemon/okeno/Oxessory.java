package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Oxessory extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oxessory() {
        super("Oxessory",
                Type.GHOST,Type.PSYCHIC,
                new Stats(70,
                        66,
                        60,
                        80,
                        114,
                        75),
                List.of(Ability.RIVALRY), Ability.COMPETITIVE,
                15, 165,
                new Stats(0,0,1,0,1,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,30),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,16),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,19),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,21),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,26),
                        new MoveLearnSetEntry(Move.PURSUIT,30),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,35),
                        new MoveLearnSetEntry(Move.ROYALFLUSH,39),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,41),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,45),
                        new MoveLearnSetEntry(Move.PSIBULLET,48),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,50),
                        new MoveLearnSetEntry(Move.HAPPY_HOUR,53),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,55),
                        new MoveLearnSetEntry(Move.STORED_POWER,59)),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 7, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oxessory");

    }


}
