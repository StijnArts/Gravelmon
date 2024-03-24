package drai.dev.gravelmon.pokemon.fliga;

public class Cutlassp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cutlassp() {
        super("Cutlassp",
                Type.BUG,Type.FLYING,
                new Stats(60,
                        120,
                        50,
                        50,
                        70,
                        95),
                List.of(Ability.INFILTRATOR), Ability.STEELY_SPIRIT,
                10, 82,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Waspieres form nests in the damp forests with their own kind. They carry their stingers as sabers, wielding them with intense precision. Waspieres are very competitive, and will spare with just about anything until they either faint or pass out from exhaustion."),
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
           setLangFileName("Cutlassp");

    }


}
