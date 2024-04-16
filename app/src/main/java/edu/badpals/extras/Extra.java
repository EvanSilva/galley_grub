package edu.badpals.extras;

import java.util.Optional;

public abstract class Extra {

    static final String CHEESE = "";
    static final String SAUCE = "";
    static final String SIZE_LARGE = "";
    static String extraProduct = "";
    static Optional<Extra> nextExtra ;

    public Extra () {
    }

    public Object setNextExtra(Extra extra){
        return null;
    };

}
