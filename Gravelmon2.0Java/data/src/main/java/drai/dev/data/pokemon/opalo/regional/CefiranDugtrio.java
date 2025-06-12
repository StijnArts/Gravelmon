package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranDugtrio extends Pokemon {
    public CefiranDugtrio(String name, Aspect aspect) {
        super(name, aspect,"CefiranDugtrio",
                Type.GROUND , Type.FLYING,
                new Stats(55,50,70,120,100,70),
                List.of(Ability.ANTICIPATION), Ability.SAND_FORCE,
                7, 333,
                new Stats(0,0,0,2,0,0), 50,
                0.5,
                149, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 7),
                        new MoveLearnSetEntry(Move.MUDSLAP, 12),
                        new MoveLearnSetEntry(Move.MAGNITUDE, 15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, 18),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, 23),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 26),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 28),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 33),
                        new MoveLearnSetEntry(Move.FURY_TOTEM, 40),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 45),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 50),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 57),

                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.ASTONISH, "egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.RETURN, "egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.MEMENTO, "egg"),
                        new MoveLearnSetEntry(Move.MUD_BOMB, "egg"),
                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.REVERSAL, "egg"),
                        new MoveLearnSetEntry(Move.SCREECH, "egg"),
                        new MoveLearnSetEntry(Move.UPROAR, "egg")
                ),
                List.of(Label.GEN1,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 45, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Dugtrio");
    }
}
