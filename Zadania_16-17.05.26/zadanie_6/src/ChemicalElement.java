public class ChemicalElement {

    private String name;
    private String symbol;
    private int atomicNumber;

    public ChemicalElement(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    //gettery
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public boolean isAnAlkaliMetal() {
        return atomicNumber == 3 || atomicNumber == 11 || atomicNumber == 19 ||
                atomicNumber == 37 || atomicNumber == 55 || atomicNumber == 87;
    }

    public boolean isATransitionMetal() {
        return (atomicNumber >= 21 && atomicNumber <= 31) ||
                (atomicNumber >= 39 && atomicNumber <= 48) ||
                (atomicNumber >= 72 && atomicNumber <= 80) ||
                (atomicNumber >= 104 && atomicNumber <= 112);
    }

    public boolean isAMetal() {
        return atomicNumber == 13 || atomicNumber == 49 || atomicNumber == 50 ||
                atomicNumber == 81 || atomicNumber == 82 || atomicNumber == 83 ||
                atomicNumber == 113 || atomicNumber == 114 || atomicNumber == 115;
    }
}
