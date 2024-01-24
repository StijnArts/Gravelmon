package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tutu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tutu() {
        super("Tutu",
                Type.FAIRY,Type.FIGHTING,
                new Stats(44,
                        80,
                        55,
                        100,
                        81,
                        110),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("- Play Nice Normal - Quick Attack Normal 5 Fairy WindSTAB Fairy 9 Follow Me Normal 13 Charm Fairy 18 Rapid Spin Normal 20 Silver Wind Bug 23 Rainbow GustSTAB Fairy 25 Jump KickSTAB Fighting 29 Feather Dance Flying 33 Shadow Dance Ghost 38 Moonlight Fairy 40 Feather Rush Flying 45 High Jump KickSTAB Fighting 48 Quiver Dance Bug 50 MoonblastSTAB Fairy 53 Spotlight Normal 60 Healing Wish Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,9),
                        new MoveLearnSetEntry(Move.CHARM,13),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,18),
                        new MoveLearnSetEntry(Move.SILVER_WIND,20),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,23),
                        new MoveLearnSetEntry(Move.JUMP_KICK,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,29),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,33),
                        new MoveLearnSetEntry(Move.MOONLIGHT,38),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,40),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,45),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,53),
                        new MoveLearnSetEntry(Move.HEALING_WISH,60),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PARADISEDISPLAY,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tutu");

    }


}
