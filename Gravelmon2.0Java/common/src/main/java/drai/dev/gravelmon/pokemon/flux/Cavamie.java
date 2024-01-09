package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cavamie extends Pokemon {
    public Cavamie() {
        super("Cavamie",
                Type.NORMAL,
                new Stats(70,
                        20,
                        55,
                        40,
                        45,
                        20),
                List.of(Ability.FRIEND_GUARD, Ability.OBLIVIOUS), Ability.UNAWARE,
                4, 120,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FAIRY),
                List.of("A cheerful, mild-natured Pokémon that is agreeable and affectionate to all. Their friendly attitude makes them popular as family pets."),
                List.of(new EvolutionEntry("capymigo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,6),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.REST,12),
                        new MoveLearnSetEntry(Move.SNORE,12),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.YAWN,18),
                        new MoveLearnSetEntry(Move.HEART_STAMP,21),
                        new MoveLearnSetEntry(Move.PROTECT,24),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,27),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,30),
                        new MoveLearnSetEntry(Move.SLACK_OFF,33),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,36),
                        new MoveLearnSetEntry(Move.WISH,39),
                        new MoveLearnSetEntry(Move.SUPER_FANG,42),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,45),
                        new MoveLearnSetEntry(Move.NUZZLE,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
