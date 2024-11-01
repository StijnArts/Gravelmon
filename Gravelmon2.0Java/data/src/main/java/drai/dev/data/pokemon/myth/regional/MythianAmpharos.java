package drai.dev.data.pokemon.myth.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MythianAmpharos extends Pokemon {
    public MythianAmpharos(String name, Aspect aspect) {
        super(name, aspect,"MythianAmpharos",
                Type.FIRE, Type.DARK,
                new Stats(90,75,85,55,115,90),
                List.of(Ability.FLAME_BODY), Ability.SPEED_BOOST,
                3, 18,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                230, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("The tail's tip shines brightly and can be seen from far away. It acts as a beacon for lost people."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WILLOWISP,4),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.BULK_UP,11),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.NIGHTBALL,18),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,22),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,39),
                        new MoveLearnSetEntry(Move.DARK_PULSE,43),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,46),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,55),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.FLATTER,"egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"egg")
                ),
                List.of(Label.GEN2,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 30, 51, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Ampharos");
    }
}
