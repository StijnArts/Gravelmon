package drai.dev.gravelmon.pokemon.fliga;

public class Larvhilt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larvhilt() {
        super("Larvhilt",
                Type.BUG,
                new Stats(50,
                        65,
                        40,
                        20,
                        30,
                        30),
                List.of(Ability.REGENERATOR), Ability.STEELY_SPIRIT,
                4, 14,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larvhilt often train each others' stingers by sparring, with the loser usually breaking their own and needing to regrow it. When they get tired, Larvhilt will climb to the tops of trees and stab themselves into it, falling asleep within the leaves."),
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
           setLangFileName("Larvhilt");

    }


}
