package xyz.wagyourtail.jsmacros.client.api.sharedinterfaces;

import java.util.function.Function;

/**
 * @author Etheradon
 * @since 1.6.5
 */
public interface IFilter<T> extends Function<T, Boolean> {

    @Override
    Boolean apply(T t);

}
