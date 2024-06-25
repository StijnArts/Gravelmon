package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class MythianZorua extends Pokemon {
    public MythianZorua(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"MythianZorua",
                Type.FIRE,
                new Stats(35, 60, 40, 85, 40, 70),
                List.of(Ability.ILLUSION), Ability.FLAME_BODY,
                7, 38,
                new Stats(0,0,0,1,0,0), 75,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Due to the overwhelming heat of the Mythan Desert, Zorua tried to seek shelter within the Catacombs of the Mythan Desert, eventually changing form."),
                List.of(new EvolutionEntry("MythianZoroark", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TORMENT,4),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,12),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.FIRE_FANG,24),
                        new MoveLearnSetEntry(Move.OVERHEAT,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.IMPRISON,36),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,40),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,44),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,48),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg")
                ),
                List.of(Label.GEN5,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 25, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_VOLCANIC, Biome.IS_NETHER_SOUL_FIRE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Zorua");
        this.setPortraitXYZ(0,1.8,0);
    }
}
