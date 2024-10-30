package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.hub.*;

//done
public class HUB extends drai.dev.data.games.registry.Game {
    public HUB() {
        super("HUB");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Mobipup());
        pokemon.add(new Nezutama());
        pokemon.add(new Nuzzeltama());
        pokemon.add(new Ovipter());
        pokemon.add(new Hoppolat());
        pokemon.add(new Brokenstein());
        pokemon.add(new Monstricity());
        pokemon.add(new Cadastrophe());
        pokemon.add(new Gobblin());
        pokemon.add(new Sheetrick());
        pokemon.add(new Yokid());
        pokemon.add(new Creshank());
        pokemon.add(new Mushmol());
        pokemon.add(new Mushpunky());
        pokemon.add(new Mushilly());
        pokemon.add(new Mushcary());
        pokemon.add(new Sakurovix());
        pokemon.add(new Nephelith());
    }

}
