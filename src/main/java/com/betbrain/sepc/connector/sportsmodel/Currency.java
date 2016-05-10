package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Currency extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_code = "code";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _code;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public Currency() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getName() {
    
        return _name;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setName(String name) {
    
        _name = name;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getCode() {
    
        return _code;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setCode(String code) {
    
        _code = code;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
