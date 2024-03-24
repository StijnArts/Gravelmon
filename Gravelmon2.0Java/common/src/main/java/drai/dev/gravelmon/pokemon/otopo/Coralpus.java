package drai.dev.gravelmon.pokemon.otopo;

public class Coralpus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coralpus() {
        super("Coralpus",
                Type.WATER,Type.GRASS,
                new Stats(75,
                        75,
                        75,
                        105,
                        105,
                        45),
                List.of(Ability.HYDRATION), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,0,1,1,0), 0,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Coralpus is a sea creature that can be discovered stranded on the beach. They can remove kelp from their moustache and use it to make bandages for injured Pokemon, and their kelp is prized by hunters for its medical powers."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coralpus");

    }


}
