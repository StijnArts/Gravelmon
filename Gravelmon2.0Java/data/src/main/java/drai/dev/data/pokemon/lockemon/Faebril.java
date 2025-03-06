package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Faebril extends Pokemon {
    public Faebril() {
        super("Faebril",
                Type.ELECTRIC, Type.FAIRY,
                new Stats(180,
                        10,
                        60,
                        60,
                        110,
                        60),
                List.of(Ability.HEALER, Ability.POWER_ABOVE), Ability.REGENERATOR,
                13, 1231,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE, EggGroup.FAIRY),
                List.of("By touching a pokemon or human with their wings, they can send healing pulses through them. They also are very strong defibrillator, even being able to start the heart of Wailord."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,15),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,20),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,25),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,30),
                        new MoveLearnSetEntry(Move.RECOVER,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.HEALING_WISH,45),
                        new MoveLearnSetEntry(Move.HEAL_BELL,50),
                        new MoveLearnSetEntry(Move.WISH,55),
                        new MoveLearnSetEntry(Move.THUNDER,60),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 45, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
    }
}
