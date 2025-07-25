package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianShuckle extends Pokemon {
    public HoennianShuckle(String name, Aspect aspect) {
        super(name, aspect,"HoennianShuckle",
                Type.GRASS, Type.ROCK,
                new Stats(40, 10,220,10,220,5),
                List.of(Ability.EFFECT_SPORE), Ability.SOLID_ROCK,
                6, 205,
                new Stats(0,0,1,0,1,0), 190,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("A Shuckle hides under rocks, keeping its body concealed inside its shell while eating stored berries. The berries mix with its body fluids to become juice."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.SNATCH,1),
                        new MoveLearnSetEntry(Move.WRAP,9),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,14),
                        new MoveLearnSetEntry(Move.INGRAIN,23),
                        new MoveLearnSetEntry(Move.YAWN,28),
                        new MoveLearnSetEntry(Move.LEECH_SEED,37),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"egg")
                ),
                List.of(Label.GEN2,Label.BLAZING_EMERALD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Shuckle");
        
        this.setHitbox(1,1);
        this.setBaseScale(0.6);
        this.setNeedsRemodel("Updated model in cobblemon model repo");
        getSpeciesFileData().addBasicVariation("PorousMist");
        getPosingFileData().setAnimationFileName("hoennianshuckle");
        getPosingFileData().setPortraitData( 2.2f, new Vector3(-0.45, 0.35, 0.0));
        getPosingFileData().setProfileData( 0.6f, new Vector3(0.0, 0.8, 0.0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.emptyAnimation()
        ));
    }
}
