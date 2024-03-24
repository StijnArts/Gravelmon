package drai.dev.gravelmon.pokemon.fliga;

public class Calaloof extends drai.dev.gravelmon.pokemon.Pokemon {
    public Calaloof() {
        super("Calaloof",
                Type.NORMAL,
                new Stats(52,
                        58,
                        47,
                        59,
                        55,
                        44),
                List.of(Ability.CUTE_CHARM,Ability.STICKY_HOLD), Ability.OWN_TEMPO,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Calaloof are timid Pokémon, and like to hide most of their face within discarded bags. These scaredy-pods are capable of a light hypnosis by shifting colors on their suction pods, but this has proven less effective on Pokémon of higher intelligence."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Calaloof");

    }


}
