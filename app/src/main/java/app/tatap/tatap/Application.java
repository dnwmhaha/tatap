package app.tatap.tatap;

import android.content.Context;
import android.content.SharedPreferences;

import com.parse.Parse;


/**
 * Created by Hyunduck on 12/9/2014.
 */
public class Application extends android.app.Application{
    private static SharedPreferences preferences;
    private static ConfigHelper configHelper;

    public Application(){    }

    public void onCreate(){
        super.onCreate();

        Parse.initialize(this, "CrCxATKAAZ5B2b8iEqwPQzIV73HvHQORjEYErRHn",
                "7FcGe956dRWKQ7QikN7f3n89MIE9EVmR4nyA28mg");

        preferences = getSharedPreferences("con.", Context.MODE_PRIVATE);

        configHelper = new ConfigHelper();
        configHelper.fetchConfigNeeded();
    }

    public static ConfigHelper getConfigHelper()
    {
        return configHelper;
    }

}
