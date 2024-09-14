package ifpb.repositories.interfaces;

import ifpb.entitybasic.interfaces.IID;

import java.util.List;

public interface IRepository<T> {
    void add(T content);
    void update(IID id, T content);
    void remove(IID id);
    T[] getAll();
    T getById(IID id);
}
