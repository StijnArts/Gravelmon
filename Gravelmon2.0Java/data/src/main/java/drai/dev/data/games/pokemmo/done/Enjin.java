package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Enjin extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Enjin();
    private Enjin() {
        super("Enjin");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Mouldon());
        addNewPokemon(new Fungrove());
        addNewPokemon(new Saprodon());
        addNewPokemon(new Gastrohm());
        addNewPokemon(new Mollectric());
        addNewPokemon(new Nudibolt());
//        addNewPokemon(new Arborsa());   Member of line Not Finished
//        addNewPokemon(new Fumostrello());   Member of line Not Finished
//        addNewPokemon(new Salamare());   Member of line Not Finished
//        addNewPokemon(new Seefowl());   Member of line Not Finished
//        addNewPokemon(new Hamstorch());   Member of line Not Finished
//        addNewPokemon(new Hippop());   Member of line Not Finished
//        addNewPokemon(new Faunifer());   Member of line Not Finished
//        addNewPokemon(new Sirain());   Member of line Not Finished
//        addNewPokemon(new Budbun());    Member of line Not Finished
        addNewPokemon(new EnjinnianHoothoot("", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianNoctowl("", Aspect.ENJINNIAN));
        addNewPokemon(new Enchantowl());
//        addNewPokemon(new Chimini());  Member of line Not Finished
//        addNewPokemon(new Aquamel());   Member of line Not Finished
//        addNewPokemon(new Cattack());   Member of line Not Finished
//        addNewPokemon(new Feilex()); Member of line Not Finished
        addNewPokemon(new Paintta());
        addNewPokemon(new Piscasso());
        addNewPokemon(new Bistodum(new Stats(354, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Coldfin(new Stats(354, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Raveclem());
        addNewPokemon(new Galats(new Stats(340, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Coldier(new Stats(330, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new EnjinnianSableye("Sableye", Aspect.ENJINNIAN));
        addNewPokemon(new Eyeziant());
        addNewPokemon(new Ghostea());
        addPokedexPokemon("sinistea, polteageist");
        addNewPokemon(new Bihaund());
        addNewPokemon(new Serpendage());
        addNewPokemon(new Jerbalm());
        addNewPokemon(new Kiwatt(new Stats(408, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Kikiwi());
        addNewPokemon(new Magmaraca());
        addNewPokemon(new Magmaligna(new Stats(423, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Queenival(new Stats(365, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Punky(new Stats(345, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Slamb(new Stats(367, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Roselot(new Stats(387, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Rosival(new Stats(387, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Roswain(new Stats(387, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Snooz());
        addPokedexPokemon("drowzee");
        addNewPokemon(new EnjinnianDrowzee("", Aspect.ENJINNIAN));
        addPokedexPokemon("hypno");
        addNewPokemon(new EnjinnianHypno("", Aspect.ENJINNIAN));
        addNewPokemon(new Tenwreck());
//        addNewPokemon(new Snouturf());Member of line Not Finished
        addNewPokemon(new Volverdi(new Stats(324, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Curstar());
        addNewPokemon(new Shihtzoof());
        addNewPokemon(new Priminpup(new Stats(432, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Cucuppy(new Stats(350, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Gremelon());
        addNewPokemon(new Skoopy());
        addNewPokemon(new Thornip(new Stats(332, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Nostroot());
        addNewPokemon(new Khthonion());
        addNewPokemon(new Sloggin());
        addNewPokemon(new Lucidris());
        addNewPokemon(new Chlorodra());
        addNewPokemon(new Cocoward());
        addNewPokemon(new Cocombat());
        addNewPokemon(new EnjinnianElectrike("", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianManectric("", Aspect.ENJINNIAN));
        addNewPokemon(new Lunectric());
        addNewPokemon(new Spikid());
        addNewPokemon(new Matchoppa());
        addNewPokemon(new Wotter(new Stats(354, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Cyclub(new Stats(342, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Angeroid(new Stats(352, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Teleprog());
        addNewPokemon(new Clampere(new Stats(340, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Balbuni(new Stats(356, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Criseti());
        addNewPokemon(new Anseti());
        addNewPokemon(new Macrochip(new Stats(343, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Vipuny());
        addNewPokemon(new Vipentide());
        addNewPokemon(new Pterabonk());
        addNewPokemon(new Smashzal());
        addNewPokemon(new Dullahaunt());
        addNewPokemon(new Gossnow());
        addNewPokemon(new Curdwaul());
        addNewPokemon(new Cubreeze());
        addNewPokemon(new Frosstitan());
        addNewPokemon(new Waddlur());
        addNewPokemon(new Cuddlur());
        addNewPokemon(new Abysprit());
        addNewPokemon(new Marvelisk());
        addNewPokemon(new Nuptielle());
        addNewPokemon(new Burielle(new Stats(600, StatArchetype.ALL_ROUND, List.of())));
        addNewPokemon(new Aristocalf());
        addNewPokemon(new Majestapir(new Stats(540, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
    }

}
