package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Arugari extends Pokemon {
    public Arugari() {
        super( "Arugari",
                Type.ELECTRIC, Type.GROUND,
                new Stats(45	,50	,45	,60,	60	,40),
                List.of(Ability.SAND_FORCE), Ability.GALVANIZE,
                5, 172,
                new Stats(0,0,0,0,0,1), 160,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("Anoga", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"47")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1),
                        new MoveLearnSetEntry(Move.GRAVELBREATH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.EARTH_POWER,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,54),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,71),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BURROW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.MACH_BOLT,"tutor"),
                        new MoveLearnSetEntry(Move.CHROME_BALL,"tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tutor"),
                        new MoveLearnSetEntry(Move.TERRAFIRM,"tutor"),
                        new MoveLearnSetEntry(Move.SANDBLAST,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"egg"),
                        new MoveLearnSetEntry(Move.TERRAHEDRON,"egg"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"egg"),
                        new MoveLearnSetEntry(Move.PALEOBREATH,"egg"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"egg"),
                        new MoveLearnSetEntry(Move.SOIL_THROW,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.THIEF,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.STOMP,"egg"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"egg"),
                        new MoveLearnSetEntry(Move.ROAR,"egg"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
