package drai.dev.gravelmon.pokemon.otopo;

public class Toxipine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Toxipine() {
        super("Toxipine",
                Type.POISON,
                new Stats(60,
                        40,
                        50,
                        30,
                        45,
                        50),
                List.of(Ability.POISON_POINT,Ability.RUN_AWAY), Ability.TOXIC_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It glides around the woodland floor, gathering up berries as it goes. Despite its little size, its toxin is quite lethal."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxipine");

    }


}
