package generics.playstation;

@PlayStationVersion("1")
public class PlayStation1 extends PlayStation {

    private static final String[] supportedGames = {
            "Mario Kart",
            "Bomber Man"
    };

    protected PlayStation1(Builder builder){
        super(builder);
    }

    public String[] getSupportedGames() {
        return supportedGames.clone();
    }
}
