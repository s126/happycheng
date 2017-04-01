package edu.nf.dazhaohui.base;

import java.util.List;

public interface BasicDao {

    int save(BasicModel model);

    int update(BasicModel model);

    int delete(Object key);

    BasicModel findById(Object key);

    BasicModel findOne(BasicModel model);

    List<? extends BasicModel> find(BasicModel model);

    List<? extends BasicModel> findAll();

    long count();

}
