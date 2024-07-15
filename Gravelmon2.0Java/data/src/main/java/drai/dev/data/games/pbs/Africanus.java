package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.africanus.*;

public class Africanus extends drai.dev.data.games.registry.Game {
    public Africanus() {
        super("Africanus");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Petiolis());
        pokemon.add(new Virilis());
        pokemon.add(new Lupercalis());
        pokemon.add(new Harregg());
        pokemon.add(new Igneagle());
        pokemon.add(new Imperiavem());
        pokemon.add(new Hipporos());
        pokemon.add(new Equxic());
        pokemon.add(new Marecampus());
        pokemon.add(new Houndplut());
        pokemon.add(new Fawniae());
    }

}
