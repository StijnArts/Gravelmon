package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Sleepnir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sleepnir() {
        super("Sleepnir",
                Type.FIGHTING, Type.NORMAL,
                new Stats(70,
                        90,
                        75,
                        90,
                        85,
                        90),
                List.of(Ability.STAMINA,Ability.SCRAPPY,Ability.ZEN_MODE), Ability.ZEN_MODE,
                21, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hypnotizing its foes with a determined glare, Sleepnir may cast unusual spells onto any opponent. An old man once witnessed this stock Pokemon walking around with eight legs. Perhaps it was due to its swift hooves?"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.DUST_KICK,1),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.FAKE_OUT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,14),
                        new MoveLearnSetEntry(Move.SCREECH,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,22),
                        new MoveLearnSetEntry(Move.TAUNT,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,32),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,44),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,50),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,55),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,61),
                        new MoveLearnSetEntry(Move.REVERSAL,65)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 35, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sleepnir");

    }


}
