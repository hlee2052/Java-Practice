package generics.playstation;

import org.apache.commons.lang3.ArrayUtils;

@PlayStationVersion("3")
public class PlayStation3 extends PlayStation2 {

    private static final String[] ps2AddedGames = {
            "Kart rider",
            "Cyberpunk 1337"
    };

    protected PlayStation3(Builder builder){
        super(builder);
    }

    @Override
    public String[] getSupportedGames() {
        return ArrayUtils.addAll(super.getSupportedGames(), ps2AddedGames);
    }
}
