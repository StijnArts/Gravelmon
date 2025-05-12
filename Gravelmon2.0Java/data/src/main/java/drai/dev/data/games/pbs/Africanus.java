package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.africanus.*;

public class Africanus extends drai.dev.data.games.registry.Game {
    public Africanus() {
        super("Africanus");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon("Slowpoke-africanus, "+
        "Slowbro-africanus, "+
                "Slowking-africanus, "+
        "Ponyta-africanus, "+
        "Rapidash-africanus, "+
        "Tauros-africanus, "+
        "Machop-africanus, "+
        "Machoke-africanus, "+
        "Machamp-africanus, "+
        "Phanpy-africanus, "+
        "Donphan-africanus, "+
        "Bronzor-africanus, "+
        "Bronzong-africanus, "+
        "Cherubi-africanus, "+
        "Cherrim-africanus, "+
        "Kricketot-africanus, "+
        "Kricketune-africanus, "+
        "Gothita-africanus, "+
        "Gothorita-africanus, "+
        "Gothitelle-africanus, "+
        "Honedge-africanus, "+
        "Doublade-africanus, "+
        "Aegislash-africanus, "+
        "Comfey-africanus");
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
