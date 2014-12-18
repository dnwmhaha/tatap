package app.tatap.tatap;

import com.parse.ParseClassName;
import com.parse.ParseUser;

/**
 * Created by ethanswoo on 12/17/14.
 */
@ParseClassName("tatappUser")
public class TatapUser extends ParseUser {
    public void setPhoneNumber(String phoneNumber)
    {
        put("phoneNumber", phoneNumber);
    }

    public String getPhoneNumber()
    {
        return getString("phoneNumber");
    }
}

