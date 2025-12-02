{
    name: "Carnivinite",
    spritenum: 620,
    megaStone: "carnivine-mega",
    megaEvolves: "carnivine",
    itemUser: ["carnivine"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10229: 760,
    gen: 6,
    isNonstandard: "Past"
}
