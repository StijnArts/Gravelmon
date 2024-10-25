package drai.dev.data.games.instagram.fra;

import drai.dev.data.pokemon.borazul.*;

public class Borazul extends drai.dev.data.games.registry.Game {
    public Borazul() {
        super("borazul");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Fruibat().setUsesBigModel()); //Renamed from Fruibat
        pokemon.add(new Foliwing().setUsesBigModel());
        pokemon.add(new Acairadon().setUsesBigModel());
        pokemon.add(new Coaliz().setUsesBigModel());
        pokemon.add(new Sizzlick().setUsesBigModel());
        pokemon.add(new Apoiformer().setUsesBigModel());
        pokemon.add(new Seaquin().setUsesBigModel());
        pokemon.add(new Equamarin().setUsesBigModel());
        pokemon.add(new Aquavallo().setUsesBigModel());
        pokemon.add(new Humbird().setUsesBigModel());
        pokemon.add(new Paradivia().setUsesBigModel());
        pokemon.add(new Pitic().setUsesBigModel());
        pokemon.add(new Shelpa().setUsesBigModel());
        pokemon.add(new Moskiringe().setUsesBigModel());
        pokemon.add(new Hibiskiss().setUsesBigModel());
        pokemon.add(new Glamamela().setUsesBigModel());
        pokemon.add(new Rootkie().setUsesBigModel());
        pokemon.add(new Bambooton().setUsesBigModel());
    }

}
