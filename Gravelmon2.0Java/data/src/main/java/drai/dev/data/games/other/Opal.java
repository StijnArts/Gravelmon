package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.opalo.*;

public class Opal extends Game {
    public Opal() {
        super("Opal");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon(("venomoth-cefiran, Diglett-cefiran, Dugtrio-cefiran, Meowth-cefiranice, " +
                "Persian-cefiranice, Meowth-cefiranfire, Persian-cefiranfire, Meowth-cefiranelectric, Persian-cefiranelectric, " +
                "Teddiursa-cefiran, Ursaring-cefiran, Slugma-cefiran, Magcargo-cefiran, " +
                "Delibird-cefiran, Smeargle-cefiran, Makuhita-cefiran, Hariyama-cefiran, " +
                "Sableye-cefiran, Numel-cefiran, Camerupt-cefiran, Vibrava-cefiran, Flygon-cefiran, " +
                "Snorunt-cefiran, Glalie-cefiran, buneary-cefiran, lopunny-cefiran, Froslass-cefiran, Snover-cefiran, Abomasnow-cefiran, " +
                "Petilil-cefiran, Lilligant-cefiran, Gothitelle-cefiran, Golett-cefiran, Golurk-cefiran, " +
                "Klefki-cefiran, Falinks-cefiran").toLowerCase());
        addNewPokemon(new Snampery());
        addNewPokemon(new Descargot());
        addNewPokemon(new Gastesla());
        addNewPokemon(new Flasinge());
        addNewPokemon(new Shaboon());
        addNewPokemon(new Lunaye());
        addNewPokemon(new Swolphin());
        addNewPokemon(new Norspear());
        addNewPokemon(new Narvalor());
        addNewPokemon(new Cefireon());

        addNewPokemon(new Polekin());
        addNewPokemon(new Fungorse());
        addNewPokemon(new Cervantrier());
        addNewPokemon(new Lugnis());
        addNewPokemon(new Luravit());
        addNewPokemon(new Luxpiravit());
        addNewPokemon(new Quisquite());
        addNewPokemon(new Gambarrel());
        addNewPokemon(new Bogaleon());
        addNewPokemon(new Astrem());
        addNewPokemon(new Unktena());
    }
}
