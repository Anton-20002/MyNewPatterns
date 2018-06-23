package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class OrcArmy implements Army {
    @Override
    public String getDescription() {
        return getClass().getSimpleName();
    }
}
