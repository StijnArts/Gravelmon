package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.oceane.*;

import java.util.*;
//done
public class Oceane extends drai.dev.data.games.registry.Game {
    public Oceane() {
        super("Oceane");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Bublit());
        addNewPokemon(new Nautilite());
        addNewPokemon(new Tentalcyon(new Stats(537, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Friney());
        addNewPokemon(new Ripplier());
        addNewPokemon(new Swordier());
        addNewPokemon(new Nomstar());
        addNewPokemon(new Disastar());
        addNewPokemon(new Ferossicle(new Stats(542, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
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
        addNewPokemon(new Bwobble());
        addNewPokemon(new Noxical());
        addNewPokemon(new Venomenace());
        addNewPokemon(new Octomuray(new Stats(484, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Cycaroon());
        addNewPokemon(new Argoceane());
        addNewPokemon(new Dreadtyde());
        addNewPokemon(new Abysside(new Stats(640, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))));
    }

}
