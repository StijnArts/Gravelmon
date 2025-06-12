package drai.dev.data.pokemon.daybreak.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmiranHippopotas extends Pokemon {
    public ArmiranHippopotas(String name, Aspect aspect) {
        super(name, aspect,"ArmiranHippopotas",
                Type.WATER,
                new Stats(68, 38, 42, 72, 78, 62),
                List.of(Ability.STRONG_JAW,Ability.DRIZZLE), Ability.SWIFT_SWIM,
                8, 495,
                new Stats(0,0,1,0,0,0), 140,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It enshrouds itself with water to protect itself from germs. It does not enjoy being dry."),
                List.of(new EvolutionEntry("Armiranhippowdon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.YAWN,13),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,19),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,19),
                        new MoveLearnSetEntry(Move.AQUA_RING,25),
                        new MoveLearnSetEntry(Move.CRUNCH,31),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.SLACK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tutor"),
                        new MoveLearnSetEntry(Move.SCALD,"tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN4,Label.DAYBREAK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST, Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Hippopotas");
        setCanBreathUnderwater(true);
        setCanSwim(true);
    }
}
