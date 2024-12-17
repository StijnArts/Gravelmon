package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.hub.*;

//done
public class HUB extends drai.dev.data.games.registry.Game {
    public HUB() {
        super("HUB");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Mobipup());
        addNewPokemon(new Nezutama());
        addNewPokemon(new Nuzzeltama());
        addNewPokemon(new Ovipter());
        addNewPokemon(new Hoppolat());
        addNewPokemon(new Brokenstein());
        addNewPokemon(new Monstricity());
        addNewPokemon(new Cadastrophe());
        addNewPokemon(new Gobblin());
        addNewPokemon(new Sheetrick());
        addNewPokemon(new Yokid());
        addNewPokemon(new Creshank());
        addNewPokemon(new Mushmol());
        addNewPokemon(new Mushpunky());
        addNewPokemon(new Mushilly());
        addNewPokemon(new Mushcary());
        addNewPokemon(new Sakurovix());
        addNewPokemon(new Nephelith());
        addPokedexPokemon("togepi-hubian, togetic-hubian, togekiss-hubian, smeargle-hubian");
    }

}
