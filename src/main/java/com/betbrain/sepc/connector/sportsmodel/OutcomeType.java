package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class OutcomeType extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_hasParamFloat1 = "hasParamFloat1";
    public static final String PROPERTY_NAME_paramFloat1Description = "paramFloat1Description";
    public static final String PROPERTY_NAME_hasParamFloat2 = "hasParamFloat2";
    public static final String PROPERTY_NAME_paramFloat2Description = "paramFloat2Description";
    public static final String PROPERTY_NAME_hasParamFloat3 = "hasParamFloat3";
    public static final String PROPERTY_NAME_paramFloat3Description = "paramFloat3Description";
    public static final String PROPERTY_NAME_hasParamBoolean1 = "hasParamBoolean1";
    public static final String PROPERTY_NAME_paramBoolean1Description = "paramBoolean1Description";
    public static final String PROPERTY_NAME_hasParamString1 = "hasParamString1";
    public static final String PROPERTY_NAME_paramString1Description = "paramString1Description";
    public static final String PROPERTY_NAME_paramString1PossibleValues = "paramString1PossibleValues";
    public static final String PROPERTY_NAME_hasParamParticipantId1 = "hasParamParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId1Description = "paramParticipantId1Description";
    public static final String PROPERTY_NAME_paramParticipant1MustBePrimary = "paramParticipant1MustBePrimary";
    public static final String PROPERTY_NAME_paramParticipant1MustBeRoot = "paramParticipant1MustBeRoot";
    public static final String PROPERTY_NAME_paramParticipant1MustHaveRoleId = "paramParticipant1MustHaveRoleId";
    public static final String PROPERTY_NAME_hasParamParticipantId2 = "hasParamParticipantId2";
    public static final String PROPERTY_NAME_paramParticipantId2Description = "paramParticipantId2Description";
    public static final String PROPERTY_NAME_paramParticipant2MustBePrimary = "paramParticipant2MustBePrimary";
    public static final String PROPERTY_NAME_paramParticipant2MustBeRoot = "paramParticipant2MustBeRoot";
    public static final String PROPERTY_NAME_paramParticipant2MustHaveRoleId = "paramParticipant2MustHaveRoleId";
    public static final String PROPERTY_NAME_hasParamParticipantId3 = "hasParamParticipantId3";
    public static final String PROPERTY_NAME_paramParticipantId3Description = "paramParticipantId3Description";
    public static final String PROPERTY_NAME_paramParticipant3MustBePrimary = "paramParticipant3MustBePrimary";
    public static final String PROPERTY_NAME_paramParticipant3MustBeRoot = "paramParticipant3MustBeRoot";
    public static final String PROPERTY_NAME_paramParticipant3MustHaveRoleId = "paramParticipant3MustHaveRoleId";
    public static final String PROPERTY_NAME_hasParamEventPartId1 = "hasParamEventPartId1";
    public static final String PROPERTY_NAME_paramEventPartId1Description = "paramEventPartId1Description";
    public static final String PROPERTY_NAME_minParticipantRelations = "minParticipantRelations";
    public static final String PROPERTY_NAME_maxParticipantRelations = "maxParticipantRelations";

	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private String _description;
	private Boolean _hasParamFloat1;
	private String _paramFloat1Description;
	private Boolean _hasParamFloat2;
	private String _paramFloat2Description;
	private Boolean _hasParamFloat3;
	private String _paramFloat3Description;
	private Boolean _hasParamBoolean1;
	private String _paramBoolean1Description;
    private Boolean _hasParamString1;
	private String _paramString1Description;
	private String _paramString1PossibleValues;
	private Boolean _hasParamParticipantId1;
	private String _paramParticipantId1Description;
	private boolean _paramParticipant1MustBePrimary;
    private boolean _paramParticipant1MustBeRoot;
    private Long _paramParticipant1MustHaveRoleId;
	private Boolean _hasParamParticipantId2;
	private String _paramParticipantId2Description;
    private boolean _paramParticipant2MustBePrimary;
    private boolean _paramParticipant2MustBeRoot;
    private Long _paramParticipant2MustHaveRoleId;
	private Boolean _hasParamParticipantId3;
	private String _paramParticipantId3Description;
    private boolean _paramParticipant3MustBePrimary;
    private boolean _paramParticipant3MustBeRoot;
    private Long _paramParticipant3MustHaveRoleId;
	private Boolean _hasParamEventPartId1;
	private String _paramEventPartId1Description;
	private int _minParticipantRelations;
	private int _maxParticipantRelations;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public OutcomeType() {
		
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

    public String getDescription() {
        
        return _description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setDescription(String description) {
        
        _description = description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasParamFloat1() {
        
        return _hasParamFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamFloat1(Boolean hasParamFloat1) {
        
        _hasParamFloat1 = hasParamFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamFloat1Description() {
        
        return _paramFloat1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat1Description(String paramFloat1Description) {
        
        _paramFloat1Description = paramFloat1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamFloat2() {
        
        return _hasParamFloat2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamFloat2(Boolean hasParamFloat2) {
        
        _hasParamFloat2 = hasParamFloat2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamFloat2Description() {
        
        return _paramFloat2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat2Description(String paramFloat2Description) {
        
        _paramFloat2Description = paramFloat2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasParamFloat3() {
        
        return _hasParamFloat3;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamFloat3(Boolean hasParamFloat3) {
        
        _hasParamFloat3 = hasParamFloat3;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamFloat3Description() {
        
        return _paramFloat3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat3Description(String paramFloat3Description) {
        
        _paramFloat3Description = paramFloat3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasParamBoolean1() {
        
        return _hasParamBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamBoolean1(Boolean hasParamBoolean1) {
        
        _hasParamBoolean1 = hasParamBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamBoolean1Description() {
        
        return _paramBoolean1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamBoolean1Description(String paramBoolean1Description) {
        
        _paramBoolean1Description = paramBoolean1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasParamString1() {
        
        return _hasParamString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamString1(Boolean hasParamString1) {
        
        _hasParamString1 = hasParamString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamString1Description() {
        
        return _paramString1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamString1Description(String paramString1Description) {
        
        _paramString1Description = paramString1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamString1PossibleValues() {
        
        return _paramString1PossibleValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamString1PossibleValues(String paramString1PossibleValues) {
        
        _paramString1PossibleValues = paramString1PossibleValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamParticipantId1() {
        
        return _hasParamParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId1(Boolean hasParamParticipantId1) {
        
        _hasParamParticipantId1 = hasParamParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamParticipantId1Description() {
        
        return _paramParticipantId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId1Description(String paramParticipantId1Description) {
        
        _paramParticipantId1Description = paramParticipantId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getParamParticipant1MustBePrimary() {
        
        return _paramParticipant1MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant1MustBePrimary(boolean paramParticipant1MustBePrimary) {
        
        _paramParticipant1MustBePrimary = paramParticipant1MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getParamParticipant1MustBeRoot() {
        
        return _paramParticipant1MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant1MustBeRoot(boolean paramParticipant1MustBeRoot) {
        
        _paramParticipant1MustBeRoot = paramParticipant1MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamParticipant1MustHaveRoleId() {
        
        return _paramParticipant1MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant1MustHaveRoleId(Long paramParticipant1MustHaveRoleId) {
        
        _paramParticipant1MustHaveRoleId = paramParticipant1MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasParamParticipantId2() {
        
        return _hasParamParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId2(Boolean hasParamParticipantId2) {
        
        _hasParamParticipantId2 = hasParamParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamParticipantId2Description() {
        
        return _paramParticipantId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId2Description(String paramParticipantId2Description) {
        
        _paramParticipantId2Description = paramParticipantId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getParamParticipant2MustBePrimary() {
        
        return _paramParticipant2MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant2MustBePrimary(boolean paramParticipant2MustBePrimary) {
        
        _paramParticipant2MustBePrimary = paramParticipant2MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getParamParticipant2MustBeRoot() {
        
        return _paramParticipant2MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant2MustBeRoot(boolean paramParticipant2MustBeRoot) {
        
        _paramParticipant2MustBeRoot = paramParticipant2MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamParticipant2MustHaveRoleId() {
        
        return _paramParticipant2MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant2MustHaveRoleId(Long paramParticipant2MustHaveRoleId) {
        
        _paramParticipant2MustHaveRoleId = paramParticipant2MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamParticipantId3() {
        
        return _hasParamParticipantId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId3(Boolean hasParamParticipantId3) {
        
        _hasParamParticipantId3 = hasParamParticipantId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamParticipantId3Description() {
        
        return _paramParticipantId3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId3Description(String paramParticipantId3Description) {
        
        _paramParticipantId3Description = paramParticipantId3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public boolean getParamParticipant3MustBePrimary() {
        
        return _paramParticipant3MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant3MustBePrimary(boolean paramParticipant3MustBePrimary) {
        
        _paramParticipant3MustBePrimary = paramParticipant3MustBePrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getParamParticipant3MustBeRoot() {
        
        return _paramParticipant3MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant3MustBeRoot(boolean paramParticipant3MustBeRoot) {
        
        _paramParticipant3MustBeRoot = paramParticipant3MustBeRoot;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamParticipant3MustHaveRoleId() {
        
        return _paramParticipant3MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipant3MustHaveRoleId(Long paramParticipant3MustHaveRoleId) {
        
        _paramParticipant3MustHaveRoleId = paramParticipant3MustHaveRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamEventPartId1() {
        
        return _hasParamEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamEventPartId1(Boolean hasParamEventPartId1) {
        
        _hasParamEventPartId1 = hasParamEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamEventPartId1Description() {
        
        return _paramEventPartId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEventPartId1Description(String paramEventPartId1Description) {
        
        _paramEventPartId1Description = paramEventPartId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public int getMinParticipantRelations() {
        
        return _minParticipantRelations;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMinParticipantRelations(int minParticipantRelations) {
        
        _minParticipantRelations = minParticipantRelations;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public int getMaxParticipantRelations() {
        
        return _maxParticipantRelations;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMaxParticipantRelations(int maxParticipantRelations) {
        
        _maxParticipantRelations = maxParticipantRelations;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}