package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lunartic extends drai.dev.data.pokemon.Pokemon {
    public Lunartic() {
        super("Lunartic",
                Type.FAIRY,
                new Stats(75,
                        100,
                        60,
                        75,
                        60,
                        75),
                List.of(Ability.UNNERVE,Ability.TOUGH_CLAWS,Ability.PIXILATE), Ability.PIXILATE,
                15, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Its appearance underneath its cloak is distressing to the point of causing insanity if viewed for too long. You can tell a Lunartic's age through the velvet on its arm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,12),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,19),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,26),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,32),
                        new MoveLearnSetEntry(Move.MOONLIGHT,36),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,41),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,46),
                        new MoveLearnSetEntry(Move.FREEZING_GLARE,55)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 52, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lunartic");

    }


}
