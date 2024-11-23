package drai.dev.data.games.instagram.fra;

import drai.dev.data.pokemon.borazul.*;

public class Borazul extends drai.dev.data.games.registry.Game {
    public Borazul() {
        super("borazul");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Drubat().setUsesBigModel()); //Renamed from Fruibat
        addNewPokemon(new Foliwing().setUsesBigModel());
        addNewPokemon(new Acairadon().setUsesBigModel());
        addNewPokemon(new Coaliz().setUsesBigModel());
        addNewPokemon(new Sizzlick().setUsesBigModel());
        addNewPokemon(new Apoiformer().setUsesBigModel());
        addNewPokemon(new Seaquin().setUsesBigModel());
        addNewPokemon(new Equamarin().setUsesBigModel());
        addNewPokemon(new Aquavallo().setUsesBigModel());
        addNewPokemon(new Humbird().setUsesBigModel());
        addNewPokemon(new Paradivia().setUsesBigModel());
        addNewPokemon(new Pitic().setUsesBigModel());
        addNewPokemon(new Shelpa().setUsesBigModel());
        addNewPokemon(new Moskiringe().setUsesBigModel());
        addNewPokemon(new Hibiskiss().setUsesBigModel());
        addNewPokemon(new Glamamela().setUsesBigModel());
        addNewPokemon(new Rootkie().setUsesBigModel());
        addNewPokemon(new Bambooton().setUsesBigModel());
    }

}
