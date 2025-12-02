{
    name: "Empoleonite",
    spritenum: 620,
    megaStone: "empoleon-mega",
    megaEvolves: "empoleon",
    itemUser: ["empoleon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10207: 760,
    gen: 6,
    isNonstandard: "Past"
}
