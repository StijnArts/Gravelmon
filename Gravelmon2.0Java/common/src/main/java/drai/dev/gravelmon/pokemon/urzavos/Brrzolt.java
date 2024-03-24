package drai.dev.gravelmon.pokemon.urzavos;

public class Brrzolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brrzolt() {
        super("Brrzolt",
                Type.ICE,Type.ELECTRIC,
                new Stats(90,
                        130,
                        70,
                        70,
                        55,
                        85),
                List.of(Ability.TOUGH_CLAWS,Ability.RECKLESS), Ability.UNNERVE,
                18, 1542,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This 'Mon's claws have adapted to be savagely serrated so it can cut through the thick fur and fat of its prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAVAGESLASH,40)                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brrzolt");

    }


}
