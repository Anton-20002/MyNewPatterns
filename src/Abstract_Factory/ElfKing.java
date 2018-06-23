package Abstract_Factory;

/**
 * Created by Anton on 11.06.2018.
 */
public class ElfKing implements King {
    public  String DESCRIPTION;
    @Override
    public String getDescription() {
        DESCRIPTION = getClass().getSimpleName();
        System.out.println(DESCRIPTION);
        return DESCRIPTION;
    }
}
