package drai.dev.data.games.pokengine;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Oceane extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Oceane();
    private Oceane() {
        super("Oceane", "https://pokengine.org/collections/10s2nypf/Oceane");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Bublit().addLabels(Label.STARTER));
        addNewPokemon(new Nautilite().addLabels(Label.STARTER));
        addNewPokemon(new Tentalcyon(new Stats(537, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.STARTER));
        addNewPokemon(new Friney().addLabels(Label.STARTER));
        addNewPokemon(new Ripplier().addLabels(Label.STARTER));
        addNewPokemon(new Swordier().addLabels(Label.STARTER));
        addNewPokemon(new Nomstar().addLabels(Label.STARTER));
        addNewPokemon(new Disastar().addLabels(Label.STARTER));
        addNewPokemon(new Ferossicle(new Stats(542, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).addLabels(Label.STARTER));
        addNewPokemon(new Planten());
        addNewPokemon(new Handren());
        addNewPokemon(new Digdog());
        addNewPokemon(new Groundhound(new Stats(432, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Sweal());
        addNewPokemon(new Fleezer());
        addNewPokemon(new Swirlsea());
        addNewPokemon(new Spirashell());
        addNewPokemon(new Sealestial());
        addNewPokemon(new Urchum());
        addNewPokemon(new Urtichum());
        addNewPokemon(new Parrosea());
        addNewPokemon(new Nauticaw());
        addNewPokemon(new Coronacaw());
        addNewPokemon(new Reefam());
        addNewPokemon(new Appendash());
        addNewPokemon(new Nutsy());
        addNewPokemon(new Jawson());
        addNewPokemon(new Merbebi());
        addNewPokemon(new Shrimpnotize(new Stats(457, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Phantamaron(new Stats(423, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Rayscal());
        addNewPokemon(new Rayth());
        addNewPokemon(new Minusplus());
        addNewPokemon(new Siphonowar());
        addNewPokemon(new Uphonowar());
        addNewPokemon(new Cachaleen());
        addNewPokemon(new Submalot());
        addNewPokemon(new Porpice());
        addNewPokemon(new Balacier());
        addNewPokemon(new Armacle());
        addNewPokemon(new Barbarrage());
        addNewPokemon(new Snaptrap());
        addNewPokemon(new Snaggrip());
        addNewPokemon(new Merluscious());
        addNewPokemon(new Spunch());
        addNewPokemon(new Upporecut());
        addNewPokemon(new Twintacle());
        addNewPokemon(new Undallure());
        addNewPokemon(new Ghoubloon());
        addNewPokemon(new Drenchest());
        addNewPokemon(new Medissin());
        addNewPokemon(new Mambaboo());
        addNewPokemon(new Floink());
//        addNewPokemon(new AFloink()); Missing Stats
        addNewPokemon(new Hypnode());
        addNewPokemon(new Cupscape());
        addNewPokemon(new Nodescape());
        addNewPokemon(new Reefazoid());
        addNewPokemon(new Amusea());
        addNewPokemon(new Finfetti());
        addNewPokemon(new Harlefin(new Stats(517, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Ziptide());
        addNewPokemon(new Moreen());
        addNewPokemon(new Salpackin(new Stats(376, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
//        addNewPokemon(new ASalpackin()); Missing Stats
        addNewPokemon(new Eletta());
        addNewPokemon(new Sentresha());
        addNewPokemon(new Origalleon());
        addNewPokemon(new Tatatot());
        addNewPokemon(new Drumbum());
        addNewPokemon(new Symphonia());
        addNewPokemon(new Camozoic());
        addNewPokemon(new Churlice());
        addNewPokemon(new Torchurn());
        addNewPokemon(new Altarath());
        addNewPokemon(new Topsee());
        addNewPokemon(new Hallucid());
        addNewPokemon(new Spectrance());
        addNewPokemon(new Grasstache());
        addNewPokemon(new Papalgae());
        addNewPokemon(new Lavrassire());
        addNewPokemon(new Mamagma());
        addNewPokemon(new Kellyp());
        addNewPokemon(new Ferrush(new Stats(498, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Bwobble().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Noxical().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Venomenace().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Octomuray(new Stats(484, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Cycaroon().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Argoceane().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Dreadtyde().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Abysside(new Stats(640, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.LEGENDARY));
    }

}
