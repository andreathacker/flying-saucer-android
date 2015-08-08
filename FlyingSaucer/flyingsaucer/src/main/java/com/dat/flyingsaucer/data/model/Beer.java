package com.dat.flyingsaucer.data.model;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by davidthacker on 5/21/15.
 */
public class Beer implements BaseModel {

    public static final String CAN = "can";
    public static final String BOTTLE = "bottle";
    public static final String DRAFT = "draft";

    @StringDef({CAN, BOTTLE, DRAFT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Container {}

    public String title;
    public String description;
    public String style;
    public @Container String container;
    public String brewer;
    public String city;
    public String country;

    public Beer(){
        super();
    }

}
