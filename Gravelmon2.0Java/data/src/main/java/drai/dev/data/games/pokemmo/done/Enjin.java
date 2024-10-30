package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.enjin.Enchantowl;
import drai.dev.data.pokemon.enjin.Teleprog;
import drai.dev.data.attributes.*;

import java.util.*;
//done
public class Enjin extends drai.dev.data.games.registry.Game {
    public Enjin() {
        super("Enjin");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Mouldon());
        pokemon.add(new Fungrove());
        pokemon.add(new Saprodon());
        pokemon.add(new Gastrohm());
        pokemon.add(new Mollectric());
        pokemon.add(new Nudibolt());
//        pokemon.add(new Arborsa());   Member of line Not Finished
//        pokemon.add(new Fumostrello());   Member of line Not Finished
//        pokemon.add(new Salamare());   Member of line Not Finished
//        pokemon.add(new Seefowl());   Member of line Not Finished
//        pokemon.add(new Hamstorch());   Member of line Not Finished
//        pokemon.add(new Hippop());   Member of line Not Finished
//        pokemon.add(new Faunifer());   Member of line Not Finished
//        pokemon.add(new Sirain());   Member of line Not Finished
//        pokemon.add(new Budbun());    Member of line Not Finished
        pokemon.add(new Enchantowl());
//        pokemon.add(new Chimini());  Member of line Not Finished
//        pokemon.add(new Aquamel());   Member of line Not Finished
//        pokemon.add(new Cattack());   Member of line Not Finished
//        pokemon.add(new Feilex()); Member of line Not Finished
        pokemon.add(new Paintta());
        pokemon.add(new Piscasso());
        pokemon.add(new Bistodum(new Stats(354, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Coldfin(new Stats(354, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Raveclem());
        pokemon.add(new Galats(new Stats(340, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Coldier(new Stats(330, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        pokemon.add(new Eyeziant());
        pokemon.add(new Ghostea());
        pokemon.add(new Bihaund());
        pokemon.add(new Serpendage());
        pokemon.add(new Jerbalm());
        pokemon.add(new Kiwatt(new Stats(408, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Kikiwi());
        pokemon.add(new Magmaraca());
        pokemon.add(new Magmaligna(new Stats(423, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Queenival(new Stats(365, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Punky(new Stats(345, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Slamb(new Stats(367, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Roselot(new Stats(387, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Rosival(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Roswain(new Stats(387, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Snooz());
        pokemon.add(new Tenwreck());
//        pokemon.add(new Snouturf());Member of line Not Finished
        pokemon.add(new Volverdi(new Stats(324, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Curstar());
        pokemon.add(new Shihtzoof());
        pokemon.add(new Priminpup(new Stats(432, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new Cucuppy(new Stats(350, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Gremelon());
        pokemon.add(new Skoopy());
        pokemon.add(new Thornip(new Stats(332, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Nostroot());
        pokemon.add(new Khthonion());
        pokemon.add(new Sloggin());
        pokemon.add(new Lucidris());
        pokemon.add(new Chlorodra());
        pokemon.add(new Cocoward());
        pokemon.add(new Cocombat());
        pokemon.add(new Lunectric());
        pokemon.add(new Spikid());
        pokemon.add(new Matchoppa());
        pokemon.add(new Wotter(new Stats(354, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Cyclub(new Stats(342, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        pokemon.add(new Angeroid(new Stats(352, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Teleprog());
        pokemon.add(new Clampere(new Stats(340, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Balbuni(new Stats(356, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Criseti());
        pokemon.add(new Anseti());
        pokemon.add(new Macrochip(new Stats(343, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new Vipuny());
        pokemon.add(new Vipentide());
        pokemon.add(new Pterabonk());
        pokemon.add(new Smashzal());
        pokemon.add(new Dullahaunt());
        pokemon.add(new Gossnow());
        pokemon.add(new Curdwaul());
        pokemon.add(new Cubreeze());
        pokemon.add(new Frosstitan());
        pokemon.add(new Waddlur());
        pokemon.add(new Cuddlur());
        pokemon.add(new Abysprit());
        pokemon.add(new Marvelisk());
        pokemon.add(new Nuptielle());
        pokemon.add(new Burielle(new Stats(600, StatArchetype.ALL_ROUND, List.of())));
        pokemon.add(new Aristocalf());
        pokemon.add(new Majestapir(new Stats(540, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
    }

}
