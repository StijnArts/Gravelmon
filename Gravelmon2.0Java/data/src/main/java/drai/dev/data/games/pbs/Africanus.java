package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.africanus.*;

public class Africanus extends drai.dev.data.games.registry.Game {
    public Africanus() {
        super("Africanus");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Petiolis());
        addNewPokemon(new Virilis());
        addNewPokemon(new Lupercalis());
        addNewPokemon(new Harregg());
        addNewPokemon(new Igneagle());
        addNewPokemon(new Imperiavem());
        addNewPokemon(new Hipporos());
        addNewPokemon(new Equxic());
        addNewPokemon(new Marecampus());
        addNewPokemon(new Houndplut());
        addNewPokemon(new Fawniae());
    }

}
