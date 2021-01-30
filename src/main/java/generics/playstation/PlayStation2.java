package generics.playstation;

import org.apache.commons.lang3.ArrayUtils;

@PlayStationVersion("2")
public class PlayStation2 extends PlayStation1 {

    private static final String[] ps2AddedGames = {
            "Bat man",
            "Starcraft"
    };

    protected PlayStation2(Builder builder){
        super(builder);
    }

    @Override
    public String[] getSupportedGames() {
        return ArrayUtils.addAll(super.getSupportedGames(), ps2AddedGames);
    }
}
