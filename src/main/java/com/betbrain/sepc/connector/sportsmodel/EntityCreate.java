package com.betbrain.sepc.connector.sportsmodel;

/**
 * Represents a Sports Model entity create.
 * 
 * @author Morten Helles
 */

public class EntityCreate extends EntityChange {
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private Entity _entity;
    
    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------
    
    public EntityCreate(Entity entity) {

        _entity = entity;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public Entity getEntity() {

        return _entity;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    @Override
    public Class<? extends Entity> getEntityClass() {

        return _entity.getClass();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}