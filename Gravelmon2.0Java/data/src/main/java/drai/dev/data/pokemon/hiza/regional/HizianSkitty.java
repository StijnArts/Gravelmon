package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianSkitty extends drai.dev.data.pokemon.Pokemon {
    public HizianSkitty(String name, Aspect aspect) {
        super(name, aspect, "Skitty",
                Type.FAIRY,
                new Stats(50,
                        45,
                        45,
                        35,
                        35,
                        50),
                List.of(Ability.FLUFFY), Ability.FLUFFY,
                6, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.25,
                52, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("They are extremely playful and full of energy, once all that energy is burned they fall asleep for many hours."),
                List.of(new EvolutionEntry("HizianDelcatty", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,3),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,9),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,12),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,15),
                        new MoveLearnSetEntry(Move.ROUND,18),
                        new MoveLearnSetEntry(Move.STRING_SHOT,21),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,24),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,27),
                        new MoveLearnSetEntry(Move.WISH,30),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,33),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ENDEAVOR,39),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.COPYCAT,"egg"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm")
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Skitty");

    }


}
