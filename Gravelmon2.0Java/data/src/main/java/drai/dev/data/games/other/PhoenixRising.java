package drai.dev.data.games;

import drai.dev.data.games.registry.*;

public class PhoenixRising extends Game {
    public PhoenixRising() {
        super("PhoenixRising");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon(
                "budew-relic," +
                        "roselia-relic," +
                        "roserade-relic," +
                        "spinda-relic," +
                        "koffing-relic," +
                        "weezing-relic," +
                        "skiddo-relic," +
                        "gogoat-relic," +
                        "aipom-relic," +
                        "ambipom-relic," +
                        "tentacool-relic," +
                        "tentacruel-relic," +
                        "ledyba-relic," +
                        "ledian-relic");
    }
}
