package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoTrubbish extends Pokemon {
    public EghoTrubbish(String name, Aspect aspect) {
        super(name, aspect,"EghoTrubbish",
                Type.POISON, Type.STEEL,
                new Stats(50, 40, 72, 60, 62, 45),
                List.of(Ability.BATTLE_ARMOR), Ability.FILTER,
                6, 430,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("As a result of urban clean-up initiatives, many Trubbish were mistakenly thrown into garbage cans. Being too weak to escape, they instead repurpose the cans as armor."),
                List.of(new EvolutionEntry("eghogarbodor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.RECYCLE,3),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,7),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,12),
                        new MoveLearnSetEntry(Move.TOXIC,14),
                        new MoveLearnSetEntry(Move.SLUDGE,18),
                        new MoveLearnSetEntry(Move.STOCKPILE,23),
                        new MoveLearnSetEntry(Move.SWALLOW,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,29),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,34),
                        new MoveLearnSetEntry(Move.PROTECT,36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,40),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,47),
                        new MoveLearnSetEntry(Move.BELCH,50),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"egg"),
                        new MoveLearnSetEntry(Move.SPIKES,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN5),
                4, List.of(
                        new ItemDrop("minecraft:rotten_flesh",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        this.setLangFileName("Trubbish");

    }
}
