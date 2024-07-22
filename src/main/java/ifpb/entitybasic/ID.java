package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IID;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ID<T> implements IID {
    private final String id;

    @SafeVarargs
    public ID(T... args) {
        this.id = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("+","(",")"));
    }

    public boolean compareTo(ID compareId) {
        return this.id.equals(compareId.id);
    }
}
