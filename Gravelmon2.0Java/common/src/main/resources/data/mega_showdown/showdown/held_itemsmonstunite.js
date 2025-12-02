{
    name: "Monstunite",
    spritenum: 620,
    megaStone: "monstune-mega",
    megaEvolves: "monstune",
    itemUser: ["monstune"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10223: 760,
    gen: 6,
    isNonstandard: "Past"
}
