package com.dat.flyingsaucer.data.model;

/**
 * Created by davidthacker on 5/23/15.
 */
public class StoreBeerItem implements BaseModel{

    public String id;
    public String name;
    public @Beer.Container String container;

    public StoreBeerItem() {
        super();
    }
}
