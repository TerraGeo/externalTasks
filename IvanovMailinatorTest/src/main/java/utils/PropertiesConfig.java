package utils;


import org.apache.commons.codec.binary.Base64;
import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

/**
 * Created by Billy on 12/18/2016.
 */
@Resource.Classpath("testing.properties")
public class PropertiesConfig {
    public static final PropertiesConfig INSTANCE = new PropertiesConfig();

    @Property("home.page")
    private String homePage;
    @Property("user.login")
    private String iuaLogin;
    @Property("user.password")
    private String iuaPassword;

    private PropertiesConfig() {
        PropertyLoader.populate(this);
    }
    public static PropertiesConfig getInstance(){
        return INSTANCE;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getIuaLogin() {
        return iuaLogin;
    }

    public String getIuaPassword() {
        return new String(Base64.decodeBase64(iuaPassword));
    }
}
