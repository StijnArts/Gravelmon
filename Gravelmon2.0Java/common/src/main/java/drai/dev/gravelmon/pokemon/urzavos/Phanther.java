package drai.dev.gravelmon.pokemon.urzavos;

public class Phanther extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phanther() {
        super("Phanther",
                Type.GRASS,Type.GHOST,
                new Stats(82,
                        110,
                        80,
                        92,
                        64,
                        102),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                19, 118,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("All that is left of Phanther's mortal self is its pelt, which it carries with it. Despite its ruthless battle style, it is a loyal to its trainer and loves to sleep in moonbeams."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Phanther");

    }


}
