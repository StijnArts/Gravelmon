package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MythianVolcarona extends Pokemon {
    public MythianVolcarona(int dexNo) {
        super(dexNo,"MythianVolcarona",
                Type.PSYCHIC, Type.FAIRY,
                new Stats(85,60,65,100,135,105),
                List.of(Ability.ADAPTABILITY, Ability.DAZZLING), Ability.MISTY_SURGE,
                16, 460,
                new Stats(0,0,0,0,3,0), 15,
                0.5,
                248, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Volcarona from Mythan have adapted to the rays ammitted from the moon at night, causing an outbreak of magical transformation once evolving."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,1),
                        new MoveLearnSetEntry(Move.FIERY_DANCE,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.PSYCHIC,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,1),
                        new MoveLearnSetEntry(Move.DOUBLE_EDGE,1),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.SCREECH,30),
                        new MoveLearnSetEntry(Move.AMNESIA,54),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,62),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,70),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,78),
                        new MoveLearnSetEntry(Move.STRING_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.HARDEN,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"egg")
                ),
                List.of(Label.GEN5,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 70, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Volcarona");
        this.setPortraitXYZ(0,1.8,0);
        this.setCanFly(true);
    }
}
