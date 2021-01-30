package generics.playstation;

public class PlayStation {

    private final int versionNumber;
    private final String nickName;
    private final int releaseYear;

    // optional params
    private final int numSold;
    private final int numVariations;

    protected PlayStation(Builder builder) {
        versionNumber = builder.versionNumber;
        nickName = builder.nickName;
        releaseYear = builder.releaseYear;

        numSold = builder.numSold;
        numVariations = builder.numVariations;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumSold() {
        return numSold;
    }

    public int getNumVariations() {
        return numVariations;
    }


    public static class Builder {

        private final int versionNumber;
        private final String nickName;
        private final int releaseYear;

        // optional
        private int numSold = -1;
        private int numVariations = -1;

        public Builder(int versionNumber, String nickName, int releaseYear) {
            this.versionNumber = versionNumber;
            this.nickName = nickName;
            this.releaseYear = releaseYear;
        }

        public Builder numSold(int numSold) {
            this.numSold = numSold;
            return this;
        }

        public Builder numVariations(int numVariations) {
            this.numVariations = numVariations;
            return this;
        }

        public PlayStation build() {
            return new PlayStation(this);
        }
    }

}
