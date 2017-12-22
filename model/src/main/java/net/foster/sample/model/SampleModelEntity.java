/**
 * 
 * Copyright (c) 2013 On Center Software, Inc - All Rights Reserved
 *
 * SampleModelEntity.java 
 * 
 */
 


package net.foster.sample.model;

//~--- non-JDK imports --------------------------------------------------------

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Type;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//~--- classes ----------------------------------------------------------------

/**
 * Sample
 *
 *
 * @author         Daryl Foster    
 */
@ApiModel (
    value       = "SampleModelEntity",
    description = "This is a sample entity from the Model package."
)
@Entity
public class SampleModelEntity
        implements Serializable
{
    //~--- constructors -------------------------------------------------------

    /**
     * Constructs ...
     *
     */
    public SampleModelEntity () {}

    //~--- static fields ------------------------------------------------------

    private static final long serialVersionUID = 1L;

    //~--- fields -------------------------------------------------------------

    @Column (nullable = false)
    @ApiModelProperty (
        value    = "level",
        required = true
    )
    private Integer   level;
    @Column (length = 255)
    @ApiModelProperty (value = "description")
    private String    description;
    @Column (nullable = false)
    @ApiModelProperty (
        value    = "time",
        required = true
    )
    private Timestamp time;
    @Id
    @Column (
        unique   = true,
        nullable = false
    )
    @Type (type = "pg-uuid")
    @ApiModelProperty (
        value    = "id",
        readOnly = true,
        example  = "123e4567-e89b-12d3-a456-426655440000"
    )
    private UUID      sampleModelEntityId;

    //~--- get methods --------------------------------------------------------

    /**
     * Method description
     *
     *
     * @return
     */
    public String getDescription ()
    {
        return this.description;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public Integer getLevel ()
    {
        return this.level;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public UUID getSampleModelEntityId ()
    {
        return this.sampleModelEntityId;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public Timestamp getTime ()
    {
        return this.time;
    }

    //~--- set methods --------------------------------------------------------

    /**
     * Method description
     *
     *
     * @param description
     */
    public void setDescription (String description)
    {
        this.description = description;
    }

    /**
     * Method description
     *
     *
     * @param level
     */
    public void setLevel (Integer level)
    {
        this.level = level;
    }

    /**
     * Method description
     *
     *
     * @param sampleModelEntityId
     */
    public void setSampleModelEntityId (UUID sampleModelEntityId)
    {
        this.sampleModelEntityId = sampleModelEntityId;
    }

    /**
     * Method description
     *
     *
     * @param time
     */
    public void setTime (Timestamp time)
    {
        this.time = time;
    }
}
