package Analysis;

public class HaikuPoem {
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    public HaikuPoem(String firstLine, String secondLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    @Override
    public String toString() {
        return "HaikuPoem:\n" +
                 firstLine +"\n" +
                 secondLine + "\n" +
                thirdLine;
    }
}
