package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
public interface JonoInterface<E> {

    public void lisaaElementti(E e);
    public void palautaElementti();
    public boolean onkoJonoTyhja();
    public boolean onkoJonoOlemassa();


}
