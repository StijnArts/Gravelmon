package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scovile extends Pokemon {
    public Scovile() {
        super("Scovile",
                Type.GRASS, Type.FIRE,
                new Stats(90, 65, 75, 100, 75, 110),
                List.of(Ability.FLAME_BODY), Ability.DROUGHT,
                14, 414,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                179, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.GRASS, EggGroup.DRAGON),
                List.of("The color of its tail is indicative of its body temperature and its actual mood. If it rampages, it will burn everything down."),
                List.of(new EvolutionEntry("scovilex", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:inductive_ring")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.TAUNT,4),
                        new MoveLearnSetEntry(Move.INCINERATE,8),
                        new MoveLearnSetEntry(Move.RAGE,12),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,16),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.FLAME_BURST,24),
                        new MoveLearnSetEntry(Move.TORMENT,28),
                        new MoveLearnSetEntry(Move.SEED_BOMB,32),
                        new MoveLearnSetEntry(Move.SCARY_FACE,36),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,44),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,48),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,52),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm")
                ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

        
        this.setBaseScale(0.8);
        this.setHitbox(1,0.7);
        getSpeciesFileData().addBasicVariation("Roggerregoat");
        getPosingFileData().setPortraitData( 1f, new Vector3(0, 1.4, 0));
        getPosingFileData().setProfileData( .5f, new Vector3(0, 1.1, 0));
        getPosingFileData().head = "Head";
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().setStatic()
        ));
    }
}
