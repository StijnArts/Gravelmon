package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianDodrio extends Pokemon {
    public HoennianDodrio(String name, Aspect aspect) {
        super(name, aspect,"HoennianDodrio",
                Type.FLYING, Type.GROUND,
                new Stats(80, 110, 85, 135, 50, 60),
                List.of(Ability.INTIMIDATE), Ability.PRESSURE,
                18, 882,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.AMORPHOUS, EggGroup.MONSTER),
                List.of("Its middle head dominates the other two, issuing orders as it sees fit. They often travel alongside wild Marowak when hunting for prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.UPROAR,13),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,21),
                        new MoveLearnSetEntry(Move.THRASH,25),
                        new MoveLearnSetEntry(Move.BONE_RUSH,32),
                        new MoveLearnSetEntry(Move.DRILL_PECK,40),
                        new MoveLearnSetEntry(Move.WICKED_LASH,48),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg")
                ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                4, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Dodrio");
        this.setPreEvolution("Doduo");


        this.setBaseScale(1.6);
        this.setHitbox(0.6,1.6);
        addAdditionalEvolution("doduo", new EvolutionEntry("dodrio hoennian", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"marowak"))));

        getSpeciesFileData().addBasicVariation("PorousMist");
        getPosingFileData().setAnimationFileName("dodrio_hoennian");
        getPosingFileData().setPortraitData(1.3f, new Vector3(-0.1, .9, 0));
        getPosingFileData().setProfileData(0.4f, new Vector3(0.0, 0.6, 0.0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation()
        ));
        getPosingFileData().setCryFromAnimationType("q.bedrock_stateful");
    }
}
