package viikkotehtävä4;

/**
 * Created by Joonas on 23.7.2016.
 */
public interface JonoInterface<E> {

    public lisaaElementti(E, e);
    public E palauataElementti();
    public boolean onkoJonoTyhja();
    public boolean onkoJonoOlemassa();


}
