{
    name: "Esteritite",
    spritenum: 620,
    megaStone: "esterite-mega",
    megaEvolves: "esterite",
    itemUser: ["esterite"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10270: 760,
    gen: 6,
    isNonstandard: "Past"
}
