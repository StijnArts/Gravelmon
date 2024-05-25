package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class MythianLarvesta extends Pokemon {
    public MythianLarvesta(int dexNo) {
        super(dexNo,"MythianLarvesta",
                Type.PSYCHIC, Type.FAIRY,
                new Stats(55, 85, 55, 60, 50, 55),
                List.of(Ability.ADAPTABILITY, Ability.DAZZLING), Ability.MISTY_SURGE,
                11, 288,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                72, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The moonlight is attracted by Larvesta and it stores it all inside its chest, waiting to evolve."),
                List.of(new EvolutionEntry("mythianvolcarona", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:pixie_dust")),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,6),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.PSYSHOCK,18),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,24),
                        new MoveLearnSetEntry(Move.CALM_MIND,30),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,42),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,48),
                        new MoveLearnSetEntry(Move.AMNESIA,54),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,60),
                        new MoveLearnSetEntry(Move.MOONBLAST,66),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 43, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Larvesta");
        this.setPortraitXYZ(0,1.8,0);
    }
}
