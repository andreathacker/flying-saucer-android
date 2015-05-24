package com.dat.flyingsaucer.data.dao;

import com.dat.flyingsaucer.data.model.BaseModel;

import java.util.List;

/**
 * Created by davidthacker on 5/23/15.
 */
public abstract class BaseDao<T extends BaseModel> {

    protected List<T> mModelList;

}
