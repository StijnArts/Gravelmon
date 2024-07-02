package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranNumel extends Pokemon {
    public CefiranNumel(String name, Aspect aspect) {
        super(name, aspect,"CefiranNumel",
                Type.FIRE, Type.WATER,
                new Stats(60,60,40,35,65,45),
                List.of(Ability.SHEER_FORCE), Ability.OWN_TEMPO,
                7, 240,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("CefiranCamerupt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.EMBER, 5),
                        new MoveLearnSetEntry(Move.WATER_GUN, 8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 12),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 15),
                        new MoveLearnSetEntry(Move.AMNESIA, 19),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 22),
                        new MoveLearnSetEntry(Move.SCALD, 26),
                        new MoveLearnSetEntry(Move.CURSE, 29),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 31),
                        new MoveLearnSetEntry(Move.YAWN, 36),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 43),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION, 47),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "egg"),
                        new MoveLearnSetEntry(Move.HOWL, "egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "egg"),
                        new MoveLearnSetEntry(Move.MUD_BOMB, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP, "egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE, "egg"),
                        new MoveLearnSetEntry(Move.STOMP, "egg"),
                        new MoveLearnSetEntry(Move.SWALLOW, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 30, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Numel");
    }
}
