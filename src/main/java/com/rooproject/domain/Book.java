package com.rooproject.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Book {

    /**
     */
    @NotNull
    private String BookID;

    /**
     */
    @NotNull
    private String title;

    /**
     */
    @NotNull
    private String Author;

    /**
     */
    @NotNull
    private String ISBN;
}
