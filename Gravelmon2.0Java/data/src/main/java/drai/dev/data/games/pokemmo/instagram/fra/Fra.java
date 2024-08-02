package drai.dev.data.games.pokemmo.instagram.fra;


import drai.dev.data.pokemon.fra.*;

public class Fra extends drai.dev.data.games.registry.Game {
    public Fra() {
        super("fra");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Yuvixy().setUsesBigModel());
        pokemon.add(new Kyubicane().setUsesBigModel());
        pokemon.add(new Awootic().setUsesBigModel());
        pokemon.add(new Huskinu().setUsesBigModel());
        pokemon.add(new Burrolar().setUsesBigModel());
        pokemon.add(new Potling().setUsesBigModel());
        pokemon.add(new Potthos().setUsesBigModel());
        pokemon.add(new Gardelem().setUsesBigModel());
        pokemon.add(new Kaizora().setUsesBigModel());
        pokemon.add(new Duozora().setUsesBigModel());
        pokemon.add(new Trizedora().setUsesBigModel());
        pokemon.add(new Fiestavia().setUsesBigModel());
        pokemon.add(new Pipengi().setUsesBigModel());
        pokemon.add(new Volantile().setUsesBigModel());
        pokemon.add(new Dradivetl().setUsesBigModel());
    }

}
